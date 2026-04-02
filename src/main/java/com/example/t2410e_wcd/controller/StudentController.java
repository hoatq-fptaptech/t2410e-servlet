package com.example.t2410e_wcd.controller;

import com.example.t2410e_wcd.dao.impl.StudentDao;
import com.example.t2410e_wcd.entity.Student;
import com.example.t2410e_wcd.utils.Db;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(value = "/students")
public class StudentController extends HttpServlet {
    private StudentDao studentDao;
    @Override
    public void init(ServletConfig config) throws ServletException {
        studentDao = new StudentDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Date dob = Date.valueOf(req.getParameter("dob"));
        Long mark = Long.valueOf(req.getParameter("mark"));
        Student s = new Student(null,name,dob,mark);
        if(studentDao.create(s) != null){
            resp.sendRedirect("students"); // thành công thì về trang danh sách
        }else{
            resp.sendRedirect("students"); // thất bại thì về lại form tạo
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
