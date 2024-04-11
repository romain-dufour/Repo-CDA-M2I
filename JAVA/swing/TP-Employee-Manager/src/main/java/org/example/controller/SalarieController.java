package org.example.controller;

import lombok.Data;
import org.example.dao.SalarieDao;
import org.example.model.Salarie;

import javax.swing.*;

@Data
public class SalarieController {
    private SalarieController salarieController;

    private SalarieDao salarieDao;
    public void addSalarie(Salarie salarie){
        System.out.println(salarie);
        int count = salarieDao.addSalarie(salarie);
        if(count>0){
            JOptionPane.showConfirmDialog(null, "Add operation success");
        }else{
            JOptionPane.showConfirmDialog(null, "Error Record");
        }

    }
}
