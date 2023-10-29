public class Policy {

    //creating private variable
    private static int numOfPolicyMade = 0;

    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    //accepting arg constructor
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
    }
    
    // @return policy number
    public int getPolicyNumber() {
        return policyNumber;
    }

    //@param policyNumber
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    //@return providername
    public String getProviderName() {
        return providerName;
    }

    //@param providerName
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    //@return policy holder
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    //@param policyHolder
    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    //@return number of policy made
    public static int getNumOfPolicyMade() {
        return numOfPolicyMade;
    }

    //convert to String method
    public String toString() {
        return String.format("Policy Number: " + policyNumber +
                "\nProvider Name: " + providerName + policyHolder);
    }

}