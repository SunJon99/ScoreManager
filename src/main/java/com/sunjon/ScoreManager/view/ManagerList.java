package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Manager;

import java.util.List;

public class ManagerList {
    private Integer code;
    private List<Manager> data;
    private Integer count;

    public ManagerList(){}

    public ManagerList(Integer code, List<Manager> data) {
        this.code = code;
        this.data = data;
        this.count = data.size();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Manager> getData() {
        return data;
    }

    public void setData(List<Manager> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }
}
