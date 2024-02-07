package org.example.port;

import org.example.entity.Booking;
import org.example.entity.User;

public interface BookingRepository {
    void create(Booking booking);
    void delete(Booking booking);
    User findById (int id);
}
