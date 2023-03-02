/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybank;

public class User {
    public String name,userType,username, password;
    
    public User(){}
    
    public User(String n, String emp,String user, String pass){
        username=user;
        password=pass;
        name=n;
        userType=emp;
    } 
    public void setUserType(){};
    
    public String getname() {
        return name;
    }

    public String getuserType() {
        return userType;
    }

    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }
}

