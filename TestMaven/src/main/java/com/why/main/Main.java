package com.why.main;

import com.why.config.MainConfiguration;
import com.why.pojo.Car;
import com.why.pojo.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //下方是通过xml配置来加载容器
        //ClassPathXmlApplicationContext conext = new ClassPathXmlApplicationContext("application.xml");
        //下面这个是通过配置类来加载容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        //System.out.println("测试运行输出");
        Student student = (Student) context.getBean("student");
        //Student student2 = (Student) context.getBean("student");
        System.out.println(student.toString());
        System.out.println(student.getMap());
        //System.out.println(student2);
        System.out.println("___________________");
        Car car = context.getBean(Car.class);
        System.out.println(car.toString());



    }
}
