package com.hp.collectiondemo;

import java.util.*;

/*
* 模拟斗地主洗牌
* 牌数:54张,大王,小王,1-K,四个桃
*♥,♠,♣,♦
* 1-10
* */
public class DouDiZhuTest {
    public static void main(String[] args) {
        //1.先造出4个花色
        List<String> colors = new ArrayList<>();
            colors.add("♥");
            colors.add("♠");
            colors.add("♣");
            colors.add("♦");
        //2.造出 10 个 2-10
        List<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i+"");
        }
            numbers.add("J");
            numbers.add("Q");
            numbers.add("K");
            numbers.add("A");
        //3.上面的 colors 和 numbers进行一个 整合.
        //放入到一个新的集合中 如何嵌套循环
        List<String> piker = new ArrayList<>();
        //Set<String> piker = new HashSet<>();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("LitterKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        //如果使用set无法分开排序,改为list,有一个方法可以打乱
        //因为set无序
        Collections.shuffle(piker);//打断list排序 斗地主学名 洗牌
        System.out.println("piker = " + piker);
        //给play1,play2,play3 发牌
        List<String> play1 = new ArrayList<>();//玩家1
        List<String> play2 = new ArrayList<>();//玩家2
        List<String> play3 = new ArrayList<>();//玩家3
        List<String> dipai = new ArrayList<>();//3张底牌

        for (int i = 0; i <piker.size(); i++) {
            String pName = piker.get(i);//每张扑克牌
           /* if (i >= 51) {
                dipai.add(pName);//埋最后三张的底牌
            }else {
            //给玩家发前51张牌
                if(i%3 == 0){
                    play1.add(pName);
                }else if(i%3 == 1){
                    play2.add(pName);
                }else{
                    play3.add(pName);
                }
            }
        }*/

            if (dipai.contains("♥3") == false) {
                if (i >= 51) {
                    dipai.add(pName);
                }else {
                    if (i%3 == 0) {
                        play1.add(pName);
                    }else if(i%3==1){
                        play2.add(pName);
                    }else{
                        play3.add(pName);
                    }
                }
            }else{
                System.out.println("底牌不能有♥3，请重新运行");
                break;
            }
        }
        System.out.println("play1 = " + play1);
        System.out.println("play1 = " + play1.size());
        System.out.println("play2 = " + play2);
        System.out.println("play2 = " + play2.size());
        System.out.println("play3 = " + play3);
        System.out.println("play3 = " + play3.size());
        System.out.println("底牌是" + dipai);

      /*  Collections.sort(piker);//list的快速排序(不是人工智能排序)
        System.out.println("piker = " + piker);*/

        //规定个地主,  规定 谁摸到红桃3 谁是地主,  注意:  底牌里面不能包含红桃3 .
        if(play1.contains("♥3")==true){
            System.out.println("player1是地主");
            play1.addAll(dipai);
            System.out.println("player1 = " + play1);
        }else if(play2.contains("♥3")==true){
            System.out.println("player2是地主");
            play2.addAll(dipai);
            System.out.println("player2 = " + play2);
        }else if(play3.contains("♥3")==true){
            System.out.println("player3是地主");
            play3.addAll(dipai);
            System.out.println("player3 = " + play3);
        }
    }
}
