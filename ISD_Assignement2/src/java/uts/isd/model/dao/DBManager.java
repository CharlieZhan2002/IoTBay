package uts.isd.model.dao;

import uts.isd.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author huasongwen
 */
/*
 * DBManager is the primary DAO class to interact with the database.
 * Complete the existing methods of this classes to perform CRUD operations with the db.
 */

public class DBManager {
    private Statement st;

    public DBManager(Connection conn) throws SQLException {
        st = conn.createStatement();
    /*
        DBManager has a field "Statement" st is used to execute sQL queries within Java code
        DBManager有一个字段“Statement”，用于在Java代码中执行sQL查询
        st is created using the connection instance
        St是使用连接实例创建的
    */
    }

    //Find user by email and password in the database
    public Student findStudent(String email, String password) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.students where Email = '" + email + "' and password='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String studentEmail = rs.getString(2);
            String studentPass = rs.getString(3);
            if (studentEmail.equals(email) && studentPass.equals(password)) {
                String studentName = rs.getString(1);
                String studentDob = rs.getString(4);
                return new Student(studentName, studentEmail, password, studentDob);
            }
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    public Student findStudent(String email) throws SQLException {
        String fetch = "select * from APP.students where Email = '" + email + "'";
        ResultSet rs = st.executeQuery(fetch);
        while (rs.next()) {
            String studentEmail = rs.getString(2);
            String studentPass = rs.getString(3);
            String studentDob = rs.getString(4);
            if (studentEmail.equals(email)) {
                String studentName = rs.getString(1);
                return new Student(studentName, studentEmail, studentPass, studentDob);
            }
        }
        return null;
    }

    public Customer findCustomer(String customerEmail) throws SQLException {
        String fetch = "select * from APP.Customer where Email = '" + customerEmail + "'";
        ResultSet rs = st.executeQuery(fetch);
        while (rs.next()) {
            String email = rs.getString(1);
            String userPassword = rs.getString(2);
            String fullName = rs.getString(3);
            String dateOfBirth = rs.getString(4);
            if (email.trim().equals(customerEmail.trim())) { // 有时候前后有空格可以忽略
                return new Customer(email, userPassword, fullName, dateOfBirth);
            }
        }
        return null;
    }

    public Customer findCustomer(String email, String password) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.Customer where EMAIL = '" + email + "' and USERPASSWORD='" + password + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String customerEmail = rs.getString(1);
            String userPassword = rs.getString(2);
            if (customerEmail.trim().equals(email.trim()) && userPassword.trim().equals(password.trim())) { // 有时候前后有空格可以忽略
                String fullName = rs.getString(3);
                String dateOfBirth = rs.getString(4);
                return new Customer(customerEmail, userPassword, fullName, dateOfBirth);
            }
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    public LinkedList<Customer> findAllCustomer() throws SQLException {
        LinkedList<Customer> allCustomer = new LinkedList<>();
        //setup the select sql query string
        String fetch = "select * from APP.Customer";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String customerEmail = rs.getString(1);
            String userPassword = rs.getString(2);
            String fullName = rs.getString(3);
            String dateOfBirth = rs.getString(4);
            String gender = rs.getString(5);
            String address = rs.getString(6);
            allCustomer.add(new Customer(customerEmail, userPassword, fullName, dateOfBirth, gender, address));
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return allCustomer;
    }

    public Staff findStaff(String staffEmail, String staffPassword) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.Staff where STAFFEMAIL = '" + staffEmail + "' and STAFFPASSWORD='" + staffPassword + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String email = rs.getString(1);
            String password = rs.getString(2);
            if (email.trim().equals(staffEmail.trim()) && password.trim().equals(staffPassword.trim())) { // 有时候前后有空格可以忽略
                String name = rs.getString(3);

                return new Staff(email, password, name);
            }
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    public Order findOrder(int orderID) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.ORDERS where ORDER_ID = " + orderID + "";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            int order_ID = rs.getInt(1);
            String customerEmail = rs.getString(2);
            boolean status = rs.getBoolean(3);
            String generateDate = rs.getString(4);
            String quantity = rs.getString(5);
            return new Order(order_ID, customerEmail, status, generateDate, quantity);
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    //Add a user-data into the database
    public void addUser(String email, String name, String password, String gender, String favcol) throws SQLException {
        //code for add-operation
        // st.executeUpdate("INSERT INTO APP.USERS VALUES('" + FirstName + " ','" + LastName + " ','" + Email + " ','" + Gender + "','" + DoB + " ','" + Password + "','" + Type + "','" + UserId + "')");
        st.executeUpdate("sql query");

    }

    /*
        public void addCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
            //code for add-operation
            st.executeUpdate("INSERT INTO APP.Customer VALUES('" + email + " ','" + userPassword + " ','" + fullName + " ','" + dateOfBirth + "')");
            // st.executeUpdate("sql query");
        }
    */
    public void addCustomer(String email, String userPassword, String fullName, String dateOfBirth, String gender, String address) throws SQLException {
        //code for add-operation
        st.executeUpdate("INSERT INTO APP.Customer VALUES('" + email + " ','" + userPassword + " ','" + fullName + " ','" + dateOfBirth + " ','" + gender + " ','" + address + "')");
        // st.executeUpdate("sql query");
    }


    public void updateCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
        //code for add-operation
        st.executeUpdate("UPDATE APP.Customer SET EMAIL='" + email + "',USERPASSWORD='" + userPassword + "',FULLNAME='" + fullName + "',DATEOFBIRTH='" + dateOfBirth + "'WHERE EMAIL='" + email + "'");
        // st.executeUpdate("sql query");

    }

    public void updateCustomer(String email, String userPassword, String fullName, String dateOfBirth, String gender, String address) throws SQLException {
        //code for add-operation
        st.executeUpdate("UPDATE APP.Customer SET EMAIL='" + email + "',USERPASSWORD='" + userPassword + "',FULLNAME='" + fullName + "',DATEOFBIRTH='" + dateOfBirth + "',GENDER='" + gender + "',ADDRESS='" + address + "'WHERE EMAIL='" + email + "'");
        // st.executeUpdate("sql query");

    }

    public void deleteCustomer(String email) throws SQLException {
        //code for delete-operation
        st.executeUpdate("DELETE FROM APP.Customer WHERE EMAIL='" + email + "'");
    }

    //update a user details in the database
    public void updateUser(String email, String name, String password, String gender, String favcol) throws SQLException {
        //code for update-operation

    }

    //delete a user from the database
    public void deleteUser(String email) throws SQLException {
        //code for delete-operation

    }

    //Find user by id
    public Product findProducts(String id) throws SQLException {
        String fetch = "SELECT * FROM APP.PRODUCT WHERE PID = '"+ id +"'";
        ResultSet rs = st.executeQuery(fetch);

        while(rs.next()){
            String userid = rs.getString(1).replaceAll(" ","");
            if(userid.equals(id)){
                String pname = rs.getString(2);
                String ptype = rs.getString(3);
                String price = rs.getString(4);
                String quantity = rs.getString(5);
                return new Product(userid, pname,ptype,price,quantity);
            }
        }
        return null;
    }

    public Product findProduct(String pid) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.PRODUCT WHERE PID = '" + pid + "'";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String productID = rs.getString(1);
            String pname = rs.getString(2);
            String type = rs.getString(3);
            String price = rs.getString(4);
            String quantity = rs.getString(5);

            return new Product(productID, pname, type, price, quantity);
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    //Find user by id
    public Product[] getProducts() throws SQLException {
        String fetch = "SELECT * FROM APP.PRODUCT";
        ResultSet rs = st.executeQuery(fetch);
        //int count = 0;
        //while(rs2.next()){count++;}
        Product [] res = new Product[100];
        int i = 0;
        while(rs.next()){
            res[i] = new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            i++;
        }
        i=0;
        System.out.println(res[0].getPname());
        return res;
    }

    public void addProducts(String pid, String pname, String type, String price, String quantity) throws SQLException {                   //code for add-operation
        st.executeUpdate("INSERT INTO APP.PRODUCT VALUES('"+ pid +" ','"+ pname +" ','"+ type +" ','"+ price +"','"+ quantity +"')");
    }

    public void deleteProducts(String pid) throws SQLException{
        //code for delete-operation
        st.executeUpdate("DELETE FROM APP.PRODUCT WHERE PID='" + pid + "'");
    }

    public void updateProducts(String pid, String pname, String type, String price, String quantity) throws SQLException {
        //code for update-operation
        st.executeUpdate("UPDATE APP.PRODUCT SET PID='" + pid + "',PNAME='"+ pname +"',TYPE='"+ type +"',PRICE='"+ price +"',QUANTITY='"+ quantity +"'WHERE PID='"+ pid +"'");
    }


    public LinkedList<Order> findAllOrders() throws SQLException {
        LinkedList<Order> allOrder = new LinkedList<>();
        //setup the select sql query string
        String fetch = "select * from APP.ORDERS";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            int id = rs.getInt(1);
            String email = rs.getString(2);
            Boolean status = rs.getBoolean(3);
            String date = rs.getString(4);
            String quantity = rs.getString(5);

            allOrder.add(new Order(id, email, status, date, quantity));
        }
        return allOrder;
    }
    public void addOrder(String email, Boolean status, String date, String quantity) throws SQLException {                   //code for add-operation
        st.executeUpdate("INSERT INTO APP.ORDERS (CUSTOMER_EMAIL, STATUS, GENERATE_DATE, QUANTITY) VALUES('"+ email +" ',"+ status +" ,'"+ date +" ','"+ quantity +"')");
    }

    public Order findOrders(String date) throws SQLException {
        String fetch = "SELECT * FROM APP.ORDERS WHERE GENERATE_DATE = '"+ date +"'";
        ResultSet rs = st.executeQuery(fetch);

        while(rs.next()){
            int id = rs.getInt(1);

            String email = rs.getString(2);
            Boolean status = rs.getBoolean(3);
            String g_date = rs.getString(3);
            String quantity = rs.getString(5);

            return new Order(id, email, status, g_date, quantity);

        }
        return null;
    }

    public LinkedList<Orderline> findAllOrderline() throws SQLException {
        LinkedList<Orderline> allOrderline = new LinkedList<>();
        //setup the select sql query string
        String fetch = "select * from APP.ORDERLINE";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            int oid = rs.getInt(1);
            int pid = rs.getInt(2);


            allOrderline.add(new Orderline(oid, pid));
        }
        return allOrderline;
    }


    public void deleteOrder(int oid) throws SQLException {
        //code for delete-operation
        st.executeUpdate("DELETE FROM APP.ORDERS WHERE ORDER_ID=" + oid + "");
    }

    public void addOrderLine(int oid, int pid) throws SQLException {
        //code for delete-operation
        st.executeUpdate("INSERT INTO APP.ORDERLINE VALUES("+ oid +","+ pid + ")");
    }
    public Orderline findOrderline(int orderID) throws SQLException {
        //setup the select sql query string
        String fetch = "select * from APP.OrderLine where ORDER_ID = " + orderID + "";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            int order_ID = rs.getInt(1);
            int Pid = rs.getInt(2);
            return new Orderline(order_ID, Pid);
        }

        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return null;
    }

    //Find payment details by paymentID and paymentDate in the database   - Read one row in the database table
    public PAYMENT findPayment( Integer paymentID,String paymentDate) throws SQLException {
        String fetch = "select * from APP.PAYMENTDETAIL where PAYMENTID ="+ paymentID + "and  PAYMENTDATE = '"+ paymentDate + "'";
        ResultSet rs = st.executeQuery(fetch);
        //paymentDate ="03-03-2013";
        while (rs.next()) {
            Integer PaymentID = rs.getInt(1);
            String PaymentDate = rs.getString(9);
            //System.out. printf("%d",paymentID);
            // System.out. printf("%d",PaymentID);
            //Integer PaymentID = 1006;
            //String PaymentDate =" 03-03-2013";

            if( PaymentID.equals(paymentID)&&PaymentDate.equals(paymentDate)) {
                Integer OrderID = rs.getInt(2);
                String PaymentMethod = rs.getString(3);
                String CardName = rs.getString(4);
                String CardNumber = rs.getString(5);
                String CardBSB = rs.getString(6);
                String ExpireDate = rs.getString(7);
                String TotalPrice = rs.getString(8);
                return new PAYMENT(PaymentID,OrderID,PaymentMethod, CardName, CardBSB, CardNumber, ExpireDate, TotalPrice,PaymentDate);
            }
        }

        return null;


    }

    //Add a payment-data into the database
    public void addPayment(Integer orderID,String paymentMethod,String cardName,String cardBSB,String cardNumber,String expireDate,String totalPrice,String paymentDate) throws SQLException {
        st.executeUpdate("INSERT INTO APP.PAYMENTDETAIL(ORDERID,PAYMENTMETHOD,CARDNAME,CARDBSB,CARDNUMBER,CARDEXPIREDDATE,TOTALPRICE,PAYMENTDATE) VALUES ("+orderID+",'"+ paymentMethod +"' ,'" + cardName + "','"+ cardBSB + "','"+ cardNumber +"','"+ expireDate +"','"+ totalPrice +"','"+ paymentDate +"') ");
    }

    //Update a payment details in the database
    public void updatePayment(String paymentMethod,String cardName,String cardBSB,String cardNumber,String expireDate,String totalPrice,String paymentDate,Integer paymentID) throws SQLException {
        st.executeUpdate("UPDATE APP.PAYMENTDETAIL SET PAYMENTMETHOD='" + paymentMethod+"',CARDNAME='" + cardName+ "',CARDBSB='"+ cardBSB + "',CARDNUMBER='"+ cardNumber+"',CARDEXPIREDDATE='"+ expireDate+"',TOTALPRICE='"+totalPrice+"',PAYMENTDATE='"+paymentDate+"'WHERE PAYMENTID="+ paymentID +"");
    }

    //Delete a payment details from the database
    public void deletePayment(Integer paymentID) throws SQLException {
        st.executeUpdate("DELETE FROM APP.PAYMENTDETAIL WHERE PAYMENTID ="+paymentID+" ");
    }


    public ArrayList<PAYMENT> fectPayments() throws SQLException {
        String fetch ="select * from PAYMENTDETAIL";
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<PAYMENT> temp = new ArrayList();

        while (rs.next()) {
            Integer paymentID = rs.getInt(1);
            Integer orderID = rs.getInt(2);
            String paymentMethod = rs.getString(3);
            String cardName = rs.getString(4);
            String cardBSB = rs.getString(6);
            String cardNumber = rs.getString(5);
            String expireDate = rs.getString(7);
            String totalPrice = rs.getString(8);
            String paymentDate = rs.getString(9);
            temp.add(new PAYMENT(paymentID,orderID,paymentMethod, cardName, cardBSB, cardNumber, expireDate, totalPrice,paymentDate));
        }
        return temp;
    }

    public boolean checkPayment(Integer paymentID,String paymentDate) throws SQLException {
        String fetch = "select * from APP.PAYMENTDETAIL where PAYMENTID = " + paymentID +" and PAYMENTDATE = '" + paymentDate+"'";
        ResultSet rs = st.executeQuery(fetch);

        while (rs.next()) {
            Integer PaymentID = rs.getInt(1);
            String PaymentDate = rs.getString(9);
            if (PaymentID.equals(paymentID)&& PaymentDate.equals(paymentDate)) {
                return true;
            }
        }
        return false;
    }
    public PAYMENT[] getPayments() throws SQLException {
        String fetch = "SELECT * FROM APP.PAYMENTDETAIL";
        ResultSet rs = st.executeQuery(fetch);
        //int count = 0;
        //while(rs2.next()){count++;}
        PAYMENT [] res = new PAYMENT[100];
        int i = 0;
        while(rs.next()){
            res[i] = new PAYMENT(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(5),rs.getString(7),rs.getString(8),rs.getString(9));
            i++;
        }
        i=0;
        System.out.println(res[0].getCardName());
        return res;
    }

    public void addShipment(String orderID,String Details,String ETA,boolean Status) throws SQLException {                   //code for add-operation       
        st.executeUpdate("INSERT INTO APP.Shipments (orderID,Details,ETA,Status) VALUES('"+ orderID +" ','"+ Details +"','"+ ETA +" ',"+ Status +")");
    }

    public void updateShipment(String shipmentID,String Details) throws SQLException {
        //code for update-operation   
        st.executeUpdate("UPDATE APP.Shipments SET Details='"+ Details +"' WHERE Status = false and CAST(SHIPMENTID AS INTEGER) =" + shipmentID + "");
    }

    public void updateStatus(String shipmentID,boolean Status) throws SQLException {
        //code for update-operation   
        st.executeUpdate("UPDATE APP.Shipments SET Status="+ Status +" WHERE CAST(SHIPMENTID AS INTEGER) =" + shipmentID + "");
    }

    public void deleteShipment(String shipmentID) throws SQLException{
        //code for delete-operation   
        st.executeUpdate("DELETE from APP.Shipments WHERE Status = false and CAST(SHIPMENTID AS INTEGER)=" + shipmentID + "");


    }

    public LinkedList<Shipment> findAllShipment() throws SQLException {
        LinkedList<Shipment> allShipment = new LinkedList<>();
        //setup the select sql query string
        String fetch = "select * from APP.Shipments";
        ResultSet rs = st.executeQuery(fetch);
        //execute this query using the statement field
        while (rs.next()) {
            String shipment_ID = rs.getString(1);
            String Details = rs.getString(2);
            String oder_ID = rs.getString(3);
            String eta = rs.getString(4);
            Boolean status = rs.getBoolean(5);
            allShipment.add(new Shipment(shipment_ID,Details,oder_ID,eta,status));
        }
        //add the results to a ResultSet
        //search the ResultSet for a user using the parameters
        return allShipment;
    }

    //find the user based on their shipment and password
    public Shipment findShipment (String shipmentID) throws SQLException {
        String fetch = "select * from APP.Shipments where CAST(SHIPMENTID AS INTEGER) =" + shipmentID +"";
        ResultSet rs = st.executeQuery(fetch);

        while (rs.next()) {
            String shipment_ID = rs.getString(1);
            String Details = rs.getString(2);
//           String oder_ID = rs.getString(3);
//           String eta = rs.getString(4);
//           String status = rs.getString(5);
            if(shipment_ID.equals( shipmentID)) {
                String oder_ID = rs.getString(3);
                String eta = rs.getString(4);
                Boolean status = rs.getBoolean(5);
                return new Shipment(shipment_ID,Details,oder_ID,eta,status);
            }
        }
        return null;
    }
}
