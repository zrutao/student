package com.zrt.student.vo;

import java.util.Date;

public class StuMsgVo {
    private String studentYear;//学年
    private String studentNo;//学号
    private String studentName;//姓名
    private String studentId;//省份证号
    private String studentSex;//性别
    private Date studentBir;//出生
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
