package com.sda.alexjelescu.hibernate2.repository;

import com.sda.alexjelescu.hibernate2.model.Person;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonRepository {
    public Person findById(Integer id){
        Session session = SessionManager.getSessionFactory().openSession();
        Person person = session.find(Person.class, id);
        session.close();
        return person;
    }
    public void save(Person person) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }
    public void delete(Person person) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(person);
        transaction.commit();
        session.close();
    }
    public void update(Person person) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();
        session.close();
    }
}
