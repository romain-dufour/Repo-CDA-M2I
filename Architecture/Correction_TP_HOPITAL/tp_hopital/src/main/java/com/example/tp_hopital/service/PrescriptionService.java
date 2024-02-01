package com.example.tp_hopital.service;

import com.example.tp_hopital.entity.Consultation;
import com.example.tp_hopital.entity.Prescription;
import com.example.tp_hopital.exception.RepositoryException;
import com.example.tp_hopital.repository.PrescriptionRepository;
import com.example.tp_hopital.repository.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PrescriptionService {
    Repository<Prescription> prescriptionRepository;

    SessionFactory sessionFactory;

    public PrescriptionService(SessionFactory sessionFactory, PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
        this.sessionFactory = sessionFactory;
    }

    public boolean createPrescription(String medicType, int duration , Consultation consultation) throws RepositoryException {
        boolean result = false;
        Session session = sessionFactory.openSession();
        prescriptionRepository.setSession(session);
        Prescription prescription = Prescription.builder()
                .medicType(medicType)
                .duration(duration)
                .consultation(consultation)
                .build();
        session.beginTransaction();
        try {
            prescriptionRepository.create(prescription);
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
