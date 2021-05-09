package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.bean.Student;
import com.sunjon.ScoreManager.mapper.StudentMapper;
import com.sunjon.ScoreManager.service.impl.PwdServiceImpl;
import com.sunjon.ScoreManager.view.StudentList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentMapper studentMapper;
    private PwdServiceImpl pwdService;

    @Autowired
    public void setPwdService(PwdServiceImpl pwdService) {
        this.pwdService = pwdService;
    }

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @RequestMapping("/getAllStudents")
    public StudentList getAllStudents(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                      @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = studentMapper.countStudents();
        List<Student> list = studentMapper.findAllStudentsByPage(start,limit);
        StudentList data = new StudentList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/searchByName")
    public StudentList searchByName(@RequestParam(name = "name",required = true)String name,
                                    @RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                    @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        List<Student> list = studentMapper.findStudentsByName(name,start,limit);
        Integer count = list.size();
        StudentList data = new StudentList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/addStudent")
    public Success addStudent(Student student){
        PassWord passWord = pwdService.Generate("111111");
        Integer classID = student.getClassID();
        Map<String,Object> map = new HashMap<>();
        map.put("name",student.getName());
        map.put("gender",student.getGender());
        map.put("email",student.getEmail());
        map.put("pwd",passWord.getHashPwd());
        map.put("salt",passWord.getSalt());
        map.put("classID",classID);
        try{
            studentMapper.addStudent(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/editStudent")
    public Success editStudent(Student student){
        try{
            studentMapper.updateStudent(student);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }


    @RequestMapping("/deleteStudent")
    public Success deleteStudent(Student student){
        try{
            studentMapper.deleteStudent(student);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }
}
