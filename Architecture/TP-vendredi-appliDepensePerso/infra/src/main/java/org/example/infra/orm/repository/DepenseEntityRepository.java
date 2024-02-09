package org.example.infra.orm.repository;

import org.example.entity.Depense;
import org.example.infra.orm.entity.DepenseEntity;

import java.util.List;

public class DepenseEntityRepository extends Repository<DepenseEntity> {
    @Override
    public List<DepenseEntity> findAll() {
        return (session
                .createQuery("from DepenseEntity ", DepenseEntity.class))
                .list();
    }
}
