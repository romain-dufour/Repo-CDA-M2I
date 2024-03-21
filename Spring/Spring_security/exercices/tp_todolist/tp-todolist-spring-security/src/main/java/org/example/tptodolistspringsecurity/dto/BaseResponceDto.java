package org.example.tptodolistspringsecurity.dto;

public class BaseResponceDto {
    private Object message;
    private Object data;

    private Object id;

    public BaseResponceDto(Object message, Object data) {
        this.message = message;
        this.data = data;
//        this.id = id;
    }

    public BaseResponceDto(Object message) {
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }
}
