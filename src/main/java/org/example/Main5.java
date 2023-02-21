package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Car car1 = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);
        System.out.println(car2==car1);
        context.close();

    }
}
