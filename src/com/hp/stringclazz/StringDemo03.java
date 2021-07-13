package com.hp.stringclazz;
/**
 *Strig类的常用API
 */

public class StringDemo03 {
    public static void main(String[] args) {
        String str = "thinking in java"; //Java编程思想
        //查询 10 的字符是什么
        char c = str.charAt(10);
        System.out.println("c = " + c);
        int length = str.length();//注意:length()是方法 数组的长度是属性
        System.out.println("length = " + length);
        char[] chars = str.toCharArray(); //应用点: 应用在 对数据的加密
        int x = chars.length; //数组不带 原括弧
        System.out.println("x = " + x);
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
        //查找给定的字符串的位置
        //如: 查找in的位置 查找出来的是第一次出现的位置
        int i = str.indexOf("in");
        System.out.println("i = " + i);
        //从指定位置 进行检索
        int i1 = str.indexOf("in", 3);
        System.out.println("i1 = " + i1);
        //也可以检索最后一次出现的位置
        int i2 = str.lastIndexOf("in");
        System.out.println("i2 = " + i2);

        String str1 = "thinking in java"; //Java编程思想
        //判断 是否 以什么字符开头 以什么字符结尾
        boolean th = str1.startsWith("th");
        System.out.println("th = " + th);
        boolean va = str1.endsWith("va");
        System.out.println("va  = " + va);

        String str2 = "WWW.oracale.com";
        // String substring(int beginIndex,int endIndex) 截取字符串
        //含头不含尾
        String substring = str2.substring(4, 10);
        System.out.println("substring = " + substring);
        //一下子 截取末尾
        String substring1 = str2.substring(4);
        System.out.println("substring1 = " + substring1);
        String str3 = " 小 灰 灰 ";
        String trim = str3.trim();
        System.out.println("trim = " + trim);//trim 只能删除字符串两边空格 不能删除中间的
        String m = "ABC";
        String m1 = m.toLowerCase();
        System.out.println("m1 = " + m1);
        String n = "abc";
        String n1 = n.toUpperCase();
        System.out.println("n1 = " + n);
        System.out.println(m.equals(n));//false
        System.out.println(m.equalsIgnoreCase(n));//true 忽略大小写,验证码专用

        //把数字转换成字符串
        int u = 110;
        String s = String.valueOf(u);
        System.out.println("s = " + s+1);

        //写一个private方法,需要传一个string的网址参数，返回处理后的数据
        //假定 大数据截取了 很多网址 我想要 WWW ------
        //有以下 几类网址
        //WWW.oracale.com ---->  oracale
        //WWW.oracale.com.cn ---->  oracale
        //WWW.java.oracale.com.cn ---->  java.oracale
        //WWW.lol.oracale.com.cn ---->  lol.oracale
        //WWW.game.mycom.com.cn ---->  game.163
    }
}