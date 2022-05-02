package uts.isd.model;

import java.util.Date;

public class Customer {
    private String email;
    private String userPassword;
    private String fullName;
    private String dateOfBirth;

    public Customer(String email, String userPassword, String fullName, String dateOfBirth) {
        this.email = email;
        this.userPassword = userPassword;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
