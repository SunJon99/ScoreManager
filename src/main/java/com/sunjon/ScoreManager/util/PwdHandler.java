package com.sunjon.ScoreManager.util;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PwdHandler  {

    public PwdHandler(){}

    /**
     * 当需要对密码进行加密操作时，
     * 第一次需要进行一次初始化，
     * 生成相应的盐以及相应的hash
     * @param pwd
     */
    public PassWord init(String pwd){
        PassWord passWord = new PassWord();
        passWord.setSalt(getSalt());
        String strPwd = new StringBuilder(passWord.getSalt()).append(pwd).toString();
        passWord.setHashPwd(getHash(strPwd));
        return passWord;
    }

    /**
     * Hash加密
     * @param input
     * @return
     */
    private static  String getHash(String input){
        BigInteger sha = null;
        byte[] inputData = input.getBytes(StandardCharsets.UTF_8);
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sha.toString(32);
    }

    /**
     * 随机获取 16 个字符作为盐
     * @return
     */
    private String getSalt() {
        SecureRandom random = null;
        try{
            random = SecureRandom.getInstance("SHA1PRNG");
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        char[] chars = new char[16];
        for (int i = 0; i < 16; i++) {
            int num = random.nextInt(93)+33;
            chars[i]= (char)num;
        }
        return new String(chars);
    }


    /**
     * hash接口，可以用于密码检验
     * @param str
     * @return
     */
    public static String GetHash(String str){
       return getHash(str);
    }
}
