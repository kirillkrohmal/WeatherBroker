package ru.job4j.services;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Condition;


public class WeatherHibernate extends HibernateUtil {
    private static final Logger log = LoggerFactory.getLogger(WeatherHibernate.class);

    public Condition saveLocation(Condition condition) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(condition);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return condition;
    }
}
