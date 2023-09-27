// Creating Insurance Policy class for getter and setter
import java.util.Scanner;

public class Policy {
    public int policyNumber;
    public String providerName;
    public String firstName;
    public String lastName;
    public int age;
    public String smokingStatus;
    public double height;
    public double weight;
    Scanner userInput = new Scanner(System.in);


   /**
   Getter and Setter Method
   */
   //@return user first name
    public String getFirstName() {
        return firstName;
    }
    //@param firstName is the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    //@return user lastname
    public String getLastName() {
        return lastName;
    }
    
    //@param lastName is the last name      
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //@return Age get the user age
    public int getAge() {
        return age;
    }
    
    //@param age is the user age
    public void setAge(int age) {
        this.age = age;
    }
    
    //@return Smoking status
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    //@param smokingStatus user status if smoking or not
    public void setSmokingStatus(String smokingStatus) {
    
    }
    
    //@return height
    public double getHeight() {
        return height;
    }
    
    //@param height user height
    public void setHeight(double height) {
        this.height = height;
    }
    
    //@return weight
    public double getWeight() {
        return weight;
    }
    
    //@param weight user wieght
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //@return policy number
    public int getPolicyNumber() {
        return policyNumber;
    }
    
    //@param policyNumber user policy number
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    //@return provider name
    public String getProviderName() {
        return providerName;
    }
    
    //@param providerName user provider name
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    /**
    @weight
    @height
    @return result bmi of weight divide by height
    */
    public double bmi(double weight, double height) {
        return (weight * 703) / (height * height);
    }
    
    /**
    @age
    @smoker
    @bmi
    @return the result of the price for age and smoker
    */
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
    
    
    public void displayInformation() {
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