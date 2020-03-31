package ru.job4j.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.springframework.stereotype.Component;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 07.07.2016
 */
@Component("messageSender")
public class MessageSender extends Location {
    final JmsTemplate jmsTemplate;

    @Autowired
    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public MessageSender(String city, JmsTemplate jmsTemplate) {
        super(city);
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(final Location location) {

        jmsTemplate.send(new MessageCreator(){
            @Override
            public Message createMessage(javax.jms.Session session) throws JMSException {
                ObjectMessage objectMessage = session.createObjectMessage(location);
                return objectMessage;
            }
        });
    }
}

