package com.zrt.student.service.imp;

import com.zrt.student.dao.StuClassDao;
import com.zrt.student.pojo.StuClass;
import com.zrt.student.service.StuClassService;
import com.zrt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuClassServiceImp implements StuClassService {
    @Autowired
    private StuClassDao stuClassDao;
    @Override
    public StuClass fillById(String id) {
        return stuClassDao.findById(id).get();
    }

    @Override
    public List<StuClass> fillAll() {
        return stuClassDao.findAll();
    }
}
