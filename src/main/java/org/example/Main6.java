package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Moto moto1 = context.getBean("moto", Moto.class);
        Moto moto2 = context.getBean("moto", Moto.class);

        System.out.println(moto1==moto2);
        context.close();
    }
}
