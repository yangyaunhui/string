package com.hp.dateandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 企业开发中(Java,bigData) 日期
 * 日期类的层是 有一个long值  学名UTC 时间
 * 1970 年 1月 1日 00:00:00 开始 计算元年时间
 *
 * 日期类 有2个包,sql / util 我们使用util包下的日期
 *
 * 这个日期类 功能有限,如需 日期计算,需要使用 日历类 解决
 * */
public class DateDemo01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date); //date为什么会输出 Wed Jul 14 09:46:47 CST 2021
        //tostring()被改写了......可以重新改为我们自己的时间
        long time = date.getTime();//获得真实的时间,long值
        System.out.println("time = " + time); //1626227738194 = 2021-07-14 + 10天
        // date.setTime(3626227363384L);
        //System.out.println("date = " + date);
        /*
         * 查看10天后是哪一天
         * */
        time = time + 1000 * 60 * 60 * 24 * 10L;
        date.setTime(time);
        System.out.println("date = " + date);

        //修改 日期显示格式   yyyy必须小写  日期转成字符串
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String pattern1 = "yyyy/MM/dd HH:mm:ss";
        String pattern2 = "yyyy/MM/dd";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        String chinaDateStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDateStr);
        //字符串---->转日期
        System.out.println("-----------");
        String dateStr = "2018-09-9 23:16:45";
        try {
            Date parse = sdf.parse(dateStr);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("你的日期字符串可能不是一个日期");
            e.printStackTrace();
        }
    }
}