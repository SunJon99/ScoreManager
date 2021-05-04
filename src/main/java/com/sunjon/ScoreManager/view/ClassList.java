package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.ClassInfo;

import java.util.List;

public class ClassList {
    private Integer code;
    private List<ClassInfo> data;
    private Integer count;

    public ClassList(){}

    public ClassList(Integer code, List<ClassInfo> data, Integer count) {
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

    public List<ClassInfo> getData() {
        return data;
    }

    public void setData(List<ClassInfo> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
