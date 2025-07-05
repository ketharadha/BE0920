package com.chicoo.be0920.module2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class log {
    public static void info(String str) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate + " " + str);
    }
}
