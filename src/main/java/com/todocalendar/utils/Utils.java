package com.todocalendar.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static Date parse(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date date;
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            date = null;
            e.printStackTrace();
        }
        return date;
    }
}

