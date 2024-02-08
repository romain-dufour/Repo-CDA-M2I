package org.example.domain.entity;

import java.time.LocalDateTime;

public class Booking {

    private int id;
    private User user;
    private MeetingRoom meetingRoom;

    private LocalDateTime startReservation;

    private LocalDateTime endReservation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

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

    private Booking(Booking.Builder builder) {
        this.setId(builder.id);
        this.setUser(builder.user);
        this.setStartReservation(builder.startReservation);
        this.setEndReservation(builder.endReservation);
        this.setMeetingRoom(builder.meetingRoom);
        this.setUser(builder.user);
    }


    public static class Builder {
        private int id;
        private User user;
        private MeetingRoom meetingRoom;
        private LocalDateTime startReservation;

        private LocalDateTime endReservation;


        public Booking.Builder id (int id) {
            this.id = id;
            return  this;
        }

        public Booking.Builder startReservation (LocalDateTime startReservation) {
            this.startReservation = startReservation;
            return  this;
        }

        public Booking.Builder endReservation (LocalDateTime endReservation) {
            this.endReservation = endReservation;
            return  this;
        }

        public Booking.Builder user (User user) {
            this.user = user;
            return  this;
        }

        public Booking.Builder meetingRoom (MeetingRoom meetingRoom) {
            this.meetingRoom = meetingRoom;
            return  this;
        }

        public Booking build(){ return new Booking(this);}
    }

}
