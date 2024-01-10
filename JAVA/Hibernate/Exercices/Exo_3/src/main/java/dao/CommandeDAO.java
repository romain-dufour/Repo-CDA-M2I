package dao;

import model.Commande;
import model.Commentaire;

import java.util.List;

public interface CommandeDAO {

    public void add(Commande commande);

    public void deleteCommande(Long commandeId);

    public void updateCommande(Long commandeId);

    public List<Commande> getCommandeList();


}
