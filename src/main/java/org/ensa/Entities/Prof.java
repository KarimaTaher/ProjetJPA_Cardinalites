package org.ensa.Entities;

import jakarta.persistence.*;

@Entity
public class Prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prof" , nullable = false)
    private int id;
    private String nom;
    private String prenom;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Course cours;

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public Course getCours() {
        return cours;
    }

    public void setCours(Course cours) {
        this.cours = cours;
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
}
