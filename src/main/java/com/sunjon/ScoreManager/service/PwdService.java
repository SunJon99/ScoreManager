package com.sunjon.ScoreManager.service;

import com.sunjon.ScoreManager.util.PassWord;

public interface PwdService {
    //验证密码
    Boolean isAccurate();
    //生成
    PassWord Generate(String pwd);
}
