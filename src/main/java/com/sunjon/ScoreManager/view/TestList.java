package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Test;

import java.util.List;

public class TestList {
    private Integer code;
    private Integer count;
    private List<Test> data;

    public TestList(){}

    public TestList(Integer code, Integer count, List<Test> data) {
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

    public List<Test> getData() {
        return data;
    }

    public void setData(List<Test> data) {
        this.data = data;
    }
}
