/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.isd.model;

/**
 *
 * @author huasongwen
 */
public class Shipment {
    private String Details;
    private String orderID;
    private String ETA;
    private boolean Status;
    private String shipmentID;

    public Shipment( String shipmentID,String orderID, String Details, String ETA, boolean Status) {
        this.shipmentID = shipmentID;
        this.Details = Details;
        this.orderID = orderID;
        this.ETA = ETA;
        this.Status = Status;
    }

    public String getshipmentID() {
        return shipmentID;
    }

    public void setshipmentID(String shipmentID) {
        this.shipmentID = shipmentID;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    
    public String getorderID() {
        return orderID;
    }

    public void setorderID(String orderID) {
        this.orderID = orderID;
    }

   public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }
    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
    
    }
    
    

