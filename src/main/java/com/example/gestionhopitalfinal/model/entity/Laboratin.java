package com.example.gestionhopitalfinal.model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Laboratin extends Person{
    public Laboratin(int id, String nom, String postnom, String prenom, char sexe, Date dateNaissance, Adresse adresse){
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    public boolean recevoirBonLabo(){
        return false;
    }

    public List<String> donnerResultat(){
        List<String> resultatExamen = new ArrayList<>();
        return resultatExamen;
    }
}
