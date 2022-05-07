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
    private String CustFullName;
    private String CustEmail;
    private String CustPwd;
    private String CustShippingAddr;
    private int CustMobNo; 
   
  public Customer (String CustFullName, String CustEmail, String CustPwd, String CustShippingAddr, int CustMobNo){
      this.CustFullName = CustFullName;
      this.CustEmail = CustEmail;
      this.CustPwd = CustPwd;
      this.CustShippingAddr = CustShippingAddr;
      this.CustMobNo = CustMobNo;
  }
  
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
  
  public int getCustMobNo(){
      return CustMobNo;
  }
  
  public void setCustMobNo(int CustMobNo){
      this.CustMobNo = CustMobNo;
  }
  
}
  
