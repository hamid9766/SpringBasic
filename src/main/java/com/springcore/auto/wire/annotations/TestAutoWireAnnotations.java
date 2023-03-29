package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireAnnotations {
    public static void main(String[] args) {
        ApplicationContext conetext = new ClassPathXmlApplicationContext("autowireannotationconfig.xml");

        //  In Below line we are using this format to avoid Type Casting and also providing the classType of emp Object
        Emp emp = conetext.getBean("emp1", Emp.class);
        System.out.println(emp);
        
    }
}
