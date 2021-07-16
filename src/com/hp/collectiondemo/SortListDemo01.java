package com.hp.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 排序集合!!!对集合进行自然排序(从小到大)
* 它只能对list排序.对set不可以,因为set是无序的
* */
public class SortListDemo01 {
    public static void main(String[] args) {
       //纯数字
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(10);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        //纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("小灰灰");
        list1.add("灰太狼");
        list1.add("红太狼");
        list1.add("香太狼");
        list1.add("蕉太狼");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);
        //对象的排序(应用的地方很广)
        Person p1 = new Person();
        p1.setName("小灰灰");
        p1.setHeight(160);
        p1.setAge(18);
        Person p2 = new Person();
        p2.setName("灰太狼");
        p2.setHeight(170);
        p2.setAge(23);
        Person p3 = new Person();
        p3.setName("红太狼");
        p3.setHeight(175);
        p3.setAge(21);
        Person p4 = new Person();
        p4.setName("香太狼");
        p4.setHeight(180);
        p4.setAge(20);
        Person p5 = new Person();
        p5.setName("蕉太狼");
        p5.setHeight(165);
        p5.setAge(19);
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);
        //按照person的名字的长度排序.诸葛孔明，曹操

    }
}
