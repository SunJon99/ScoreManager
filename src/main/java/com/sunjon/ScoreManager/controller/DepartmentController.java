package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.Department;
import com.sunjon.ScoreManager.mapper.DepartmentMapper;
import com.sunjon.ScoreManager.view.DepartmentList;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private DepartmentMapper departmentMapper;

    @Autowired
    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }


    /**
     * 获取所有现存的学院（不包括已经被删除的学院）
     * @return
     */
    @RequestMapping("/getAllDepartment")
    public DepartmentList getAllDepartment(){
       List<Department> list =  departmentMapper.findAllDepartments();
        //遍历查询每个列表中每个学院的学生人数和教师人数
        for (Department department: list
             ) {
            Integer stNum = departmentMapper.countStudent(department.getId());
            Integer tcNum = departmentMapper.countTeacher(department.getId());
            department.setStNum(stNum);
            department.setTcNum(tcNum);
        }
       DepartmentList data = new DepartmentList();
       data.setData(list);
       data.setCode(0);
       return data;
    }


    @RequestMapping("/deleteDepartment")
    public Success deleteDepartment(Department department){
        try{
          departmentMapper.deleteDepartment(department);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }

    @RequestMapping("/addDepartment")
    public Success addDepartment(Department department){
        try{
            departmentMapper.addDepartment(department);
        }catch (Exception e){
            e.printStackTrace();
            return new Success(1);
        }
        return new Success();
    }
}
