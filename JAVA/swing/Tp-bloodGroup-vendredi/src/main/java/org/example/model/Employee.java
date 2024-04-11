package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Employee implements Serializable {

    private int id;
    private String name;
    private Gender gender;
    private int age;
    private String bloodGroup;
    private int contactNumber;
    private Qualification qualification;
    private LocalDate startDate;
    private String imageUrl;
    private String adress;

    public Employee() {
    }

    public Employee(int id, String name, Gender gender, int age, String bloodGroup, int contactNumber, Qualification qualification, LocalDate startDate, String imageUrl, String adress) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.contactNumber = contactNumber;
        this.qualification = qualification;
        this.startDate = startDate;
        this.imageUrl = imageUrl;
        this.adress = adress;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isMale=" + gender +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contactNumber=" + contactNumber +
                ", qualification=" + qualification +
                ", startDate=" + startDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
