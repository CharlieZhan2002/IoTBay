/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * PAYEMNT is  a JavaBean that stores paymentID,orderID,userID,paymenttype,totalPrice,
 * AccName,AccBSB,expireDate,paymentdate,anonID,accNumber.
 */
package uts.isd.model;

/**
 *
 * @author Mengjiao Wang
 */
public class PAYMENT {
    private Integer paymentID;
    private Integer orderID;
    private String paymentMethod;
    private String cardName;
    private String cardBSB;
    private String cardNumber;
    private String expireDate;
    private String totalPrice;
    private String paymentDate;

    //insert a construction that initializes the fields


    public PAYMENT() {
    }

    public PAYMENT(Integer paymentID, Integer orderID, String paymentMethod, String cardName, String cardBSB, String cardNumber, String expireDate, String totalPrice, String paymentDate) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.cardName = cardName;
        this.cardBSB = cardBSB;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.totalPrice = totalPrice;
        this.paymentDate = paymentDate;
    }

    //insert gettters/setters
    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardBSB() {
        return cardBSB;
    }

    public void setCardBSB(String cardBSB) {
        this.cardBSB = cardBSB;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "PAYMENT{" +
                "paymentID=" + paymentID +
                ", orderID=" + orderID +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", cardName='" + cardName + '\'' +
                ", cardBSB='" + cardBSB + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }
}
 
   