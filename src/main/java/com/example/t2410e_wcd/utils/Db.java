package com.example.t2410e_wcd.utils;

import java.sql.*;

public class Db {
    private final String connectionString = "jdbc:mysql://localhost:3306/t2410e";
    private final String user = "root";
    private final String password = "root"; // ""
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;

    private static Db _instance;

    private Db() {
        try {
            Class.forName(driver);
            this.conn = DriverManager.getConnection(
                    connectionString,user,password);
            System.out.println("Connected!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Db getInstance(){
        if(_instance == null){
            _instance = new Db();
        }
        return _instance;
    }

    public Statement getStatement() throws Exception{
        return conn.createStatement();
    }
    public PreparedStatement getPreparedStatement(String sql) throws Exception{
        return conn.prepareStatement(sql);
    }
}
