package ru.job4j.jmsoperation;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.job4j.models.Location;


/**
 * Created by Comp on 08.03.2018.
 */
@Service
public class SpringJMSListener {
    @Component
    public class Receiver {

        @JmsListener(destination = "mailbox", containerFactory = "myFactory")
        public void receiveMessage(Location location) {
            System.out.println("Received <" + location + ">");
        }
    }
}
