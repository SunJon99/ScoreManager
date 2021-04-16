package com.sunjon.ScoreManager.bean;

public class User {

    private Integer id;   //用户编号
    private String name;   //用户姓名
    private String authority; //用户角色
    private String email; //用户邮箱

    public User(){}

    public User(Integer id, String name, String authority, String email) {
        this.id = id;
        this.name = name;
        this.authority = authority;
        this.email = email;
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

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authority='" + authority + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
