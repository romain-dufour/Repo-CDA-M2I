package org.example.model;

import java.sql.Date;
import java.time.LocalDate;

public class Sales {
    private int id;
    private int carId;
    private int personId;
    private LocalDate date;

    public Sales() {
    }

    public Sales(int id, int carId, int personId, LocalDate date) {
        this.id = id;
        this.carId = carId;
        this.personId = personId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", carId=" + carId +
                ", personId=" + personId +
                ", date=" + date +
                '}';
    }
}
