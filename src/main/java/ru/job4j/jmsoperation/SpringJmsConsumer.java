package ru.job4j.jmsoperation;


import org.springframework.jms.annotation.JmsListener;
import ru.job4j.models.Location;

public class SpringJmsConsumer {
    @JmsListener(destination = "${jsa.activemq.queue}", containerFactory="jsaFactory")
    public void receive(Location location){
        System.out.println("Recieved Message: " + location);
    }

    public void init() {
    }
}
