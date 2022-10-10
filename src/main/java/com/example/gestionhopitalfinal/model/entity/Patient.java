package com.example.gestionhopitalfinal.model.entity;

import java.sql.Date;

public class Patient extends Person{
    double poids, tension, temperatureCorporel;

    public Patient(int id, String nom, String postnom, String prenom, char sexe, Date dateNaissance, double poids, double tension, double temperatureCorporel, Adresse adresse){
        this.id = id;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.poids = poids;
        this.tension = tension;
        this.temperatureCorporel = temperatureCorporel;
        this.adresse = adresse;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTension() {
        return tension;
    }

    public void setTension(double tension) {
        this.tension = tension;
    }

    public double getTemperatureCorporel() {
        return temperatureCorporel;
    }

    public void setTemperatureCorporel(double temperatureCorporel) {
        this.temperatureCorporel = temperatureCorporel;
    }

    public boolean suivreTraitement(){
        return true;
    }
}
