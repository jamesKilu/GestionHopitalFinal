package com.example.gestionhopitalfinal.model.entity;

import java.sql.Date;

public class Receptionnist extends Person{

    public Receptionnist(int id, String nom, String postnom, String prenom, char sexe, Date dateNaissance, Adresse adresse){
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    public void enregistrerPatient(){
            //to complete later
    }
}
