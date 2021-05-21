package com.sda.alexjelescu.hibernate2.repository;


import com.sda.alexjelescu.hibernate2.model.Team;
import com.sda.alexjelescu.hibernate2.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeamRepository {
    public Team findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Team team = session.find(Team.class, id);
        session.close();
        return team;
    }

    public void save(Team team) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(team);
        transaction.commit();
        session.close();
    }
    public void delete(Team team) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(team);
        transaction.commit();
        session.close();
    }
    public void update(Team team) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(team);
        transaction.commit();
        session.close();
    }
}
