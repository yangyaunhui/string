package com.hp.collectiondemo;

//泛型必须要加,因为要做对比
public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
    //实现的接口是,比较接口,一个一个的比较.
    @Override
    public int compareTo(Person o) {
        //目前,按身高排序.
        //如果 return的返回值大于0 就是 自身大于比较对象
        //int x = this.getHeight()-o.getHeight();
        int x = this.getAge() - o.getAge();
        return x;
    }
}

