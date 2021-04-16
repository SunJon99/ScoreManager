package com.sunjon.ScoreManager;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTest {

    public static String getHash(String input){
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
    public static void main(String[] args){
        String str = "b";
        String shaStr = getHash(str);
        System.out.println(shaStr+":"+shaStr.length());
    }
}
