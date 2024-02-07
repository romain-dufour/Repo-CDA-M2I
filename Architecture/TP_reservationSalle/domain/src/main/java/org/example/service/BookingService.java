package org.example.service;

import org.example.entity.Booking;
import org.example.entity.MeetingRoom;
import org.example.entity.User;
import org.example.port.BookingRepository;

public class BookingService {
    private final BookingRepository bookingRepository;


    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }


    public Booking createBooking(User user, MeetingRoom meetingRoom) {
        if (user == null || meetingRoom == null) {
            throw new RuntimeException("User or Meeting must be created");
        }
        Booking booking = new Booking.Builder().user(user).meetingRoom(meetingRoom).build();
        return booking;
    }
}
