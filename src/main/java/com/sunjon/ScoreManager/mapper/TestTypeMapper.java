package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.TestType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface TestTypeMapper {
    List<TestType> findTestType4Lesson(Integer lessonId);
    void addTestType4Lesson(Map<String,Object> map);
    void deleteTestType(TestType tType);
    void updateTestType(TestType tType);
}
