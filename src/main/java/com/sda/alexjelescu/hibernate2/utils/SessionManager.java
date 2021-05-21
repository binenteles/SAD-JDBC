package com.sda.alexjelescu.hibernate2.utils;


import com.sda.alexjelescu.hibernate2.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager{
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory(){

        return INSTANCE.getSessionFactory("sda_scheduler");

    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Team.class);
        configuration.addAnnotatedClass(Topic.class);
        configuration.addAnnotatedClass(ClassRoom.class);
        configuration.addAnnotatedClass(Attendance.class);
        configuration.addAnnotatedClass(Module.class);


    }

}
