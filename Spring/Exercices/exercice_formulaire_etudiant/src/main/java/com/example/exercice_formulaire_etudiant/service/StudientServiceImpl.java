package com.example.exercice_formulaire_etudiant.service;

import com.example.exercice_formulaire_etudiant.model.Studient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class StudientServiceImpl implements StudientService{
   private final Map<UUID, Studient> studients;

    public StudientServiceImpl() {
        studients = new HashMap<>();
    }

    public void StudientService(){
        //studients = new HashMap<>();
        Studient studientA = Studient.builder()
                .id(UUID.randomUUID())
                .lastName("Dufour")
                .firstName("Romain")
                .age(34)
                .email("dufour.romain@gmail.com")
                .build();
        Studient studientB = Studient.builder()
                .id(UUID.randomUUID())
                .lastName("Dubois")
                .firstName("Paul")
                .age(24)
                .email("dubois-paul@gmail.com")
                .build();
        Studient studientC = Studient.builder()
                .id(UUID.randomUUID())
                .lastName("Dumont")
                .firstName("Pierre")
                .age(35)
                .email("pierre.dumont@gmail.com")
                .build();
        Studient studientD = Studient.builder()
                .id(UUID.randomUUID())
                .lastName("Malaval")
                .firstName("Louis")
                .age(84)
                .email("M.Loulou@yahoo.com")
                .build();

        studients.put(studientA.getId(),studientA);
        studients.put(studientB.getId(),studientB);
        studients.put(studientC.getId(),studientC);
        studients.put(studientD.getId(),studientD);
    }



    @Override
    public boolean addStudient(Studient studient) {
        if (studient.getId() == null){
            studient.setId(UUID.randomUUID());
            studients.put(studient.getId(),studient);
            return true;
        }else {
            return false;
        }    }

    @Override
    public Studient searchStudientById(UUID id) {
        return studients.values().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Studient> findAllStudient() {
        return studients.values().stream().toList();
    }

    @Override
    public Studient getStudientByLastName(String lastName) {
        return studients.values().stream().filter(s -> s.getLastName().equals(lastName)).findFirst().orElse(null);
    }
}
