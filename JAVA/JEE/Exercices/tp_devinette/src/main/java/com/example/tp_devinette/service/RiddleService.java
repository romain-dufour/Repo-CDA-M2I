package com.example.tp_devinette.service;

import com.example.tp_devinette.entity.Ridlle;
import com.example.tp_devinette.exception.RiddleException;
import com.example.tp_devinette.repository.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RiddleService {
    Repository<Ridlle> ridlleRepository;
    SessionFactory sessionFactory;

    public RiddleService(SessionFactory sessionFactory, Repository<Ridlle> ridlleRepository){
        this.ridlleRepository = ridlleRepository;
        this.sessionFactory = sessionFactory;
    }

    public boolean createRiddle(String textRiddle, String expectedAnswer) throws RiddleException {
        boolean result = false;
        Session session = sessionFactory.openSession();
        ridlleRepository.setSession(session);
        Ridlle ridlle = Ridlle.builder()
                .textRiddle(textRiddle)
                .expectedAnswer(expectedAnswer)
                .build();
        session.beginTransaction();
        try {
            ridlleRepository.create(ridlle);
            session.getTransaction().commit();
            result=true;
        } catch (Exception e){
            session.getTransaction().rollback();
            throw new RiddleException();
        }finally {
            session.close();
        }
        return  result;
    }



}
