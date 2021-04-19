package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.LessonGoal;
import com.sunjon.ScoreManager.bean.Test;

import java.util.List;

public interface TestService {
    /**
     * 考核项目添加
     */
    Boolean AddTest(Test test);
    Boolean AddTest(List<Test> tests);
    /**
     * 考核项目修改
     */
    Boolean UpdateTest(Test test);
    /**
     * 考核项目删除
     */
    Boolean DeleteTest(Test test);
    Boolean DeleteTests(List<Test> tests);
    /**
     * 考核项目查询
     */
    List<Test> ShowTests(LessonGoal lessonGoal);
    Test ShowTestByID(Integer id);
}
