package com.china.lh.servlets.accessdatabase;

//loading required libraries

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static java.util.jar.Pack200.Packer.PASS;

/**
 * Created by lh on 16-3-30.
 */
public class DatabaseAccess extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/logistics";

        // Database credentials
        final String USER = "root";
        final String PASS = "shuju";

        //Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Datebase Result";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");
        Connection connection =null;
        Statement statement = null;
        try {
            //register JDBC dirver
            Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();
            String sql;
            sql = "select * from account where id<10";
            ResultSet rs = statement.executeQuery(sql);
            // Extract data form result set
            while(rs.next()) {
                Long id = rs.getLong("id");
                String accountName = rs.getString("account_name");

                //Display value
                out.println("ID: " + id + "<br>");
                out.println("accountNmae" +accountName+"<br>");
            }
            out.println("</body></html>");
            rs.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(statement!=null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try{
                if(connection!=null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public void test() throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");

        //Open a connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logistics","root","shuju");
        Statement statement = connection.createStatement();
        String sql;
        sql = "select * from account where id<10";
        ResultSet rs = statement.executeQuery(sql);
        // Extract data form result set
        while(rs.next()) {
            Long id = rs.getLong("id");
            String accountName = rs.getString("account_name");

            //Display value
            System.out.println("ID: " + id + "<br>");
            System.out.println("accountNmae" + accountName + "<br>");
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DatabaseAccess databaseAccess = new DatabaseAccess();
        databaseAccess.test();
    }
}
