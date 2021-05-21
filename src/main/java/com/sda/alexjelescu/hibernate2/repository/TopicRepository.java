package com.sda.alexjelescu.hibernate2.repository;

import com.sda.alexjelescu.hibernate2.model.Topic;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class TopicRepository {
    public Topic findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Topic topic = session.find(Topic.class, id);
        session.close();
        return topic;
    }

    public void save(Topic topic) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(topic);
        transaction.commit();
        session.close();
    }
    public void delete(Topic topic) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(topic);
        transaction.commit();
        session.close();
    }
    public void update(Topic topic) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(topic);
        transaction.commit();
        session.close();
    }
}
