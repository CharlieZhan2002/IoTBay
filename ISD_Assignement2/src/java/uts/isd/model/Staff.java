/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author huasongwen
 */

public class Staff {
    private String staffEmail;
    private String staffPassword;
    private String staffName;

    public Staff() {
    }

    public Staff(String staffEmail, String staffPassword, String staffName) {
        this.staffEmail = staffEmail;
        this.staffPassword = staffPassword;
        this.staffName = staffName;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffEmail='" + staffEmail + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", staffName='" + staffName + '\'' +
                '}';
    }
}

