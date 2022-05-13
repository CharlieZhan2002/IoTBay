/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author huasongwen
 */
public class Order {
    private int orderID;
    private String customerEmail;
    private Boolean status;
    private String generateDate;
    private String quanlity;
    
    public Order() {
    }

    public Order(int orderID, String customerEmail, Boolean status, String generateDate, String quanlity) {
        this.orderID = orderID;
        this.customerEmail = customerEmail;
        this.status = status;
        this.generateDate = generateDate;
        this.quanlity = quanlity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    public String getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(String quanlity) {
        this.quanlity = quanlity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerEmail='" + customerEmail + '\'' +
                ", status=" + status +
                ", generateDate='" + generateDate + '\'' +
                ", quanlity='" + quanlity + '\'' +
                '}';
    }
}

