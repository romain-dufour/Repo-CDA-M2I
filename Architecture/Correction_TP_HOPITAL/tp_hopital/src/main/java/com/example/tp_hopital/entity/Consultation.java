package com.example.tp_hopital.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date consultDate;

    private String doctorName;



    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;


   @OneToMany(mappedBy = "consultation" , cascade = CascadeType.ALL)
    private List<FicheSoin> ficheSoinList;

    @OneToMany(mappedBy = "consultation" , cascade = CascadeType.ALL)
    private List<Prescription> prescriptionList;

}
