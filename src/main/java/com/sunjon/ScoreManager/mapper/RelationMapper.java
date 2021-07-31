package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Relation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RelationMapper {
    List<Relation>  getAllRelation(Integer start,Integer limit);
    void deleteRelation(Relation relation);
    Integer countRelations();
    void addRelation(Relation relation);
    List<Relation> getAllMine(Integer teacherId);
}
