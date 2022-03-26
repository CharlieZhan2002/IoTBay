USE IoTBay;
CREATE TABLE Notification{
    notificationID INT(10),
    userID INT(10),
    anonID INT(10),
    notificationDetail VARCHAR(50),
    notificationStatus Boolean(2),
    notificationUser VARCHAR(20),
    userEmail VARCHAR(20),
    anonEmail VARCHAR(20)
};