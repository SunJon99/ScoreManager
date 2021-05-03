package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Teacher;

import java.util.List;

public class TeacherList {
    private Integer code;
    private List<Teacher> data;
    private Integer count;

    public TeacherList(){}

    public TeacherList(Integer code, List<Teacher> data, Integer count) {
        this.code = code;
        this.data = data;
        this.count = count;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Teacher> getData() {
        return data;
    }

    public void setData(List<Teacher> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
