package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Score;

import java.util.List;

public class ScoreList {
    private Integer code;
    private Integer count;
    private List<Score> data;

    public ScoreList(){}
    public ScoreList(Integer code, Integer count, List<Score> data) {
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

    public List<Score> getData() {
        return data;
    }

    public void setData(List<Score> data) {
        this.data = data;
    }
}
