package com.test.main;

import com.test.pojo.Student;
import lombok.ToString;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student stu = context.getBean(Student.class);
        System.out.println(stu.test("123"));
        //Student stu2 = context.getBean(Student.class);
        //System.out.println(stu);
        //System.out.println(stu2);
        context.close();
    }
}
