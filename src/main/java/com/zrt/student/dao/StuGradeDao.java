package com.zrt.student.dao;

import com.zrt.student.pojo.StuGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuGradeDao extends JpaRepository<StuGrade,String> {
}
