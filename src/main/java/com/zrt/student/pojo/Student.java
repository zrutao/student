package com.zrt.student.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
/*
* 学生表
* */
@Entity
public class Student {
    private String studentYear;//学年
    @Id
    private String studentNo;//学号
    private String studentName;//姓名
    private String studentId;//省份证号
    private String studentSex;//性别
    private Date studentBir;//出生
    private String gradeNo;//年级编号
    private String classNo;//班级编号
    private String studentPhone;//电话
    private String studentHome;//家庭地址

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public Date getStudentBir() {
        return studentBir;
    }

    public void setStudentBir(Date studentBir) {
        this.studentBir = studentBir;
    }

    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentHome() {
        return studentHome;
    }

    public void setStudentHome(String studentHome) {
        this.studentHome = studentHome;
    }
}
