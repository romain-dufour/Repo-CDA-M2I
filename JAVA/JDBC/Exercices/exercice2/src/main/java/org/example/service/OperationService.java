package org.example.service;

import org.example.dao.CompteBancaireDAO;
import org.example.dao.OperationDAO;
import org.example.models.Operation;
import org.example.models.TypeOperation;
import org.example.utils.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OperationService {
    private OperationDAO operationDAO;
    private Connection connection;

    public OperationService(){
        try {
            connection = new DataBaseManager().getConnection();
            operationDAO = new OperationDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createOperation(double montant, TypeOperation statut){
        Operation operation = new Operation();
        operation.setMontant(montant);
        operation.setStatut(statut);
        try {
            return operationDAO.save(operation);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Operation> getAllOperation(){
        try {
            return operationDAO.get();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
