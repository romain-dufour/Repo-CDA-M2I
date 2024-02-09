package org.example.infra.orm.repository.impl;

import org.example.entity.Depense;
import org.example.infra.orm.entity.DepenseEntity;
import org.example.infra.orm.repository.DepenseEntityRepository;
import org.example.infra.orm.util.HibernateSession;
import org.example.port.DepenseRepository;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

public class DepenseRepositoryImpl implements DepenseRepository {

    private final DepenseEntityRepository depenseEntityRepository;

    public DepenseRepositoryImpl(DepenseEntityRepository depenseEntityRepository) {
        this.depenseEntityRepository = depenseEntityRepository;
    }


    @Override
    public void create(Depense depense) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            depenseEntityRepository.setSession(session);
            DepenseEntity depenseEntity = DepenseEntity.builder()
                    .titre(depense.getTitre())
                    .montant(depense.getMontant())
                    .build();
            depenseEntityRepository.create(depenseEntity);
            depense.setId(depense.getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public List<Depense> listDepense() {
        Session session = HibernateSession.getSessionFactory().openSession();
        depenseEntityRepository.setSession(session);
        try (session){
            return depenseEntityRepository.findAll()
                    .stream()
                    .map(depenseEntity -> depenseEntity.toDepense())
                    .collect(Collectors.toList());
        }
    }
}
