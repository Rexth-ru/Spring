package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Car car = context.getBean("customCar", Car.class);
        Car car1 = context.getBean("customCar", Car.class);
        System.out.println(car == car1);
        context.close();
    }
}