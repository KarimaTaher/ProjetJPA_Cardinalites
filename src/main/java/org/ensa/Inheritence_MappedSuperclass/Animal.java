package org.ensa.Inheritence_MappedSuperclass;

import jakarta.persistence.*;

@MappedSuperclass
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Animal;
    private String nom;
    private String specie;

    public int getId_Animal() {
        return id_Animal;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
