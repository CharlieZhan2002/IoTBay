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
    private String CustMobNo; 
    private String CustAccess;
   
  public Customer (String CustEmail, String CustPwd, String CustFullName, String CustMobNo){
      this.CustEmail = CustEmail;
      this.CustPwd = CustPwd;
      this.CustFullName = CustFullName;
      this.CustMobNo = CustMobNo; 
  }
  public Customer (String CustFullName, String CustEmail, String CustPwd, String CustShippingAddr, String CustAccess, String CustMobNo){ 
      this.CustFullName = CustFullName;
      this.CustEmail = CustEmail;
      this.CustPwd = CustPwd;
      this.CustShippingAddr = CustShippingAddr;
      this.CustAccess = CustAccess; 
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
  
  public String getCustMobNo(){
      return CustMobNo;
  }
  
  public void setCustMobNo(String CustMobNo){
      this.CustMobNo = CustMobNo;
  }
  
  public String getCustAccess (){
      return CustAccess;
  }
  
  public void setCustAccess(String CustAccess){
      this.CustAccess = CustAccess;
  }
  
  @Override
    public String toString() {
        return "Customer{" +
                "CustFullName='" + CustFullName + '\'' +
                ", CustEmail='" + CustEmail + '\'' +
                ", CustPwd='" + CustPwd + '\'' +
                ", CustShippingAddr='" + CustShippingAddr + '\'' +
                ", CustAccess='" + CustAccess + '\'' +
                ", CustMobNo='" + CustMobNo + '\'' +
                '}';
    }
  
}
  