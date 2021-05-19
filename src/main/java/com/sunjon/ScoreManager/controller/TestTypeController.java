package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.TestType;
import com.sunjon.ScoreManager.mapper.TestTypeMapper;
import com.sunjon.ScoreManager.view.Success;
import com.sunjon.ScoreManager.view.TypeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tType")
public class TestTypeController {
    private TestTypeMapper testTypeMapper;

    @Autowired
    public void setTestTypeMapper(TestTypeMapper testTypeMapper) {
        this.testTypeMapper = testTypeMapper;
    }

    @RequestMapping("/getAllTypes")
    public TypeList getAllTypes(@RequestParam(name = "lessonId",required = true) Integer lessonId){
        List<TestType> list = testTypeMapper.findTestType4Lesson(lessonId);
        TypeList data = new TypeList();
        data.setData(list);
        data.setCode(0);
        data.setCount(list.size());
        return data;
    }

    @RequestMapping("/addType")
    public Success addGoal(TestType testType){

        Map<String,Object> map = new HashMap<>();
        map.put("name",testType.getName());
        map.put("proportion",testType.getProportion());
        map.put("goalId",testType.getGoalId());
        try{
            testTypeMapper.addTestType4Lesson(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/updateType")
    public Success updateTestType(TestType testType){
        try{
            testTypeMapper.updateTestType(testType);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/deleteType")
    public Success deleteTestType(TestType testType){
        try{
            testTypeMapper.deleteTestType(testType);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }
}
