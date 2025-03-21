package org.ensa.Inheritence_MappedSuperclass;

import jakarta.persistence.Entity;

@Entity
public class Chien extends Animal{
    private int id_chien;
    private String race;

    public int getId_chien() {
        return id_chien;
    }

    public void setId_chien(int id_chien) {
        this.id_chien = id_chien;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
