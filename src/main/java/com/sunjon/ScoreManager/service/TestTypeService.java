package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.LessonGoal;
import com.sunjon.ScoreManager.bean.TestType;

import java.util.List;

/**
 * 考核类型管理
 */
public interface TestTypeService {
    /**
     * 考核类型添加
     */
    Boolean AddTestType(TestType testType);
    Boolean AddTestTypes(List<TestType> testTypes);
    /**
     * 考核类型删除
     */
    Boolean DeleteTestType(TestType testType);
    Boolean DeleteTestTypes(List<TestType> testTypes);
    /**
     * 考核类型修改
     */
    Boolean UpdateTestType(TestType testType);
    /**
     * 考核类型查询
     */
    List<TestType> ShowTestTypes(LessonGoal lessonGoal);
    TestType ShowTestTypeByID(Integer id);
}
