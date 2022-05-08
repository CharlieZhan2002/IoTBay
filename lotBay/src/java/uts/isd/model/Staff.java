/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author ettas
 */
public class Staff {
    private String StaffFullName;
    private String StaffEmail;
    private String StaffPwd;
    private int StaffMobNo;
   
  public Staff (String StaffFullName, String StaffEmail, String StaffPwd, int StaffMobNo){
      this.StaffFullName = StaffFullName;
      this.StaffEmail = StaffEmail;
      this.StaffPwd = StaffPwd;
      this.StaffMobNo = StaffMobNo;
  }
  
  public String getStaffFullName(){
      return StaffFullName;
  }
  
  public void setStaffFullName(String StaffFullName){
      this.StaffFullName = StaffFullName;
  }
  
  public String getStaffEmail(){
      return StaffEmail;
  }
  
  public void setStaffEmail(String StaffEmail){
      this.StaffEmail = StaffEmail;
  }
  
  public String getStaffPwd(){
      return StaffPwd;
  }
  
  public void setStaffPwd(String StaffPwd){
      this.StaffPwd = StaffPwd;
  }
 
  public int getStaffMobNo(){
      return StaffMobNo;
  }
  
  public void setStaffMobNo(int StaffMobNo){
      this.StaffMobNo = StaffMobNo;
  }
}
