package com.sunjon.ScoreManager.mapper;

import com.sunjon.ScoreManager.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
/**
 * 学院表的增删改查
 */
public interface DepartmentMapper {
    /**
     * 学院信息查询
     */
    List<Department> findAllDepartments();
    List<Department> findDepartments(Department conditions);
    /**
     * 学院信息修改
     */
    void updateDepartment(Department department);
    /**
     * 学院信息的删除
     */
    void deleteDepartment(Department department);
    /**
     * 学院信息添加
     */
    void addDepartment(Department department);
}
