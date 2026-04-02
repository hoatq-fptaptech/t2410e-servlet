package com.example.t2410e_wcd.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private Date dob;
    private Long mark;
}
