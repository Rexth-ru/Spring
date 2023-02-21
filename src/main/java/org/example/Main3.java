package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext( "applicationContext3.xml");
        Person person = context.getBean("person", Person.class);
        person.getDriveTransport();
        context.close();
    }
}
