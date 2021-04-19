package com.sunjon.ScoreManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
         SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
         Date now = new Date();
         String strNow = sf.format(now);
         System.out.println(strNow);
    }
}
