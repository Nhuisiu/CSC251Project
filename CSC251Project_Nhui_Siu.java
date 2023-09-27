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
    }
}