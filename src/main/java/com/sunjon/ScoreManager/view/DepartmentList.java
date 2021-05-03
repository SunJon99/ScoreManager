package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Department;

import java.util.List;

/**
 * 用于 layui 的数据对接，来传输 Department - list
 */
public class DepartmentList {
    private Integer code;
    private List<Department> data;
    private Integer count;


    public DepartmentList(){}

    public DepartmentList(Integer code, List<Department> data) {
        this.code = code;
        this.data = data;
        this.count = this.data.size();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Department> getData() {
        return data;
    }

    public void setData(List<Department> data) {
        this.data = data;
    }
}
