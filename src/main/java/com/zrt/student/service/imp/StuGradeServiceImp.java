package com.zrt.student.service.imp;

import com.zrt.student.dao.StuGradeDao;
import com.zrt.student.pojo.StuGrade;
import com.zrt.student.service.StuGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuGradeServiceImp implements StuGradeService {
    @Autowired
    private StuGradeDao stuGradeDao;
    @Override
    public StuGrade fillById(String id) {
        return stuGradeDao.findById(id).get();
    }

    @Override
    public List<StuGrade> fillAll() {
        return stuGradeDao.findAll();
    }
}
