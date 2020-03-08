package com.zrt.student.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StuClassVo {
    @JsonProperty("no")
    private String classNo;//班级编号
    @JsonProperty("name")
    private String className;//班级昵称
    @JsonProperty("student")
    private List<StuMsgVo> stu;//学生信息

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

    public List<StuMsgVo> getStu() {
        return stu;
    }

    public void setStu(List<StuMsgVo> stu) {
        this.stu = stu;
    }
}
