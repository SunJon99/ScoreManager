package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.bean.Teacher;
import com.sunjon.ScoreManager.mapper.TeacherMapper;
import com.sunjon.ScoreManager.service.impl.PwdServiceImpl;
import com.sunjon.ScoreManager.view.Success;
import com.sunjon.ScoreManager.view.TeacherList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    private TeacherMapper teacherMapper;
    private PwdServiceImpl pwdService;

    @Autowired
    public void setPwdService(PwdServiceImpl pwdService) {
        this.pwdService = pwdService;
    }

    @Autowired
    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @RequestMapping("getAllTeachers")
    public TeacherList getAllTeachers(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                      @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = teacherMapper.countTeachers();
        List<Teacher> list = teacherMapper.findAllTeachersByPage(start,limit);
        TeacherList data = new TeacherList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/searchByName")
    public TeacherList searchByName(@RequestParam(name = "name",required = true)String name,
                                    @RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                    @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        List<Teacher> list = teacherMapper.findTeachersByName(name,start,limit);
        Integer count = list.size();
        TeacherList data = new TeacherList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/deleteTeacher")
    public Success deleteTeacher(Teacher teacher){
        try{
            teacherMapper.deleteTeacher(teacher);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/addTeacher")
    public Success addTeacher(Teacher teacher){
        PassWord passWord = pwdService.Generate("111111");
        Integer dpID = teacher.getDpID();
        Map<String,Object> map = new HashMap<>();
        map.put("name",teacher.getName());
        map.put("title",teacher.getTitle());
        map.put("email",teacher.getEmail());
        map.put("pwd",passWord.getHashPwd());
        map.put("salt",passWord.getSalt());
        map.put("dpID",dpID);
        try{
            teacherMapper.addTeacher(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/editTeacher")
    public Success editTeacher(Teacher teacher){
        try{
            teacherMapper.updateTeacher(teacher);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

}
