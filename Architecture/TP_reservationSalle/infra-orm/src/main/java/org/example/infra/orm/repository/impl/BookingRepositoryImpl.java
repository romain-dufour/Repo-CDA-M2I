package org.example.infra.orm.repository.impl;

import org.example.domain.entity.Booking;
import org.example.infra.orm.entity.BookingEntity;
import org.example.domain.port.BookingRepository;
import org.example.infra.orm.repository.BookingEntityRepository;
import org.example.infra.orm.util.HibernateSession;
import org.hibernate.Session;

public class BookingRepositoryImpl implements BookingRepository {
    private final BookingEntityRepository bookingEntityRepository;

    public BookingRepositoryImpl(BookingEntityRepository bookingEntityRepository) {
        this.bookingEntityRepository = bookingEntityRepository;
    }


    @Override
    public void create(Booking booking) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            bookingEntityRepository.setSession(session);
            BookingEntity bookingEntity = BookingEntity.builder()
                    .startReservation(booking.getStartReservation())
                    .endReservation(booking.getEndReservation())
                    .build();
            bookingEntityRepository.create(bookingEntity);
            booking.setId(booking.getId());
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public void delete(Booking booking) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            bookingEntityRepository.setSession(session);
            BookingEntity bookingEntity  = bookingEntityRepository.findById(booking.getId());
            bookingEntityRepository.delete(bookingEntity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public Booking findById(int id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        bookingEntityRepository.setSession(session);
        try (session){
            BookingEntity bookingEntity = bookingEntityRepository.findById(id);
            return bookingEntity.toBooking();
        }

    }
}
