package com.sda.alexjelescu.hibernate2.repository;

import com.sda.alexjelescu.hibernate2.model.ClassRoom;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClassRoomRepository {
    public ClassRoom findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        ClassRoom classRoom = session.find(ClassRoom.class, id);
        session.close();
        return classRoom;
    }

    public void save(ClassRoom classRoom) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(classRoom);
        transaction.commit();
        session.close();
    }

    public void delete(ClassRoom classRoom) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(classRoom);
        transaction.commit();
        session.close();
    }

    public void update(ClassRoom classRoom) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(classRoom);
        transaction.commit();
        session.close();
    }
}
