package com.sunjon.ScoreManager.controller;



import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.bean.Student;
import com.sunjon.ScoreManager.view.VResult;
import com.sunjon.ScoreManager.view.VUser;
import com.sunjon.ScoreManager.mapper.StudentMapper;
import com.sunjon.ScoreManager.service.impl.PwdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class TestController {
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
    @ResponseBody
    @RequestMapping("/add")
    public String addStudent(){
        PassWord passWord = pwdService.Generate("golang");
        Student su = new Student(1,"golang","sunjon529@gmail.com",passWord,"男",1);
        try{
            studentMapper.addStudent(su);
        }catch (Exception e){
            e.printStackTrace();
            return "Erro";
        }
        return "Done";
    }

    @ResponseBody
    @RequestMapping("/update")
    public String updateStudent(){
        Student con = new Student();
        con.setName("sun");
        try{
            studentMapper.updateStudent(con);
        }catch (Exception e){
            e.printStackTrace();
            return "Erro";
        }
        return "Done";
    }

    @RequestMapping("/show")
    @ResponseBody
    public List<Student> showStudents(){
        try{
            return studentMapper.findAllStudents();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    @ResponseBody
    @RequestMapping("/user/login")
    public VResult loginTest(VUser user, HttpServletRequest httpRequest){
        if("11111".equals(user.getPassword())){
            return new VResult(1,"index");
        }else{
            return new VResult(0,"errro");
        }

    }



}
