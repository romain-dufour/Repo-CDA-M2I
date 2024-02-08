package org.example.infra.orm.repository;

import org.example.infra.orm.entity.BookingEntity;

import java.time.LocalDateTime;
import java.util.List;

public class BookingEntityRepository extends Repository<BookingEntity> {
    @Override
    public BookingEntity findById(int id) {
        return session.get(BookingEntity.class, id);
    }

    @Override
    public List<BookingEntity> findAll() {
        return null;
    }

    public List<BookingEntity> findAvailableMeetingRoom(LocalDateTime startDate, LocalDateTime endDate) {
        return (session
                .createQuery("from BookingEntity where :startDate > endReservation and :endDate < startReservation", BookingEntity.class)
                .setParameter("startDate", startDate)
                .setParameter( "endDate", endDate))
                .list();
    }
}
