package com.example.exercice1springreactive.entity;


public class User {

     private long id;
     private String userName;

    public User(long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
