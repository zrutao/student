package com.zrt.student.service;

import com.zrt.student.pojo.Student;

import java.util.List;

public interface StudentService {
    //查询全部
    List<Student> findAll();
    //按学号查询
    Student findById(String id);
    //按年级查询
    List<Student> findStudentByGradeNo(String gradeNo);
}
