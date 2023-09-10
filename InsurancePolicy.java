// Creating Insurance Policy class for getter and setter
import java.util.Scanner;

public class InsurancePolicy {
    public int policyNumber;
    public String providerName;
    public String firstName;
    public String lastName;
    public int age;
    public String smokingStatus;
    public double height;
    public double weight;
    Scanner userInput = new Scanner(System.in);


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.print("Please enter the Policyholder’s First Name: ");
        firstName = userInput.nextLine();
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.print("Please enter the Policyholder’s Last Name: ");
        lastName = userInput.nextLine();
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.print("Please enter the Policyholder’s Age: ");
        age = userInput.nextInt();
        this.age = age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {

        int loop = 1;
        while (loop == 1) {
            System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
            userInput.nextLine();
            smokingStatus = userInput.nextLine();
            if (smokingStatus.equalsIgnoreCase("smoker")) {
                this.smokingStatus = smokingStatus;
                loop = 0;
            } else if (smokingStatus.equalsIgnoreCase("non-smoker")) {
                this.smokingStatus = smokingStatus;
                loop = 0;
            }else {
                System.out.println("Please enter smoker or non-smoker");
            }
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        height = userInput.nextDouble();
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        weight = userInput.nextDouble();
        this.weight = weight;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        System.out.print("Please enter the Policy Number: ");
        policyNumber = userInput.nextInt();
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        System.out.print("Please enter the Provider Name: ");
        userInput.nextLine();
        providerName = userInput.nextLine();
        this.providerName = providerName;
    }

    public double bmi(double weight, double height) {
        weight = getWeight();
        height = getHeight();
        return (weight * 703) / (height * height);
    }

    public double priceOfInsurancePolicy(int age, String smoker, double bmi) {
        double BASEFEE = 600;
        double fee = BASEFEE;
        age = getAge();
        smoker = getSmokingStatus();
        bmi = bmi(getWeight(), getHeight());
        if (age > 50){
            fee += 50;
        } else {
            fee += 0;
        }
        if (smoker.equalsIgnoreCase("smoker")){
            fee += 100;
        } else {
            fee += 0;
        }
        if (bmi > 35) {
            fee += (bmi - 35) * 20;
        } else {
            fee += 0;
        }

        return fee;
    }

    public void displayInformation(double bmi, double price) {
        System.out.print("\nPolicy Number: " + getPolicyNumber());
        System.out.print("\nProvider Name: " + getProviderName());
        System.out.print("\nPolicyholder’s First Name: " + getFirstName());
        System.out.print("\nPolicyholder’s Last Name: " + getLastName());
        System.out.print("\nPolicyholder’s Age: " + getAge());
        System.out.print("\nPolicyholder’s Smoking Status: " + getSmokingStatus());
        System.out.print("\nPolicyholder’s Height: " + getHeight());
        System.out.print("\nPolicyholder’s Weight: " + getWeight());
        System.out.printf("\nPolicyholder’s BMI: %.2f", bmi);
        System.out.printf("\nPolicy Price: %.2f", price);
    }

}