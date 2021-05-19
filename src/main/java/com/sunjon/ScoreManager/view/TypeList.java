package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.TestType;

import java.util.List;

public class TypeList {
    private Integer code;
    private Integer count;
    private List<TestType> data;

    public TypeList(){}

    public TypeList(Integer code, Integer count, List<TestType> data) {
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<TestType> getData() {
        return data;
    }

    public void setData(List<TestType> data) {
        this.data = data;
    }
}
