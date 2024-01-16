CREATE DATABASE IF NOT EXISTS test;
USE test;

#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Employé
#------------------------------------------------------------

CREATE TABLE Employe(
        id_employe  Int  Auto_increment  NOT NULL ,
        qualif_base Varchar (50) NOT NULL
	,CONSTRAINT Employe_PK PRIMARY KEY (id_employe)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: qualification
#------------------------------------------------------------

CREATE TABLE qualification(
        Type_qualification Int  Auto_increment  NOT NULL ,
        Nom_qualif         Varchar (250) NOT NULL ,
        tarif_qualif       Float NOT NULL
	,CONSTRAINT qualification_PK PRIMARY KEY (Type_qualification)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Client
#------------------------------------------------------------

CREATE TABLE Client(
        id_client Int  Auto_increment  NOT NULL
	,CONSTRAINT Client_PK PRIMARY KEY (id_client)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Intervention
#------------------------------------------------------------

CREATE TABLE Intervention(
        id_intervention          Int  Auto_increment  NOT NULL ,
        description_intervention Varchar (250) NOT NULL ,
        date_intervention        Date NOT NULL ,
        nombre_jour              Int NOT NULL ,
        id_client                Int NOT NULL
	,CONSTRAINT Intervention_PK PRIMARY KEY (id_intervention)

	,CONSTRAINT Intervention_Client_FK FOREIGN KEY (id_client) REFERENCES Client(id_client)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: correspond
#------------------------------------------------------------

CREATE TABLE correspond(
        id_employe         Int NOT NULL ,
        Type_qualification Int NOT NULL
	,CONSTRAINT correspond_PK PRIMARY KEY (id_employe,Type_qualification)

	,CONSTRAINT correspond_Employe_FK FOREIGN KEY (id_employe) REFERENCES Employe(id_employe)
	,CONSTRAINT correspond_qualification0_FK FOREIGN KEY (Type_qualification) REFERENCES qualification(Type_qualification)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: contient
#------------------------------------------------------------

CREATE TABLE contient(
        id_intervention Int NOT NULL ,
        id_employe      Int NOT NULL
	,CONSTRAINT contient_PK PRIMARY KEY (id_intervention,id_employe)

	,CONSTRAINT contient_Intervention_FK FOREIGN KEY (id_intervention) REFERENCES Intervention(id_intervention)
	,CONSTRAINT contient_Employe0_FK FOREIGN KEY (id_employe) REFERENCES Employe(id_employe)
)ENGINE=InnoDB;

