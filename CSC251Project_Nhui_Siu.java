public class CSC251Project_Nhui_Siu {
    public static void main(String[] args) {
        InsurancePolicy policy = new InsurancePolicy();
        policy.setPolicyNumber(0);
        policy.setProviderName("");
        policy.setFirstName("");
        policy.setLastName("");
        policy.setAge(0);
        policy.setSmokingStatus("");
        policy.setHeight(0);
        policy.setWeight(0);

        double bmi = policy.bmi(policy.getWeight(), policy.getHeight());
        double price = policy.priceOfInsurancePolicy(policy.getAge(), policy.getSmokingStatus(), bmi);
        policy.displayInformation(bmi, price);
        System.out.print(bmi);


    }
}