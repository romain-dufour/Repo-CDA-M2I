package org.example.infra.orm.repository.impl;

import org.example.domain.entity.MeetingRoom;
import org.example.infra.orm.entity.MeetingRoomEntity;
import org.example.domain.port.MeetingRoomRepository;
import org.example.infra.orm.repository.MeetingRoomEntityRepository;
import org.example.infra.orm.util.HibernateSession;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.List;

public class MeetingRoomRepositoryImpl implements MeetingRoomRepository {

    private final MeetingRoomEntityRepository meetingRoomEntityRepository;

    public MeetingRoomRepositoryImpl(MeetingRoomEntityRepository meetingRoomEntityRepository) {
        this.meetingRoomEntityRepository = meetingRoomEntityRepository;
    }


    @Override
    public void create(MeetingRoom meetingRoom) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            meetingRoomEntityRepository.setSession(session);
            MeetingRoomEntity meetingRoomEntity = MeetingRoomEntity.builder().capacity(meetingRoom.getCapacity()).build();
            meetingRoom.setId(meetingRoom.getId());
            meetingRoomEntityRepository.create(meetingRoomEntity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public void delete(MeetingRoom meetingRoom) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            meetingRoomEntityRepository.setSession(session);
            MeetingRoomEntity meetingRoomEntity = meetingRoomEntityRepository.findById(meetingRoom.getId());
            meetingRoomEntityRepository.delete(meetingRoomEntity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public void update(MeetingRoom meetingRoom) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();

    }

    @Override
    public MeetingRoom findById(int id) {
        return null;
    }

    @Override
    public List<MeetingRoom> searchByLocalDateTime(LocalDateTime localDateTime) {
        return null;
    }



}
