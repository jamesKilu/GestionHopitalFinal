package com.example.gestionhopitalfinal.model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Medecin extends Person{
    public Medecin(int id, String nom, String postnom, String prenom, char sexe, Date dateNaissance, Adresse adresse){
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    public List<String> faireBonLabo(){
        List<String> list = new ArrayList<>();
        return list;
    }

    public void consulterPatient(){
        //nothing
    }
}
