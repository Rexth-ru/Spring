package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Moto implements Transport{
    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }
    @PostConstruct
    public void init(){
        System.out.println("Работает init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Работает destroy");
    }
}
