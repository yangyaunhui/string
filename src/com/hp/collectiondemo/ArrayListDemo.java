package com.hp.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*  JDK 8 的 快速 去 集合中的属性
*
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaochan = new Person();
                diaochan.setAge(18);
                diaochan.setHeight(170);
                diaochan.setName("貂蝉");

        Person xiaoqiao = new Person();
                xiaoqiao.setAge(19);
                xiaoqiao.setHeight(160);
                xiaoqiao.setName("小乔");

        Person sunshangxiang = new Person();
                sunshangxiang.setAge(22);
                sunshangxiang.setHeight(170);
                sunshangxiang.setName("孙尚香");
        //需求:  有个曹操,需要一个 String 集合,该集合中的值是提取与上面3000个list中的值, 把美女名字存进去
        List<Person> list = new ArrayList();
                list.add(diaochan);
                list.add(xiaoqiao);
                list.add(sunshangxiang);
        System.out.println("list = " + list);

        List<String> names = new ArrayList<>();
        //1. 遍历 list 集合,拿出对象的names 赋给 新的 names 集合中
//        for (Person s : list) {
//           String name =  s.getName();
//                names.add(name);//2.赋值给新的集合
//        }
//        System.out.println("names = " + names);

        //以上是传统的,新的呢? JDK8 Stream() 自我学习JDK8
        List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameLists = " + nameLists);

    }
}
