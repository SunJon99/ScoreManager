package com.sunjon.ScoreManager.view;

public class LoginSuccess {
    private Integer code;
    private String location;

    public LoginSuccess(){}

    public LoginSuccess(Integer code, String location) {
        this.code = code;
        this.location = location;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
