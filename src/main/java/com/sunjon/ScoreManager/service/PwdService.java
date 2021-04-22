package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.bean.PassWord;

public interface PwdService {
    //验证密码
    Boolean isAccurate(String pwdHash,String saltPassWord);
    //生成
    PassWord Generate(String pwd);
}
