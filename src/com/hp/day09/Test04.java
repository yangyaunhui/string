package com.hp.day09;

import java.io.File;

/*
*获取并输出当前目录下的所有文件和目录的名字
*@author Xiloer
*/
public class Test04 {
    public static void main(String[] args) {
        File dir = new File("src");//获取当前目录下的文件以及文件夹的名称
        printDir(dir);
    }
    public static void printDir(File dir) {
        //获取子文件和目录
        File[] files = dir.listFiles();
        //循环打印
        for (File file : files) {
            //判断
            if (file.isFile()) {
                //是文件，输出文件绝对路径
                System.out.println("文件名：" + file.getAbsolutePath());
            } else {
                //是目录，输出目录绝对路径
                System.out.println("目录：" + file.getAbsolutePath());
                //继续遍历，调用printDir，形成递归
                printDir(file);
            }
        }
    }
}
