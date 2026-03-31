package com.example.t2410e_wcd.entity;

import java.sql.Date;

public class Student {
    private Long id;
    private String name;
    private Date dob;
    private Long mark;

    public Student(Long id, String name, Date dob, Long mark) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }
}
