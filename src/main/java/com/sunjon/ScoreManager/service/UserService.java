package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.User;

import java.util.List;

/**
 * 用户管理服务（包括系统管理员、机构管理员、学院管理员、教师、学生）
 */
public interface UserService {

    /**
     * 用户信息查询
     * 返回所有管理的用户的信息
     */
    List<User> ShowAllUsers();
    User ShowUserByID(Integer id);
    User ShowUserByName(String name);
    /**
     * 用户信息修改
     */
    Boolean UpdateInfo(User user);
    /**
     * 用户信息添加
     */
    Boolean AddUser(User user);
    Boolean AddUsers(List<User> users);
    /**
     * 用户信息删除
     */
    Boolean DeleteUser(User user);
    Boolean DeleteUsers(List<User> users);
}
