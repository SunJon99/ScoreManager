package com.sunjon.ScoreManager.bean;

public class User {

    private Integer id;   //用户编号
    private String name;   //用户姓名
    private String email; //用户邮箱
    private PassWord passWord; //用户密码信息

    public User(){}

    public User(Integer id, String name, String email, PassWord passWord) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passWord = passWord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PassWord getPassWord() {
        return passWord;
    }

    public void setPassWord(PassWord passWord) {
        this.passWord = passWord;
    }

}
