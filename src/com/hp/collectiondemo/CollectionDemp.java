package com.hp.collectiondemo;

import java.util.ArrayList;

/*
* 集合 有一个接口 (接口可以继承接口)
* length()方法:指的是没有泛型的类
* size():放很多东西
* */
public class CollectionDemp {
    public static void main(String[] args) {
        //Collection c1 = new ArrayList();
        ArrayList c1 = new ArrayList();
        //add 增加
        c1.add("唐僧--执着的目标");
        c1.add("吉吉国王--过硬的技术");
        c1.add("猪八戒--老色皮,体贴关怀");
        c1.add("臭咸鱼--稳重的劳动");
        c1.add("白龙马--代表出门宝马,面儿");
        System.out.println("c1 = " + c1);
        //尺寸
        int size = c1.size();
        System.out.println("size = " + size);
        //是否为空
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //集合的清空
        //c1.clear();
        System.out.println("c1 = " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);

        //集合的遍历  3种
        //1.
        for (int i = 0; i < c1.size() ; i++) {
            System.out.println("c1 = " + c1.get(i));
        }
        //为什么  collection 不能使用 for 循环??? 换句话来说 为什么不能根据索引来取值
        //因为 set 集合 么有 索引下标,所以 for 循环 不能使用到 collection中
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器 和 for 循环的区别
        //迭代器工作:有游标,问下一个,有木有下一个元素,如果有就拿出,没有即结束
        //for循环的工作:把集合从0--N 排序,从0开取,拿下标 揭示了 为什么学了for循环后,再学迭代器


    }

}
