package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
/**
 * 班级表的操作
 * 班级信息的增删查改
 */
public interface GradeMapper {
    /**
     * 班级信息的查询
     */
    List<Grade> findAllGrades();
    List<Grade> findGrades(Grade conditions);
    /**
     * 班级信息的修改
     */
    void updateGrade(Grade grade);
    /**
     * 班级信息的删除
     */
    void deleteGrade(Grade grade);
    /**
     * 班级信息的添加
     */
     void addGrade(Grade grade);
}

