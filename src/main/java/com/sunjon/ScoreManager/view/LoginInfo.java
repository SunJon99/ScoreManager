package com.sunjon.ScoreManager.view;

public class LoginInfo {
    /*用户名称*/
    private String userEmail;
    /* 用户登录密码 */
    private String password;
    private Integer type;

    public LoginInfo(){}

    public LoginInfo(String userEmail, String password, Integer type) {
        this.userEmail = userEmail;
        this.password = password;
        this.type = type;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
