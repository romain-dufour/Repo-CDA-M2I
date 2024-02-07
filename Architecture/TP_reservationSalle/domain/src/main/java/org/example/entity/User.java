package org.example.entity;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private int id;
    private String userName;
    private boolean admin;

    private List<Booking> bookingList;

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    private User(Builder builder) {
        this.setId(builder.id);
        this.setUserName(builder.userName);
        this.setAdmin(builder.admin);
        this.setBookingList(builder.bookingList);
    }
    public static class Builder {
        public String userName;
        private int id;
        private boolean admin;
        private List<Booking> bookingList;


        public User.Builder id (int id) {
            this.id = id;
            return  this;
        }

        public User.Builder userName (String userName) {
            this.userName = userName;
            return  this;
        }

        public User.Builder admin (boolean admin) {
            this.admin = admin;
            return  this;
        }
        public User.Builder bookingList (List<Booking> bookingList) {
            this.bookingList = bookingList;
            return  this;
        }

        public User build(){ return new User(this);}
    }
}
