package com.sunjon.ScoreManager.view;
import com.sunjon.ScoreManager.bean.Student;

import java.util.List;

public class StudentList {

    private Integer code;
    private List<Student> data;
    private Integer count;

    public StudentList(){}

    public StudentList(Integer code, List<Student> data, Integer count) {
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

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
