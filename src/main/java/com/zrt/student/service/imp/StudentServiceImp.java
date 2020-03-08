package com.zrt.student.service.imp;

import com.zrt.student.dao.StudentDao;
import com.zrt.student.pojo.Student;
import com.zrt.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findById(String id) {
        return studentDao.findById(id).get();
    }

    @Override
    public List<Student> findStudentByGradeNo(String gradeNo) {
        return studentDao.findStudentByGradeNo(gradeNo);
    }

}
