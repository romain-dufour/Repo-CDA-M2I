package org.example.infra.orm.repository;

import org.example.infra.orm.entity.UserEntity;

import java.util.List;

public class UserEntityRepository extends Repository<UserEntity> {
    @Override
    public UserEntity findById(int id) {
        return session.get(UserEntity.class, id);
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }
}
