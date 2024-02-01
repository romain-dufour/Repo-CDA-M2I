package com.example.tp_hopital.repository;

import com.example.tp_hopital.entity.Consultation;
import org.hibernate.Session;


import java.util.List;

public class ConsultationRepository extends Repository<Consultation> {

    public ConsultationRepository(){

    }
    @Override
    Consultation findById(int id) {
        return session.get(Consultation.class, id);
    }

    @Override
    List<Consultation> findAll() {
        return session.createQuery("from Consultation").list();
    }
}
