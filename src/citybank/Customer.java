package citybank;

public class Customer extends User {

    String accountNumber;
    String customerId;
    String address;
    String gender;
    String bankAccountType;
    String blanceDetails;

    public Customer(String cuId, String n, String g, String a, String acn, String bat, String bd, String un, String pass) {
        this.customerId = cuId;
        this.name = n;
        this.gender = g;
        this.address = a;
        this.accountNumber = acn;
        this.bankAccountType = bat;
        this.blanceDetails = bd;
        this.username = un;
        this.password = pass;
        this.userType = "customer";
    }
    public void setUserType(){
        this.userType="customer";
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getBankAccountType(){
        return this.bankAccountType;
    }
    public String getGender(){
        return this.gender;
    }
    public String getAddress(){
        return this.address;
    }
    public String getBlanceDetails(){
        return this.blanceDetails;
    }
    
}
