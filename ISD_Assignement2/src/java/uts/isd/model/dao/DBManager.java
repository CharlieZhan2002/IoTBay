package uts.isd.model.dao;

import uts.isd.model.Customer;
import uts.isd.model.User;

import java.sql.*;

import uts.isd.model.Student;

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




    //Add a user-data into the database
    public void addUser(String email, String name, String password, String gender, String favcol) throws SQLException {
        //code for add-operation
        // st.executeUpdate("INSERT INTO ROOT.USERS VALUES('" + FirstName + " ','" + LastName + " ','" + Email + " ','" + Gender + "','" + DoB + " ','" + Password + "','" + Type + "','" + UserId + "')");
        st.executeUpdate("sql query");

    }

    public void addCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
        //code for add-operation
        st.executeUpdate("INSERT INTO APP.Customer VALUES('" + email + " ','" + userPassword + " ','" + fullName + " ','" + dateOfBirth + "')");
        // st.executeUpdate("sql query");

    }

    public void updateCustomer(String email, String userPassword, String fullName, String dateOfBirth) throws SQLException {
        //code for add-operation
        st.executeUpdate("UPDATE APP.Customer SET EMAIL='" + email + "',USERPASSWORD='" + userPassword + "',FULLNAME='" + fullName + "',DATEOFBIRTH='" + dateOfBirth + "'WHERE EMAIL='" + email + "'");
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


}