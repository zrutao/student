package com.zrt.student.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//班级表
@Entity
public class StuClass {
    @Id
    private String classNo;//班级编号
    private String className;//班级姓名

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
