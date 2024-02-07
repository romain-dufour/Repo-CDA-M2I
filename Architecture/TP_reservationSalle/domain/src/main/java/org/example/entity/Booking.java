package org.example.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {

    private int id;
    private User user;
    private MeetingRoom meetingRoom;

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

    private Booking(Booking.Builder builder) {
        this.setId(builder.id);
        this.setUser(builder.user);
        this.setMeetingRoom(builder.meetingRoom);
        this.setUser(builder.user);
    }
    public static class Builder {
        private int id;
        private User user;
        private MeetingRoom meetingRoom;

        public Booking.Builder id (int id) {
            this.id = id;
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
