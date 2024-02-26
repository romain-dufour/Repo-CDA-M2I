package com.example.exercice1springreactive.entity;

public class Message {
    private long id;

    private String content;

    private User user;

    public Message() {
    }

    public Message(long id, String content, User user) {
        this.id = id;
        this.content = content;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
