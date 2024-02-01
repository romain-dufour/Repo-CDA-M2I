package com.example.tp_hopital.service;

import com.example.tp_hopital.entity.Consultation;
import com.example.tp_hopital.entity.FicheSoin;
import com.example.tp_hopital.entity.Prescription;
import com.example.tp_hopital.exception.RepositoryException;
import com.example.tp_hopital.repository.FicheSoinRepository;
import com.example.tp_hopital.repository.PrescriptionRepository;
import com.example.tp_hopital.repository.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FicheSoinService {
    Repository<FicheSoin> ficheSoinRepository;

    SessionFactory sessionFactory;

    public FicheSoinService(SessionFactory sessionFactory, FicheSoinRepository ficheSoinRepository) {
        this.ficheSoinRepository = ficheSoinRepository;
        this.sessionFactory = sessionFactory;
    }

    public boolean createFicheSoin(String typeOfCare, int duration , Consultation consultation) throws RepositoryException {
        boolean result = false;
        Session session = sessionFactory.openSession();
        ficheSoinRepository.setSession(session);
        FicheSoin ficheSoin  = FicheSoin.builder()
                .typeOfCare(typeOfCare)
                .duration(duration)
                .consultation(consultation)
                .build();
        session.beginTransaction();
        try {
            ficheSoinRepository.create(ficheSoin);
            session.getTransaction().commit();
            result = true;
        } catch (Exception ex){
            session.getTransaction().rollback();
            throw new RepositoryException();
        }finally {
            session.close();
        }
        return result;
    }
}
