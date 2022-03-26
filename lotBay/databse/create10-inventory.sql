USE IoTBay;
CREATE TABLE Inventory{
    stockID VARCHAR(10),
    productID INT(8),
    costPerUnit FLOAT(10),
    totalCost FLOAT(10),
    importDate DATE(8),
    arrivalDate DATE(8),
    totalUnit INT(5)
};