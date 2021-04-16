package com.sunjon.ScoreManager;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomTest {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        char[] chars = new char[16];
        for (int i = 0; i < 16; i++) {
            int num = random.nextInt(93)+33;
            chars[i]= (char)num;
        }
        System.out.println(new String(chars));
    }
}
