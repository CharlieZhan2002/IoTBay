
package uts.isd.model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author huasongwen
 */

public class DBConnector extends DB {


    public DBConnector() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        /*
        DBConnector() construtor uses
        the JDBC driver to build a connection instance (conn)
        with the database usersdb
        JDBC驱动程序来构建与数据库的连接实例(conn)
        */

        conn = DriverManager.getConnection(URL + db, dbuser, dbpass);

    }


    public Connection openConnection() {
        return this.conn;
    /*
    openConnection() returns the conn instance to be used in DBManager and execute SQL queries. 
    openConnection()返回要在DBManager中使用的conn实例并执行SQL查询。
    */

    }


    public void closeConnection() throws SQLException {
        this.conn.close();
        /*
        It is important to close the connection with the database after executing the queries
        在执行查询之后，关闭与数据库的连接是很重要的
        */

    }

}