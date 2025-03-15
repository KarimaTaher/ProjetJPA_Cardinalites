package org.ensa.Entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cours" , nullable = false)
    private int id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "cours")
    private Collection<Prof> profs;
    @ManyToMany(mappedBy = "courses")
    private Collection<Letudiant> etudiants;

    public Collection<Letudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Collection<Letudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Collection<Prof> getProfs() {
        return profs;
    }

    public void setProfs(Collection<Prof> profs) {
        this.profs = profs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
