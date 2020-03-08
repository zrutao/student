package com.zrt.student.dao;

import com.zrt.student.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,String> {
    //按年级编号查询
    List<Student> findStudentByGradeNo(String gradeNo);

}
