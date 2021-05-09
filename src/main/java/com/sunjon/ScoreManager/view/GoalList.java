package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Goal;

import java.util.List;

public class GoalList {
    private Integer code;
    private List<Goal> data;
    private Integer count;

    public GoalList(){}


    public GoalList(Integer code, List<Goal> data, Integer count) {
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

    public List<Goal> getData() {
        return data;
    }

    public void setData(List<Goal> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
