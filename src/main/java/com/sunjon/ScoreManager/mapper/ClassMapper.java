package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ClassMapper {
    List<ClassInfo> findAllClasses();
    List<ClassInfo> findAllClassesByPage(Integer start,Integer limit);
    Integer countClasses();
    List<ClassInfo> findClassesByName(String name,Integer start,Integer limit);
    void addClass(Map<String,Object> map);
    void updateClass(ClassInfo classInfo);
    void deleteClass(ClassInfo classInfo);
}
