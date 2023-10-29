// Creating Insurance Policy class for getter and setter

public class Policy {

    private int policyNumber;
    private String providerName;

    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    //convert to String method
    public String toString() {
        return String.format("Policy Number: " + policyNumber +
                "\nProvider Name: " + providerName);
    }

}
