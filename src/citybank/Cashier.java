package citybank;

public class Cashier extends User {

    private String cashierId;
    private String address;
    private String gender;

    public Cashier(String csId,String n, String g, String a,String un, String pass){
        this.cashierId=csId;
        this.name=n;
        this.gender=g;
        this.address=a;
        this.username=un;
        this.password=pass;
        this.userType="cashier";
    }
    public String getGender(){
        return this.gender;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCashierId(){
        return this.cashierId;
    }
}
