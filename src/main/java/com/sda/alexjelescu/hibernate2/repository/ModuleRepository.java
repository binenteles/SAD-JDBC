package com.sda.alexjelescu.hibernate2.repository;

import com.sda.alexjelescu.hibernate2.model.Module;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ModuleRepository {
    public Module findById(Integer id){
        Session session = SessionManager.getSessionFactory().openSession();
        Module module = session.find(Module.class, id);
        session.close();
        return module;
    }

    public void save(Module module){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        session.save(module);
        transaction.commit();
        session.close();
    }

    public void delete(Module module){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        session.delete(module);
        transaction.commit();
        session.close();
    }
    public void update(Module module){
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        session.update(module);
        transaction.commit();
        session.close();
    }
}
