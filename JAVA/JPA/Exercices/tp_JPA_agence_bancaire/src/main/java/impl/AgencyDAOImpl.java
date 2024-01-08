package impl;

import dao.AgencyDAO;
import models.Account;
import models.Agency;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class AgencyDAOImpl implements AgencyDAO {

    private EntityManagerFactory entityManagerFactory;
    public AgencyDAOImpl(EntityManagerFactory entityManagerFactory){
        this.entityManagerFactory = entityManagerFactory;
    }
    @Override
    public boolean addAgency(Agency agency) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(agency);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }

    }

    @Override
    public boolean deleteAgency(Long agencyId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Agency agency = entityManager.find(Agency.class,agencyId);
            if(agency != null){
                entityManager.remove(agency);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    public Agency getAgencyById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<Agency> agencyList = entityManager.createQuery("SELECT a FROM Agency a", Agency.class).getResultList();

        for (Agency agency : agencyList
        ) {
            if (agency.getId() == id) {
                return agency;
            }
        }
        return null;
    }


}
