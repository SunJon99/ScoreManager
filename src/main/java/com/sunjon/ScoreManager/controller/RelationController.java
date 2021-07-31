package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Relation;
import com.sunjon.ScoreManager.mapper.RelationMapper;
import com.sunjon.ScoreManager.view.RelationList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/relation")
public class RelationController {
    public RelationMapper relationMapper;

    @Autowired
    public void setRelationMapper(RelationMapper relationMapper) {
        this.relationMapper = relationMapper;
    }

    @RequestMapping("/getAllRelation")
    public RelationList getAllRelation(@RequestParam(name = "page",required = false,defaultValue = "1")Integer curr,
                                       @RequestParam(name = "limit",required = false,defaultValue = "10")Integer limit){
        Integer start = (curr-1) * limit;
        Integer count = relationMapper.countRelations();
        List<Relation> list = relationMapper.getAllRelation(start,limit);
        RelationList data = new RelationList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }

    @RequestMapping("/deleteRelation")
    public Success deleteRelation(Relation relation){
        try{
            relationMapper.deleteRelation(relation);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/addRelation")
    public Success addRelation(Relation relation){
        try{
            relationMapper.addRelation(relation);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/getAllMine")
    public RelationList getAllMine(HttpSession session){
        Object obj = session.getAttribute("type");
        if(obj instanceof Integer){
            if((Integer)obj != 2){
                return null;
            }
        }

        obj = session.getAttribute("id");
        Integer id = -1;
        if(obj instanceof Integer){
            id = (Integer) obj;
        }
        List<Relation> list = relationMapper.getAllMine(id);
        Integer count = list.size();
        RelationList data = new RelationList();
        data.setData(list);
        data.setCode(0);
        data.setCount(count);
        return data;
    }


}
