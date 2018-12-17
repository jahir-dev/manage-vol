package com.web.managevol.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne (cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private Vol vol;
    @OneToOne (cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private Client client;
    private Date date;

    public Reservation() {
    }

    public Reservation(Vol vol, Client client, Date date) {
        this.vol = vol;
        this.client = client;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
