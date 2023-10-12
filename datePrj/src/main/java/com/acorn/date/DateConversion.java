package com.acorn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public static void main(String[] args) {
        String dateString = "2012-10-21";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println(date); // Date 객체를 출력
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}