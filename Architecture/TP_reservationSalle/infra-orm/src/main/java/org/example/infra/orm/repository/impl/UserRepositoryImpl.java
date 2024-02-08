package org.example.infra.orm.repository.impl;

import org.example.domain.entity.User;
import org.example.infra.orm.entity.UserEntity;
import org.example.domain.port.UserRepository;
import org.example.infra.orm.repository.UserEntityRepository;
import org.example.infra.orm.util.HibernateSession;
import org.hibernate.Session;

public class UserRepositoryImpl implements UserRepository {

    private final UserEntityRepository userEntityRepository;

    public UserRepositoryImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }




    @Override
    public void create(User user) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            userEntityRepository.setSession(session);
            UserEntity userEntity = UserEntity.builder().userName(user.getUserName())
                    .admin(user.isAdmin()).build();
            userEntityRepository.create(userEntity);
            user.setId(user.getId());
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public void delete(User user) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            userEntityRepository.setSession(session);
            UserEntity userEntity  = userEntityRepository.findById(user.getId());
            userEntityRepository.delete(userEntity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public User findById(int id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        userEntityRepository.setSession(session);
        try (session){
            UserEntity userEntity = userEntityRepository.findById(id);
            return userEntity.toUser();
        }    }
}
