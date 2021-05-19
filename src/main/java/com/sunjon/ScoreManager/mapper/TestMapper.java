package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface TestMapper {
    List<Test> findTest4Lesson(Integer lessonId);
    void addTest4Lesson(Map<String,Object> map);
    void deleteTest(Test test);
    void updateTest(Test test);
}
