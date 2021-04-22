package com.sunjon.ScoreManager.service.impl;

import com.sunjon.ScoreManager.service.PwdService;
import com.sunjon.ScoreManager.bean.PassWord;
import com.sunjon.ScoreManager.util.PwdHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PwdServiceImpl implements PwdService {
    private PwdHandler pwdHandler;

    @Autowired
    public void setPwdHandler(PwdHandler pwdHandler) {
        this.pwdHandler = pwdHandler;
    }

    /**
     * hash saltPassWord并与数据库的hash值进行判断
     * @param pwdHash
     * @param saltPassWord
     * @return
     */
    @Override
    public Boolean isAccurate(String pwdHash,String saltPassWord) {
        //判断输入的密码+盐与数据库中 密码hash值作比较，验证密码
        return pwdHash.equals(pwdHandler.GetHash(saltPassWord));
    }

    /**
     * 生成密码hash
     * @param pwd
     * @return
     */
    @Override
    public PassWord Generate(String pwd) {
        return pwdHandler.init(pwd);
    }
}
