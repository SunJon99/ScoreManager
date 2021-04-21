package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.LessonRelation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
/**
 * 课程关系表的操作
 * 课程关系的增删查改
 */
public interface LessonRelationMapper {
    /**
     * 课程关系的查询
     */
    List<LessonRelation> findAllLessonRelations();
    List<LessonRelation> findLessonRelations(LessonRelation conditions);
    /**
     * 课程关系的修改
     */
    void updateLessonRelation(LessonRelation lessonRelation);
    /**
     * 课程关系的删除
     */
    void deleteLessonRelation(LessonRelation lessonRelation);
    /**
     * 课程目标的添加
     */
    void addLessonRelation(LessonRelation lessonRelation);
}
