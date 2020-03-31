package ru.job4j.jmsoperation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

/**
 * Created by Comp on 08.03.2018.
 */
public class SpringJMSTemplate implements MessageSender {
    @Autowired
    private JmsTemplate jmsTemplate;
    private Connection connect;

    /**
     * Создает подключение к серверу jms
     */

/*
    private void createConnection() throws Exception {
        if (connect == null) {
            ConnectionFactory factory = (ConnectionFactory) Class.forName(factoryClass).getConstructor(String.class).newInstance(url);
            connect = factory.createConnection(user, password);
            connect.setClientID(clientId);
        }
    }
*/
    public void send(final String message) {
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}