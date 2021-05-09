package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Goal;
import com.sunjon.ScoreManager.mapper.GoalMapper;
import com.sunjon.ScoreManager.view.GoalList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goal")
public class GoalController {
    private GoalMapper goalMapper;

    @Autowired
    public void setGoalMapper(GoalMapper goalMapper) {
        this.goalMapper = goalMapper;
    }

    @RequestMapping("/getAllGoals")
    public GoalList getAllGoals(@RequestParam(name = "lessonId",required = true) Integer lessonId){
        List<Goal> list = goalMapper.findGoal4Lesson(lessonId);
        GoalList data = new GoalList();
        data.setData(list);
        data.setCode(0);
        data.setCount(list.size());
        return data;
    }

    @RequestMapping("/addGoal")
    public Success addGoal(@RequestParam(name = "lessonId",required = true) Integer lessonId
            ,Goal goal){

        Map<String,Object> map = new HashMap<>();
        map.put("name",goal.getName());
        map.put("description",goal.getDescription());
        map.put("proportion",goal.getProportion());
        map.put("lessonId",lessonId);
        try{
            goalMapper.addGoal4Lesson(map);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/updateGoal")
    public Success updateGoal(Goal goal){
        try{
            goalMapper.updateGoal(goal);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/deleteGoal")
    public Success deleteGoal(Goal goal){
        try{
            goalMapper.deleteGoal(goal);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

}
