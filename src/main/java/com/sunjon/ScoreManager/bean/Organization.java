package com.sunjon.ScoreManager.bean;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.type.Alias;

import java.util.Date;
@Alias("Organization")
public class Organization {
    private Integer id;//组织编号
    private String name;//组织名称
    private String nature;//组织属性
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endTime;//注册有效期
    private String email;//注册邮箱
    private String address;//地址

    public Organization(){}

    public Organization(Integer id, String name, String nature,
                        Date endTime, String email, String address)
    {
        this.id = id;
        this.name = name;
        this.nature = nature;
        this.endTime = endTime;
        this.email = email;
        this.address = address;
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

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nature='" + nature + '\'' +
                ", endTime=" + endTime +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
