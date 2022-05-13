/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

   package uts.isd.controller;

   import java.io.Serializable;
   import java.util.regex.Matcher;
   import java.util.regex.Pattern;


   public class Validator_Payment implements Serializable{ 

 
   private String paymentMethodPattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
   private String cardNamePattern = "([A-Z][a-z]+[\\s])+[A-Z][a-z]*";       
   private String cardNumberPattern = "[0-9]{4,}";       
   private String cardBSBPattern = "[0-9]{0,4}";      
   private String expireDatePattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
   private String totalPricePattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
   private String paymentDatePattern = "([a-zA-Z0-9]+)(([._-])([a-zA-Z0-9]+))*(@)([a-z]+)(.)([a-z]{3})((([.])[a-z]{0,2})*)";      
          
   public Validator_Payment(){    }       


   public boolean validate(String pattern, String input){       
      Pattern regEx = Pattern.compile(pattern);       
      Matcher match = regEx.matcher(input);       

      return match.matches(); 

   }       

 

   public boolean checkEmpty(String cardNumber, String cardName, String cardBSB,String expireDate,String totalPrice,String paymentDate){       

      return  cardNumber.isEmpty() || cardName.isEmpty() || cardBSB.isEmpty() || expireDate.isEmpty() || totalPrice.isEmpty() || paymentDate.isEmpty();

   }

   
   public boolean validatePayementMethod(String paymentMethod){                       

      return validate(paymentMethodPattern,paymentMethod);   

   }

       
   public boolean validateCardName(String cardName){

      return validate(cardNamePattern,cardName); 

   }       
   

   public boolean validateCardNumber(String cardNumber){

      return validate(cardNumberPattern,cardNumber); 

   }          
 public boolean validateCardBSB(String cardBSB){

      return validate(cardBSBPattern,cardBSB); 

   }       
 public boolean validateExpireDate(String expireDate){

      return validate(expireDatePattern,expireDate); 

   }       
    public boolean validateTotalPrice(String totalPrice){

      return validate(totalPricePattern,totalPrice); 

   }       
    public boolean validatePaymentDate(String paymentDate){

      return validate(paymentDatePattern,paymentDate); 
   }       
   
   
}