package com.example.t2410e_wcd.controller;

import com.example.t2410e_wcd.utils.Db;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(value = "/students")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            // truy vấn lấy danh sách sinh viên
            String sql = "SELECT * FROM students";

            Db db = Db.getInstance();
            Statement st = db.getStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        String className = "T2410E";
        req.setAttribute("abc",className);
        String name = req.getParameter("name");
        req.setAttribute("xyz",name);
        RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = req.getParameter("search");
        System.out.println(s);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
