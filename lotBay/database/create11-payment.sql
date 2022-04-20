USE IoTBay;
CREATE TABLE Payment{
    paymentID INT(10),
    userID INT(10),
    anonID INT(10),
    paymentType VARCHAR(50),
    paymentDate DATE(8),
    totalPrice FLOAT(10),
    userAcctName VARCHAR(20),
    userBSB INT(6),
    userAcctNo INT(8),
    expiryDate DATE(8)
};