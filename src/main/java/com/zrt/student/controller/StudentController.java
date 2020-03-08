package com.zrt.student.controller;

import com.zrt.student.pojo.StuClass;
import com.zrt.student.pojo.StuGrade;
import com.zrt.student.pojo.Student;
import com.zrt.student.service.imp.StuClassServiceImp;
import com.zrt.student.service.imp.StuGradeServiceImp;
import com.zrt.student.service.imp.StudentServiceImp;
import com.zrt.student.vo.ResultVo;
import com.zrt.student.vo.StuClassVo;
import com.zrt.student.vo.StuGradeVo;
import com.zrt.student.vo.StuMsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;
    @Autowired
    private StuGradeServiceImp stuGradeServiceImp;
    @Autowired
    private StuClassServiceImp stuClassServiceImp;

    //查看全部
    @GetMapping("/student/select")
    public ResultVo select()
    {
        ResultVo resultVo=new ResultVo();
        StuGradeVo stuGradeVo=new StuGradeVo();
        StuClassVo stuClassVo=new StuClassVo();
        StuMsgVo stuMsgVo=new StuMsgVo();


        //获得所有学生信息
        List<Student> students=studentServiceImp.findAll();
        //获得所有级别
        List<StuGrade> stuGrades=stuGradeServiceImp.fillAll();
        //获得所有班别
        List<StuClass> stuClasses=stuClassServiceImp.fillAll();


        List<StuGradeVo> stuGradeVos=new ArrayList<>();

        for(StuGrade stuGrade:stuGrades)
        {
            List<StuClassVo> stuClassVos=new ArrayList<>();
            for(StuClass stuClass:stuClasses)
            {
                List<StuMsgVo> stuMsgVos = new ArrayList<>();
                for(Student student:students)
                {
                    if(student.getClassNo().equals(stuClass.getClassNo())&&student.getGradeNo().equals(stuGrade.getGradeNo()))
                    {
                        StuMsgVo msgVo=new StuMsgVo();
                        msgVo.setStudentBir(student.getStudentBir());
                        msgVo.setStudentHome(student.getStudentHome());
                        msgVo.setStudentId(student.getStudentId());
                        msgVo.setStudentName(student.getStudentName());
                        msgVo.setStudentNo(student.getStudentNo());
                        msgVo.setStudentPhone(student.getStudentPhone());
                        msgVo.setStudentSex(student.getStudentSex());
                        msgVo.setStudentYear(student.getStudentYear());
                        stuMsgVos.add(msgVo);
                    }
                }
                StuClassVo classVo=new StuClassVo();
                classVo.setStu(stuMsgVos);
                classVo.setClassName(stuClass.getClassName());
                classVo.setClassNo(stuClass.getClassNo());
                stuClassVos.add(classVo);
            }
            StuGradeVo gradeVo=new StuGradeVo();
            gradeVo.setStuClass(stuClassVos);
            gradeVo.setGradeName(stuGrade.getGradeName());
            gradeVo.setGradeNo(stuGrade.getGradeNo());
            stuGradeVos.add(gradeVo);
        }
        resultVo.setCode(0);
        resultVo.setMessage("成功");
        resultVo.setData(stuGradeVos);
        return resultVo;
        /*for(Student student:students)
        {
            for(StuClass stuClass:stuClasses)
            {
                for (StuGrade stuGrade:stuGrades)
                {
                    if(student.getClassNo().equals(stuClass.getClassNo())&&student.getGradeNo().equals(stuGrade.getGradeNo()))
                    {
                        StuMsgVo msgVo=new StuMsgVo();
                        msgVo.setStudentBir(student.getStudentBir());
                        msgVo.setStudentHome(student.getStudentHome());
                        msgVo.setStudentId(student.getStudentId());
                        msgVo.setStudentName(student.getStudentName());
                        msgVo.setStudentNo(student.getStudentNo());
                        msgVo.setStudentPhone(student.getStudentPhone());
                        msgVo.setStudentSex(student.getStudentSex());
                        msgVo.setStudentYear(student.getStudentYear());
                        stuMsgVos.add(msgVo);
                    }
                }
            }
        }*/






        /*resultVo.setCode("0");
        resultVo.setMessage("成功");
        stuClassVo.setStu(stuMsgVos);
        stuGradeVo.setStuClass(Arrays.asList(stuClassVo));
        resultVo.setData(Arrays.asList(stuGradeVo));
        return resultVo;*/
    }


}
