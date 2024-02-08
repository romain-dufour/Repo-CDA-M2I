package org.example.domain.entity;

public class MeetingRoom {

    private int id;
    private int capacity;
    private Booking booking;
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
        this.setBooking(builder.booking);
    }
    public static class Builder {
        private int id;
        private int capacity;

        private Booking booking;

        public Builder id (int id) {
            this.id = id;
            return  this;
        }

        public Builder capacity (int capacity) {
            this.capacity = capacity;
            return  this;
        }

        public Builder booking (Booking booking) {
            this.booking = booking;
            return  this;
        }

        public MeetingRoom build(){ return new MeetingRoom(this);}
    }
}
