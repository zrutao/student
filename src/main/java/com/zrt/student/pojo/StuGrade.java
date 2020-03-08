package com.zrt.student.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//年级表
@Entity
public class StuGrade {
    @Id
    private String gradeNo;//年级编号
    private String gradeName;//年级昵称

    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
