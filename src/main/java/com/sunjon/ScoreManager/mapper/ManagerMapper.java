package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ManagerMapper {
    //获取表中所有manager 元素
    List<Manager> findAllManagers();
    //通过分页控制获取manager元素
    List<Manager> findManagersByPage(Integer start,Integer limit);
    //获取表中Manager元素的数量
    Integer countManagers();
    //通过名字搜索学院管理员，可以进行分页
    List<Manager> findManagersByName(String name,Integer start,Integer limit);
    //添加管理员信息
    void addManager(Map<String,Object> map);
    //修改管理员信息
    void updateManager(Manager manager);
    //删除管理员信息
    void deleteManager(Manager manager);
}
