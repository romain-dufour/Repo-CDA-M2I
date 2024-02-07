package org.example.entity;

import java.time.LocalDateTime;

public class MeetingRoom {

    private int id;
    private int capacity;
    private LocalDateTime startReservation;

    private LocalDateTime endReservation;

    private Booking booking;

    public LocalDateTime getStartReservation() {
        return startReservation;
    }

    public void setStartReservation(LocalDateTime startReservation) {
        this.startReservation = startReservation;
    }

    public LocalDateTime getEndReservation() {
        return endReservation;
    }

    public void setEndReservation(LocalDateTime endReservation) {
        this.endReservation = endReservation;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    private MeetingRoom(Builder builder) {
        this.setId(builder.id);
        this.setCapacity(builder.capacity);
        this.setStartReservation(builder.startReservation);
        this.setEndReservation(builder.endReservation);
        this.setBooking(builder.booking);
    }
    public static class Builder {
        private int id;
        private int capacity;
        private LocalDateTime startReservation;

        private LocalDateTime endReservation;

        private Booking booking;

        public Builder id (int id) {
            this.id = id;
            return  this;
        }

        public Builder capacity (int capacity) {
            this.capacity = capacity;
            return  this;
        }

        public Builder startReservation (LocalDateTime startReservation) {
            this.startReservation = startReservation;
            return  this;
        }
        public Builder endReservation (LocalDateTime endReservation) {
            this.endReservation = endReservation;
            return  this;
        }
        public Builder booking (Booking booking) {
            this.booking = booking;
            return  this;
        }

        public MeetingRoom build(){ return new MeetingRoom(this);}
    }
}
