import java.util.*;
import java.io.*;

public class CSC251Project_Nhui_Siu {
    public static void main(String[] args) throws IOException{

        //Creating variable and setting them
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
        int numOfPolicyMade = 0;

        //Calling the policy information in my local drive
        File file = new File("C:\\Users\\Nhuis\\OneDrive\\Desktop\\GithubProject\\CSC251Project\\PolicyInformation.txt");
        Scanner scanner = new Scanner(file);

        //Creating array list for PolicyHolder
        ArrayList<PolicyHolder> policies = new ArrayList<>();

        //Checking the policy information and setting them to each variable
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

            //calls the PolicyHolder class and storing them info related to a policyholder
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName, policyHolder);
            //add it to the array list
            policies.add(policy.getPolicyHolder());

        }
        
        for(int i = 0; i < policies.size(); i++) {
            numOfPolicyMade++;
            System.out.println(policies.get(i));
            //check for the status if smoker or non-smoker
            if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) {
                smoker += 1;
            }
            else {
                nonSmoker += 1;
            }
        }

        System.out.println("\nThere were " + numOfPolicyMade + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smoker);
        System.out.println("The number of policies with a smoker is: " + nonSmoker);

    }
}