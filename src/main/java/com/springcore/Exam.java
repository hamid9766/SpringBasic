package com.springcore;

public class Exam {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Hamid");

        student.displayStudentInfo();

        //container object
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.getBean();*/

    }
}
