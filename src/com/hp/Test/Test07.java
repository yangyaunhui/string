package com.hp.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
* 创建一个List集合，并存放10个随机数，然后排序该集合
* 后输出
* @author Xiloer
* */
public class Test07 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {//生成10个100内的随机数
            Random r = new Random();
            int a =r.nextInt(100); //转为int类型
            list.add(0,a);//存入list集合
        }
        ppp(list);//调用下面定义好的排序方法
        Iterator i = list.iterator();//获取迭代器
        while(i.hasNext()) {//判断是否有下一个元素
            System.out.print(i.next() + " ");//输出
        }
    }
    public static void ppp(List list) {//定义一个排序的方法，对list集合进行排序
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Object obj1 = list.get(i);
                int i1 = (int) obj1;//将list元素转换为int类型，方便比较大小
                Object obj2 = list.get(j);
                int i2 = (int) obj2; //将list元素转换为int类型，方便比较大小
                if (i1 > i2) {//比较两个值的大小，将较小的元素换到前面
                    list.set(i, list.get(j));
                    list.set(j, obj1);
                }
            }
        }
    }
}
