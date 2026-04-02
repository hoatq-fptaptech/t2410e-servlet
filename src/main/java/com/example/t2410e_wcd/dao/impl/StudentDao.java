package com.example.t2410e_wcd.dao.impl;

import com.example.t2410e_wcd.dao.DaoInterface;
import com.example.t2410e_wcd.entity.Student;
import com.example.t2410e_wcd.utils.Db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements DaoInterface<Student,Long> {
    @Override
    public List<Student> getAll() {
        List<Student> ls = new ArrayList<>();
        try {
            // truy vấn lấy danh sách sinh viên
            String sql = "SELECT * FROM students";
            Db db = Db.getInstance();
            Statement st = db.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                ls.add(new Student(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getDate("dob"),
                        rs.getLong("mark")
                ));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ls;
    }

    @Override
    public Student create(Student student) {
        try {
            String sql = "INSERT INTO students(name,dob,mark) values(?,?,?)";
            Db db = Db.getInstance();
            PreparedStatement pr = db.getPreparedStatement(sql);
            pr.setString(1,student.getName());
            pr.setDate(2,student.getDob());
            pr.setLong(3,student.getMark());
            pr.execute();
            return student;
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }
}
