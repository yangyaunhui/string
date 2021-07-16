package com.hp.Test;

import java.util.Arrays;
import java.util.List;

/*
* 创建一个字符串数组:{"one","two","three"}
* 然后将该数组转换为一个List集合
* @author Xiloer
* */
public class Test06 {
    public static void main(String[] args) {
        String[] number = {"one","two","three"};
        List<String> numberList = Arrays.asList(number);
        for (String s : numberList) {
            System.out.println(s);
        }
    }
}
