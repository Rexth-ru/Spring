package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Person {
    private  Transport transport;
//    @Qualifier("moto")
//    @Autowired
//    public void setCar(Transport transport) {
//        this.transport = transport;
//    }

//       @Autowired
//        public Person(@Qualifier("moto") Transport transport) {
//        this.transport = transport;
//    }

    public Person(Transport transport) {
        this.transport = transport;
    }

    public void getDriveTransport(){
        System.out.println("Владелец сел в транспорт");
        transport.go();
    }
}
