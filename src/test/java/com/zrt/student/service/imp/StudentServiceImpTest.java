package com.zrt.student.service.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentServiceImpTest {
    @Autowired
    private StudentServiceImp studentServiceImp;
    @Test
    void findAll() {
        Assert.assertNotEquals(0,studentServiceImp.findAll());
    }

    @Test
    void findById() {
        Assert.assertEquals("01",studentServiceImp.findById("S2018020101").getClassNo());
    }

    @Test
    void findStudentByGradeNo() {
        Assert.assertNotEquals(0,studentServiceImp.findStudentByGradeNo("001"));
    }
}