package com.codegym.demoClothingManagement.model;

import java.sql.*;

public class ConnectionManager {

    static String dbURL = "jdbc:mysql://localhost:3306/clothing_sales_management";
    static String userName = "root";
    static String passWord = "Rong1992";

    static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, userName, passWord);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /*public ResultSet getData(String sql) {
        statement = null;
        try {
            statement = connection.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /*public boolean updateData(String sql) {
        statement = null;
        try {
            statement = connection.createStatement();
            return statement.executeUpdate(sql) > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }*/
}
