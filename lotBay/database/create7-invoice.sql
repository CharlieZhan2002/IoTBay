USE IoTBay;
CREATE TABLE Invoice{
    invoiceID INT(10),
    userID INT(10),
    anonID INT(10),
    dateOfPay DATE(8),
    invoiceAddress VARCHAR(20),
    invoiceEAddress VARCHAR(20),
    userPayDetail VARCHAR(100),
    anonPayDetail VARCHAR(100),
    invoiceTaxPrice FLOAT(20),
    invoicePrice FLOAT(20),
    totalPrice FLOAT(20)
};