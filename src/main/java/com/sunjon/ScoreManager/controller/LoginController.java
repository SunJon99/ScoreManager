package com.sunjon.ScoreManager.controller;

import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.bean.User;
import com.sunjon.ScoreManager.mapper.UserMapper;
import com.sunjon.ScoreManager.service.impl.PwdServiceImpl;
import com.sunjon.ScoreManager.view.LoginInfo;
import com.sunjon.ScoreManager.view.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    private UserMapper userMapper;
    private PwdServiceImpl pwdService;

    @Autowired
    public void setPwdService(PwdServiceImpl pwdService) {
        this.pwdService = pwdService;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/check")
    @ResponseBody
    public Success loginCheck(LoginInfo login, HttpServletRequest request, HttpServletResponse response){
        Integer type = login.getType();
        boolean flag = false;
        switch (type){
            case 1:
                flag = adminLogin(login,request,response);
                break;
            case 2:
                flag = teacherLogin(login,request,response);
                break;
            case 3:
                flag = studentLogin(login,request,response);
                break;
            default:
                flag = false;
        }
        if(flag){
            return new Success();
        }
        return new Success(1);

    }

    @RequestMapping("/loginOut")
    @ResponseBody
    public Success loginOut(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("type");
        session.removeAttribute("id");
        return new Success();
    }

    private boolean adminLogin(LoginInfo login,
                               HttpServletRequest request,
                               HttpServletResponse response){
        User user = null;
        try{
            user = userMapper.findAdminByEmail(login.getUserEmail());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        boolean flag =false;
        PassWord passWord = user.getPassWord();
        String loginsaltPwd = passWord.getSalt()+login.getPassword();
        flag =  pwdService.isAccurate(passWord.getHashPwd(),loginsaltPwd);
        if(flag){
            HttpSession session = request.getSession();
            session.setAttribute("type",login.getType());
            session.setAttribute("id",user.getId());
        }
        return flag;
    }

    private boolean teacherLogin(LoginInfo login,
                                 HttpServletRequest request,
                                 HttpServletResponse response){
        User user = null;
        try{
            user = userMapper.findTeacherByEmail(login.getUserEmail());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        boolean flag =false;
        PassWord passWord = user.getPassWord();
        String loginsaltPwd = passWord.getSalt()+login.getPassword();
        flag =  pwdService.isAccurate(passWord.getHashPwd(),loginsaltPwd);
        if(flag){
            HttpSession session = request.getSession();
            session.setAttribute("type",login.getType());
            session.setAttribute("id",user.getId());
        }
        return flag;
    }

    private boolean studentLogin(LoginInfo login,
                                 HttpServletRequest request,
                                 HttpServletResponse response){
        User user = null;
        try{
            user = userMapper.findStudentByEmail(login.getUserEmail());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        boolean flag =false;
        PassWord passWord = user.getPassWord();
        String loginsaltPwd = passWord.getSalt()+login.getPassword();
        flag =  pwdService.isAccurate(passWord.getHashPwd(),loginsaltPwd);
        if(flag){
            HttpSession session = request.getSession();
            session.setAttribute("type",login.getType());
            session.setAttribute("id",user.getId());
        }
        return flag;
    }






}
