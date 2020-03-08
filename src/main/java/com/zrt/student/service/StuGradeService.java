package com.zrt.student.service;

import com.zrt.student.pojo.StuGrade;

import java.util.List;

public interface StuGradeService {
    //按年级编号查询
    StuGrade fillById(String id);

    //获得所有
    List<StuGrade> fillAll();
}
