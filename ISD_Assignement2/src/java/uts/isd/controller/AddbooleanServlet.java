/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package uts.isd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uts.isd.model.dao.DBConnector;
import uts.isd.model.dao.DBManager;

/**
 *
 * @author QAQ
 */
@WebServlet(name = "AddbooleanServlet", urlPatterns = {"/AddbooleanServlet"})
public class AddbooleanServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/html");
        PrintWriter out = response.getWriter();

         String orderID = request.getParameter("orderID");
            String Details = request.getParameter("Details");
            String ETA = request.getParameter("ETA");
            String Status = request.getParameter("Status");



        try {

            DBConnector connector = new DBConnector();
            Connection conn = connector.openConnection();
            DBManager db = new DBManager(conn);

            boolean S = false;
            SimpleDateFormat maxDate = new SimpleDateFormat("yyyyMMdd");
            Date nowDate = new Date();  //当前系统时间
            String date = maxDate.format(nowDate);
            String queryDate = ETA.replace("-", "");//从数据库中获取的时间(必须要转成字符串类型)
            if (Integer.parseInt(queryDate) <= Integer.parseInt(date)) {
                // System.out.println("从数据库中取出的时间小于当前系统时间！");
                //从数据库中取出的时间小于当前系统时间！直接添加重定向
                // HttpSession session = request.getSession();
                // session.setAttribute("login_email", email);
               
                db.addShipment(orderID,Details,ETA,S);
                response.sendRedirect("/ISD_Assignement2/ShipmentsPage/ShipmentInfo.jsp");
            } /* else if (Integer.parseInt(queryDate) == Integer.parseInt(date)) {
                System.out.println("从数据库中取出的时间等于当前系统时间！");

            }*/ else if (Integer.parseInt(queryDate) > Integer.parseInt(date)) {
                // 从数据库中取出的时间大于当前系统时间！
                // out.println("The time taken from the database is greater than the current system time!");
                response.sendRedirect("/ISD_Assignement2/ShipmentsPage/ShipmentError.jsp");
            }

            
            /*
            if (dob.before(dateFormat.parse(current_Date))){
                // 如果dateOfBirth早于当前时间 就添加, 重定向
                db.addCustomer(email, password, fullname, dateofbirth);
                response.sendRedirect("/ISD_Assignement2/WelcomePage/Welcome.jsp");
            }else {
                // 创建失败的提醒
                out.println("Failed to create, birthday is later than current date");
            }
            */

            // 查
            /*
            Student songwen = db.findStudent("songwen-1@163.com", "233450");
            System.out.println(songwen);

            Student bob = db.findStudent("bob-1@163.com");
            System.out.println(bob);

            Customer test = db.findCustomer("test@.com");
            System.out.println(test);
            */
            // System.out.println(db.findStudent(email, password));

            // 增
            //db.addCustomer("Jingsong@163.com", "110", "Jingsong" ,"2001-01-02");
            // System.out.println("Successfully Add Data");

            // 删
            //db.deleteCustomer("Qingyun@163.com");

            // 改
            //db.updateCustomer("Jingsong@163.com", "suasua", "Jingsong Pang", "2001-01-02");
            // System.out.println("Successfully Update Data");
            connector.closeConnection();
        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}

   