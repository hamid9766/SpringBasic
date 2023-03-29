package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aloneconfig.xml");
        Person p1 = context.getBean("person1", Person.class);
        System.out.println(p1);
        System.out.println("----------------------------");
        System.out.println(p1.getFeeStructure());
        System.out.println(p1.getFeeStructure().getClass().getName());
        System.out.println("----------------------------");
        System.out.println(p1.getProperties());
    }
}
