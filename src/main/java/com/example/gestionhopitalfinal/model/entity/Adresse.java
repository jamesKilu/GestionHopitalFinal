package com.example.gestionhopitalfinal.model.entity;

public class Adresse {
    protected String avenue;
    int numero;
    String quartier, commune, ville;

    public Adresse(String avenue, int numero, String quartier, String commune, String ville) {
        this.avenue = avenue;
        this.numero = numero;
        this.quartier = quartier;
        this.commune = commune;
        this.ville = ville;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


}
