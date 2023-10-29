public class PolicyHolder {
    //Creating variables
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    //accepting arg with constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;

    }

    //to avoid security holes we make a clone of a constructor
    public PolicyHolder(PolicyHolder policyHolderCopy) {
        firstName = policyHolderCopy.firstName;
        lastName = policyHolderCopy.lastName;
        age = policyHolderCopy.age;
        smokingStatus = policyHolderCopy.smokingStatus;
        height = policyHolderCopy.height;
        weight = policyHolderCopy.weight;
    }


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

    /**
     @weight
     @height
     @return result bmi of weight divide by height
     */
    public double getbmi() {
        return (weight * 703) / (height * height);
    }

    /**
     @age
     @smoker
     @bmi
     @return the result of the price for age and smoker
     */
    public double priceOfInsurancePolicy() {
        final double BASEFEE = 600;
        final double MAX_AGE = 50;
        final double SMOKER = 100;
        final double BMI = 35;

        double fee = BASEFEE;

        if(age > MAX_AGE) {
            fee += 75;
        }
        if(smokingStatus.equalsIgnoreCase("smoker")){
            fee += SMOKER;
        }
        if(getbmi() > BMI) {
            fee += ((getbmi() - BMI) * 20);
        }

        return fee;
    }

    //convert to String format
    public String toString() {
        return String.format("\nPolicyholder's First Name: " + firstName +
                "\nPolicyholder's Last Name: " + lastName +
                "\nPolicyholder's Age: " + age +
                "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
                "\nPolicyholder's Height: %,.1f inches\n" +
                "Policyholder's Weight: %,.1f pounds\n" +
                "Policyholder's BMI: %,.2f\n" +
                "Policy Price: $%,.2f\n", height, weight, getbmi(), priceOfInsurancePolicy());
    }
}
