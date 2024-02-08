package org.example.infra.orm.repository;

import org.example.infra.orm.entity.MeetingRoomEntity;

import java.util.List;

public class MeetingRoomEntityRepository extends Repository<MeetingRoomEntity> {
    @Override
    public MeetingRoomEntity findById(int id) {
        return session.get(MeetingRoomEntity.class, id);
    }

    @Override
    public List<MeetingRoomEntity> findAll() {
        return null;
    }
}
