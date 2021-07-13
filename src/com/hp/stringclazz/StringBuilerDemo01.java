package com.hp.stringclazz;
/*
* StringBuiler(线程不安全,速度快)/Buffer(线程安全,速度慢) 解决了字符串频繁的问题
* 意思是把String升级了
* String 类 重点 重用性
* StringBuiler/Buffer 更倾向于 对字符串的 修改
* 当用到字符大量的增加/修改/删除的时候,就使用 StringBuiler/Buffer
* StringBuiler 的优点:内部有个 可变的数组,速度快，内存消耗小
* 在公司实际开发中,字符串的增删改，要使用 StringBuiler/Buffer
* */
public class StringBuilerDemo01 {
    public static void main(String[] args) {
       String str = "好好的学习Java";
       StringBuilder sb = new StringBuilder(str);
       //1.追加
        sb.append(",为了找一份优质工作");
        System.out.println("sb = " + sb);
        //2.修改
        sb.replace(10,19,"为了改变世界");
        System.out.println("sb = " + sb);
        //3.删除
        sb.deleteCharAt(2); //删除指定字符
        System.out.println("sb = " + sb);
        //3.1 删除字符区间 常用
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //3.2 删除全部
        sb.delete(0,sb.length());
        //4.插入 增加
        sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //5.为字符串反转
        StringBuilder reverse = sb.reverse();
        //System.out.println("reverse = " + reverse);
        System.out.println("sb = " + sb);
    }
}
