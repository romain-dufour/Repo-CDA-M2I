package org.example.domain.service;

import org.example.domain.entity.User;
import org.example.domain.entity.Booking;
import org.example.domain.entity.MeetingRoom;
import org.example.domain.port.BookingRepository;

import java.time.LocalDateTime;

public class BookingService {
    private final BookingRepository bookingRepository;


    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public Booking createBooking(User user, MeetingRoom meetingRoom, LocalDateTime startReservation, LocalDateTime endReservation) {
        if (user == null || meetingRoom == null) {
            throw new RuntimeException("User or Meeting must be created");
        }
        Booking booking = new Booking.Builder().user(user).meetingRoom(meetingRoom).startReservation(startReservation).endReservation(endReservation).build();
        return booking;
    }
}
