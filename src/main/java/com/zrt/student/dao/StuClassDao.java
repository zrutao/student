package com.zrt.student.dao;

import com.zrt.student.pojo.StuClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuClassDao extends JpaRepository<StuClass,String> {
}
