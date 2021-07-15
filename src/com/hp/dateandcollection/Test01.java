package com.hp.dateandcollection;

import java.util.Date;

/*
* 使用Date输出当前系统时间，以及3天后这一刻的时间
* */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        long time = date.getTime();
        time = time + 1000 * 60 * 60 * 24 * 3L;
        date.setTime(time);
        System.out.println("date = " + date);
    }
}
