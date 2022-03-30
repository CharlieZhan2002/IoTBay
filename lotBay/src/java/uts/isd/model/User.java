/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author zhang
 */
public class User {
    private String Username;
    private String Useremail;
    private String Userpassword;
    private String Userdob;

    public User(String Username, String Useremail, String Userpassword, String Userdob) {
        this.Username = Username;
        this.Useremail = Useremail;
        this.Userpassword = Userpassword;
        this.Userdob = Userdob;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getUseremail() {
        return Useremail;
    }

    public void setUseremail(String Useremail) {
        this.Useremail = Useremail;
    }

    public String getUserpassword() {
        return Userpassword;
    }

    public void setUserpassword(String Userpassword) {
        this.Userpassword = Userpassword;
    }

    public String getUserdob() {
        return Userdob;
    }

    public void setUserdob(String Userdob) {
        this.Userdob = Userdob;
    }
    
    
}
