USE IoTBay;
CREATE TABLE ShoppingCart{
    shipmentID INT(10),
    userID INT(10),
    anonID INT(10),
    trackNo INT(20),
    userShippingDetail VARCHAR(80),
    anonShippingDetail VARCHAR(80),
    orderID INT(10),
    ETA DATE(8),
    DOA DATE(8),
    shipmentStatus VARCHAR(50)
};