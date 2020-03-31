package ru.job4j.messager;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author
 */
final class Program {
  /*  *//**
     * Entry point
     *//*
    public static void main(String[] args) {
        String url = "tcp://localhost:8080"; //
        try (SpringJmsProducer producer = new SpringJmsProducer(url);
             SpringJmsConsumer consumer = new SpringJmsConsumer(url, "test.in")) {
            producer.start();
            consumer.init();

            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
            Location location = null;
            producer.send(location);

            System.out.println("Bye!");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }*/
}
