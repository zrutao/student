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
class StuGradeServiceImpTest {
    @Autowired
    private StuGradeServiceImp stuGradeServiceImp;
    @Test
    void fillById() {
        Assert.assertEquals("一年级",stuGradeServiceImp.fillById("001").getGradeName());
    }
}