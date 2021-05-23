package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Relation;

import java.util.List;

public class RelationList {

    private Integer code;
    private List<Relation> data;
    private Integer count;

    public RelationList(){}

    public RelationList(Integer code, List<Relation> data, Integer count) {
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

    public List<Relation> getData() {
        return data;
    }

    public void setData(List<Relation> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
