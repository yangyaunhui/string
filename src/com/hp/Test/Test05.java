package com.hp.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
*创建一个List集合，并添加元素0-9
*将集合转换为一个Integer数组并输出数组每一个元素
* * @author Xiloer
* */
public class Test05 {
    public static void main(String[] args) {
        //List集合转Integer数组,注意List集合不能直接转成Integer数组,只能通过遍历转换
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Integer[] integer = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(integer));
        //list集合转成Integer
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        System.out.println(Arrays.toString(ints));
    }
}
