USE IoTBay;
CREATE TABLE ShoppingCart{
    customerID INT(10),
    accountID INT(10),
    productID INT(10),
    productPrice FLOAT(5),
    productNum INT(5),
    oderProductNum INT(5),
    orderDate DATE(8),
    orderPayDate DATE(8),
    orderinvoiceDate DATE(8),
    orderDiscount BOOLEAN(2),
    orderStatus BOOLEAN(2),
    orderRecord VARCHAR(200),
};