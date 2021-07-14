package com.hp.dateandcollection;

import java.util.Calendar;

/*
* 日历类:可以做日期的计算
* 使用场景,项目中:预约功能,日期计算功能
* 常用的APP,美柚,疫苗预约,入职日期计算,旅游模块.
* 创建对象 ---->new 出来..的
* 对象如果不能被n(无参)new:1.无参构造私有化,可能是单例模式
*                       2.该类可能是接口/抽象类,必须new它实现类(子类)
*                       3.
* */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //创建对象 不仅仅只有new,还有类的实例方法
        //calendar 比 date 厉害  calendar功能包含了 date的大部分功能.是date的升级版
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        //日历可以进行计算 不如增加 add
        //增加一个年份  增加10年  //场景:卖保险  结婚纪念日
        calendar.add(Calendar.YEAR,10);
        System.out.println("calendar.getTime() = " + calendar.getTime());




    }


}
