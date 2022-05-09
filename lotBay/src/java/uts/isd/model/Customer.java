/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author ettas
 */
public class Customer {
    //private String CustID;
    private String CustFullName;
    private String CustEmail;
    private String CustPwd;
    private String CustShippingAddr;
    private String CustMobNo; 
   
  public Customer (String CustFullName, String CustEmail, String CustPwd, String CustShippingAddr, String CustMobNo){
     // this.CustID = CustID;
      this.CustFullName = CustFullName;
      this.CustEmail = CustEmail;
      this.CustPwd = CustPwd;
      this.CustShippingAddr = CustShippingAddr;
      this.CustMobNo = CustMobNo;
  }
  
 /* public String getCustID(){
      return CustID;
  }
  
  public void setCustID(String CustID){
      this.CustID = CustID;
  }*/
  
  public String getCustFullName(){
      return CustFullName;
  }
  
  public void setCustFullName(String CustFullName){
      this.CustFullName = CustFullName;
  }
  
  public String getCustEmail(){
      return CustEmail;
  }
  
  public void setCustEmail(String CustEmail){
      this.CustEmail = CustEmail;
  }
  
  public String getCustPwd(){
      return CustPwd;
  }
  
  public void setCustPwd(String CustPwd){
      this.CustPwd = CustPwd;
  }
  
  public String getCustShippingAddr(){
      return CustShippingAddr;
  }
  
  public void setCustShippingAddr(String CustShippingAddr){
      this.CustShippingAddr = CustShippingAddr;
  }
  
  public String getCustMobNo(){
      return CustMobNo;
  }
  
  public void setCustMobNo(String CustMobNo){
      this.CustMobNo = CustMobNo;
  }
  
}
  