package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.ClassInfo;
import com.sunjon.ScoreManager.mapper.ClassMapper;
import com.sunjon.ScoreManager.view.ClassList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/class")
@RestController
public class ClassController {
    private ClassMapper classMapper;

    @Autowired
    public void setClassMapper(ClassMapper classMapper) {
        this.classMapper = classMapper;
    }

    @RequestMapping("/getAllClass")
    public ClassList getAllClass(){
        List<ClassInfo> list = classMapper.findAllClasses();
        ClassList data = new ClassList();
        data.setData(list);
        data.setCode(0);
        data.setCount(list.size());
        return data;
    }

    @RequestMapping("/getAllClasses")
    public ClassList getAllClasses(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                   @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = classMapper.countClasses();
        List<ClassInfo> list = classMapper.findAllClassesByPage(start,limit);
        ClassList data = new ClassList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/searchByName")
    public ClassList searchByName(@RequestParam(name = "name",required = true)String name,
                                    @RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                    @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        List<ClassInfo> list = classMapper.findClassesByName(name,start,limit);
        Integer count = list.size();
        ClassList data = new ClassList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/deleteClass")
    public Success deleteClass(ClassInfo classInfo){
        try{
            classMapper.deleteClass(classInfo);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }


    @RequestMapping("/addClass")
    public Success addClass(ClassInfo classInfo){
        Integer dpID = classInfo.getDpID();
        Map<String,Object> map = new HashMap<>();
        map.put("name",classInfo.getName());
        map.put("dpID",dpID);
        try{
            classMapper.addClass(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/editClass")
    public Success editClass(ClassInfo classInfo){
        try{
            classMapper.updateClass(classInfo);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }


}
