package com.sunjon.ScoreManager.util;

public class PassWord {
    private String hashPwd;
    private String salt;


    public PassWord(){}
    public PassWord(String hashPwd, String salt) {
        this.hashPwd = hashPwd;
        this.salt = salt;
    }

    public String getHashPwd() {
        return hashPwd;
    }

    public void setHashPwd(String hashPwd) {
        this.hashPwd = hashPwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "PassWord{" +
                "hashPwd='" + hashPwd + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
