package org.example.domain.port;

import org.example.domain.entity.Booking;

public interface BookingRepository {
    void create(Booking booking);
    void delete(Booking booking);
    Booking findById (int id);
}
