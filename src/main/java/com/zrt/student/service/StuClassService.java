package com.zrt.student.service;

import com.zrt.student.pojo.StuClass;

import java.util.List;

public interface StuClassService {
    //按班级查询
    StuClass fillById(String id);
    //所有班别
    List<StuClass> fillAll();
}
