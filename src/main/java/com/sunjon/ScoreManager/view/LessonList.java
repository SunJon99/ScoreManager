package com.sunjon.ScoreManager.view;

import com.sunjon.ScoreManager.bean.Lesson;

import java.util.List;

public class LessonList {
    private Integer code;
    private List<Lesson> data;
    private Integer count;

    public LessonList(){}

    public LessonList(Integer code, List<Lesson> data, Integer count) {
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

    public List<Lesson> getData() {
        return data;
    }

    public void setData(List<Lesson> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
