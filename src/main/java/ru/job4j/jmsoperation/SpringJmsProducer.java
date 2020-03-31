package ru.job4j.jmsoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import ru.job4j.models.Location;

@Component
public class SpringJmsProducer {
    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jsa.activemq.queue}")
    String queue;

    public SpringJmsProducer(String url) {
    }

    public void send(Location location) {
        jmsTemplate.convertAndSend(queue, location);
    }

    public void start() {
    }
}

