package com.sda.alexjelescu.hibernate2.repository;

import com.sda.alexjelescu.hibernate2.model.Attendance;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AttendanceRepository {
    public Attendance findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Attendance attendance = session.find(Attendance.class, id);
        session.close();
        return attendance;
    }

    public void save(Attendance attendance) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(attendance);
        transaction.commit();
        session.close();
    }

    public void delete(Attendance attendance) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(attendance);
        transaction.commit();
        session.close();
    }

    public void update(Attendance attendance) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(attendance);
        transaction.commit();
        session.close();
    }
}
