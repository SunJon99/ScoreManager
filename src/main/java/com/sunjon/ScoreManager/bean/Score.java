package com.sunjon.ScoreManager.bean;

public class Score {
    private Integer studentId;
    private String studentName;
    private Float score;

    public Score(){}

    public Score(Integer studentId, String studentName, Float score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
