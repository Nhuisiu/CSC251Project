import java.util.*;
import java.io.*;

public class CSC251Project_Nhui_Siu {
    public static void main(String[] args) throws IOException{
        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int smoker = 0;
        int nonSmoker = 0;
        double bmi = 0;
        double price = 0;

        File file = new File("PolicyInformation.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<Policy> policies = new ArrayList<>();

        while(scanner.hasNext()) {
            policyNumber = scanner.nextInt();
            scanner.nextLine();
            providerName = scanner.nextLine();
            firstName = scanner.nextLine();
            lastName = scanner.nextLine();
            age = scanner.nextInt();
            scanner.nextLine();
            smokingStatus = scanner.nextLine();
            height = scanner.nextDouble();
            weight = scanner.nextDouble();

            Policy policy1 = new Policy(policyNumber, providerName, firstName,lastName, age, smokingStatus, height, weight);
            policies.add(policy1);

        }
        for(int i = 0; i < policies.size(); i++) {
            System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policies.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight());
            System.out.println("Policyholder's Weight " + policies.get(i).getWeight());
            bmi = policies.get(i).bmi(policies.get(i).getWeight(), policies.get(i).getHeight());
            System.out.printf("Policyholder's BMI: %.2f", bmi);
            price = policies.get(i).priceOfInsurancePolicy(policies.get(i).getAge(), policies.get(i).smokingStatus, bmi);
            System.out.println("");
            System.out.printf("Policy Price: %.2f", price);
            System.out.println("");
            System.out.println("");
            
            if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) {
                smoker += 1;
            }
            else {
                nonSmoker += 1;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("The number of policies with a smoker is: " + smoker);
        System.out.println("The number of policies with a smoker is: " + nonSmoker);

    }
}