package com.example.tp_hopital.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_consultation", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    private Date consultDate;

    private String doctorName;

    @OneToMany(mappedBy = "consultation" , cascade = CascadeType.ALL)
    private Prescription prescription;

    @OneToMany(mappedBy = "consultation" , cascade = CascadeType.ALL)
    private FicheDeSoin ficheDeSoin;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Consultation() {
    }

    public Consultation(Date consultDate, String doctorName, Prescription prescription, FicheDeSoin ficheDeSoin) {
        this.consultDate = consultDate;
        this.doctorName = doctorName;
        this.prescription = prescription;
        this.ficheDeSoin = ficheDeSoin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public FicheDeSoin getFicheDeSoin() {
        return ficheDeSoin;
    }

    public void setFicheDeSoin(FicheDeSoin ficheDeSoin) {
        this.ficheDeSoin = ficheDeSoin;
    }
}
