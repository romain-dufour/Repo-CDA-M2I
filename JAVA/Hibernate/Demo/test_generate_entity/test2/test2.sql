CREATE DATABASE IF NOT EXISTS test2;
USE test2;


#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: entite7
#------------------------------------------------------------

CREATE TABLE entite7(
        numero_fournisseur  Int  Auto_increment  NOT NULL ,
        nom_fournisseur     Varchar (250) NOT NULL ,
        adresse_fournisseur Varchar (250) NOT NULL ,
        code_postal         Int NOT NULL ,
        ville_fournisseur   Varchar (50) NOT NULL
	,CONSTRAINT entite7_PK PRIMARY KEY (numero_fournisseur)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: entite8
#------------------------------------------------------------

CREATE TABLE entite8(
        Numero_produit Int  Auto_increment  NOT NULL ,
        nom_produit    Varchar (250) NOT NULL ,
        prix_produit   Float NOT NULL
	,CONSTRAINT entite8_PK PRIMARY KEY (Numero_produit)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Appel_offre
#------------------------------------------------------------

CREATE TABLE Appel_offre(
        numero_offre       Int  Auto_increment  NOT NULL ,
        date_offre         Date NOT NULL ,
        date_cloture_pffre Date NOT NULL ,
        quantite           Int NOT NULL ,
        Numero_produit     Int NOT NULL
	,CONSTRAINT Appel_offre_PK PRIMARY KEY (numero_offre)

	,CONSTRAINT Appel_offre_entite8_FK FOREIGN KEY (Numero_produit) REFERENCES entite8(Numero_produit)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: entite9
#------------------------------------------------------------

CREATE TABLE entite9(
        numero_contrat     Int  Auto_increment  NOT NULL ,
        date_contrat       Date NOT NULL ,
        quantite_negocie   Float NOT NULL ,
        acceptation_refus  Bool NOT NULL ,
        numero_fournisseur Int NOT NULL ,
        Numero_produit     Int NOT NULL
	,CONSTRAINT entite9_PK PRIMARY KEY (numero_contrat)

	,CONSTRAINT entite9_entite7_FK FOREIGN KEY (numero_fournisseur) REFERENCES entite7(numero_fournisseur)
	,CONSTRAINT entite9_entite80_FK FOREIGN KEY (Numero_produit) REFERENCES entite8(Numero_produit)
	,CONSTRAINT entite9_entite8_AK UNIQUE (Numero_produit)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Reponds
#------------------------------------------------------------

CREATE TABLE Reponds(
        numero_fournisseur Int NOT NULL ,
        numero_offre       Int NOT NULL
	,CONSTRAINT Reponds_PK PRIMARY KEY (numero_fournisseur,numero_offre)

	,CONSTRAINT Reponds_entite7_FK FOREIGN KEY (numero_fournisseur) REFERENCES entite7(numero_fournisseur)
	,CONSTRAINT Reponds_Appel_offre0_FK FOREIGN KEY (numero_offre) REFERENCES Appel_offre(numero_offre)
)ENGINE=InnoDB;

