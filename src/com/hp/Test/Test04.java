package com.hp.Test;

import java.util.ArrayList;
import java.util.List;

/*
*创建一个List集合并添加元素0-9
*然后获取子集[3,4,5,6]
*然后将子集元素扩大10倍
*然后输出原集合。
*之后删除集合中的[7,8,9]
*@author Xiloer
* */
public class Test04 {
    public static void main(String[] args) {
        //创建集合,添加元素0-9
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
        //获取子集[3,4,5,6]
        List<Integer> integers = list.subList(2, 6);
        System.out.println("integers = " + integers);
        for (int i = 0; i < integers.size(); i++) {
            int i1 = integers.get(i);
            //将子集元素扩大10倍
            i1 = i1 * 10;
            integers.set(i,i1);
            System.out.println("i1 = " + i1);
        }
        //输出原集合
        System.out.println(list);
        //删除集合中的[7,8,9]

    }
}
