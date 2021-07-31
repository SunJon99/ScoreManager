package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Score;
import com.sunjon.ScoreManager.bean.Test;
import com.sunjon.ScoreManager.service.impl.ScoreServiceImpl;
import com.sunjon.ScoreManager.service.impl.TestServiceImpl;
import com.sunjon.ScoreManager.view.ScoreList;
import com.sunjon.ScoreManager.view.TestList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private TestServiceImpl testService;
    private ScoreServiceImpl scoreService;
    @Autowired
    public void setTestService(TestServiceImpl testService) {
        this.testService = testService;
    }

    @Autowired
    public void setScoreService(ScoreServiceImpl scoreService) {
        this.scoreService = scoreService;
    }

    @RequestMapping("/getTests")
    public TestList getTests(@RequestParam(name = "lessonId",required = false)Integer lessonId){
        List<Test> list = testService.getData(lessonId);
        TestList data = new TestList();
        data.setData(list);
        data.setCode(0);
        data.setCount(list.size());
        return data;
    }

    @RequestMapping("/getScore")
    public ScoreList getScore(@RequestParam(name = "classId",required = false)Integer classId,
                              @RequestParam(name = "testId",required = false) Integer testId){
        List<Score> list = scoreService.getData(classId,testId);
        ScoreList data = new ScoreList();
        data.setData(list);
        data.setCode(0);
        data.setCount(list.size());
        return data;
    }

}
