package com.web.managevol.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String cin;
    @NotNull
    private String nom;
    @NotNull
    private String prenom;
    @NotNull
    private String sexe;
    @NotNull
    private Date date_naissance;
    @NotNull
    private String telephone;
    @NotNull
    private String mail;
    @NotNull
    private String num_passeport;

    public Client(int id, String cin, String nom, String prenom, String sexe, Date date_naissance, String telephone, String mail, String num_passeport) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_naissance = date_naissance;
        this.telephone = telephone;
        this.mail = mail;
        this.num_passeport = num_passeport;
    }

    public Client() {
    }

    public Client(String cin, String nom, String prenom, String sexe, Date date_naissance, String telephone, String mail, String num_passeport) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.date_naissance = date_naissance;
        this.telephone = telephone;
        this.mail = mail;
        this.num_passeport = num_passeport;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNum_passeport() {
        return num_passeport;
    }

    public void setNum_passeport(String num_passeport) {
        this.num_passeport = num_passeport;
    }
}
