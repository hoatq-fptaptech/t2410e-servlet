package com.example.t2410e_wcd.dao.impl;

import com.example.t2410e_wcd.dao.DaoInterface;
import com.example.t2410e_wcd.entity.Student;
import com.example.t2410e_wcd.utils.Db;

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
