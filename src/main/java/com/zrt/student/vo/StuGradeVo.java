package com.zrt.student.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

//年级层
public class StuGradeVo<T> {
    @JsonProperty("no")
    private String gradeNo;//年级编号
    @JsonProperty("name")
    private String gradeName;//年级昵称
    @JsonProperty("class")//班级内容
    private T stuClass;

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

    public T getStuClass() {
        return stuClass;
    }

    public void setStuClass(T stuClass) {
        this.stuClass = stuClass;
    }
}
