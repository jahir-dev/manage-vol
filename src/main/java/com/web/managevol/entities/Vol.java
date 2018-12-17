package com.web.managevol.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private Date date_depart;
    @NotNull
    private Date date_arrivee;
    @NotNull
    private Time heur_depart;
    @NotNull
    private Time heur_arrivee;
    @NotNull
    private String ville_depart;
    @NotNull
    private String ville_arrivee;
    @NotNull
    private float prix;
    @NotNull
    private float duree;
    @NotNull
    private int nb_place;
    private int nb_place_reservee;
    private Boolean etat = true;
/*
    public Vol() {
    }

    public Vol(String ville_depart, String ville_arrivee) {
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
    }

    public Vol(int id_vol, Date date_depart, Date date_arrivee, Time heur_depart, Time heur_arrivee, String ville_depart, String ville_arrivee, float prix, float duree, int nb_place, int nb_place_reservee, Boolean etat) {
        this.id = id_vol;
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.heur_depart = heur_depart;
        this.heur_arrivee = heur_arrivee;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.prix = prix;
        this.duree = duree;
        this.nb_place = nb_place;
        this.nb_place_reservee = nb_place_reservee;
        this.etat = etat;
    }

    */

    public int getId_vol() {
        return id;
    }

    public void setId_vol(int id_vol) {
        this.id = id_vol;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Time getHeur_depart() {
        return heur_depart;
    }

    public void setHeur_depart(Time heur_depart) {
        this.heur_depart = heur_depart;
    }

    public Time getHeur_arrivee() {
        return heur_arrivee;
    }

    public void setHeur_arrivee(Time heur_arrivee) {
        this.heur_arrivee = heur_arrivee;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public int getNb_place_reservee() {
        return nb_place_reservee;
    }

    public void setNb_place_reservee(int nb_place_reservee) {
        this.nb_place_reservee = nb_place_reservee;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
}
