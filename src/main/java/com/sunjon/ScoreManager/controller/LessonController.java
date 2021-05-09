package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Lesson;
import com.sunjon.ScoreManager.mapper.LessonMapper;
import com.sunjon.ScoreManager.view.LessonList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lesson")
public class LessonController {
    private LessonMapper lessonMapper;

    @Autowired
    public void setLessonMapper(LessonMapper lessonMapper) {
        this.lessonMapper = lessonMapper;
    }

    @RequestMapping("/getAllLessons")
    public LessonList getAllLessons(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                    @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = lessonMapper.countLessons();
        List<Lesson> list = lessonMapper.findAllLessonsByPage(start,limit);
        LessonList data = new LessonList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/searchByName")
    public LessonList searchByName(@RequestParam(name = "name",required = true)String name,
                                  @RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                  @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        List<Lesson> list = lessonMapper.findLessonsByName(name,start,limit);
        Integer count = list.size();
        LessonList data = new LessonList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/deleteLesson")
    public Success deleteLesson(Lesson lesson){
        try{
            lessonMapper.deleteLesson(lesson);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/addLesson")
    public Success addLesson(Lesson lesson){
        Map<String,Object> map = new HashMap<>();
        map.put("name",lesson.getName());
        map.put("dpID",lesson.getDpID());
        map.put("credit",lesson.getCredit());
        map.put("time",lesson.getTime());
        try{
            lessonMapper.addLesson(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/editLesson")
    public Success editTeacher(Lesson lesson){
        try{
            lessonMapper.updateLesson(lesson);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }
}
