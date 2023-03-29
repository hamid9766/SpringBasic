package com.springcore.lifecycle;

import com.springcore.ci.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
      /*  Samosa s = (Samosa) context.getBean("samosa");
        System.out.println(s);

        context.registerShutdownHook();

        SoftDrink p = (SoftDrink) context.getBean("coke");
        System.out.println(p);*/

        Example e = (Example) context.getBean("subject");
        System.out.println(e);
    }
}
