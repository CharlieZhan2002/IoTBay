DROP DATABASE IF EXISTS IoTBay;
CREATE DATABASE IoTBay;

USE IoTBay;

CREATE TABLE Customer(
	userID INT(10),
    firstName VARCHAR(15),
    lastName VARCHAR(15),
    email VARCHAR(50),
    gender CHAR(10),
    userBIrthday DATE,
    userContactNumber INT(25),
    userPassword VARCHAR(50),
    userPaymentDetail VARCHAR(200),
    userShippingDetail VARCHAR(80),
    userAccessLevel INT(5)
);

INSERT INTO Customer ( userID, firstName)
                       VALUES
                       ( 123, "main" );


