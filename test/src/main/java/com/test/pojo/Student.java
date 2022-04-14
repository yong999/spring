package com.test.pojo;

import lombok.ToString;

import java.sql.SQLOutput;

//@ToString
public class Student {
    int age;
    String name;

    public void init(){
        System.out.println("我是初始方法");
    }
    public void destory(){
        System.out.println("我是销毁方法");
    }
    Student(){
        System.out.println("我被创建了");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int test(String str){
        System.out.println("这是执行方法。。。。"+str);
        return 1000;
    }
}
