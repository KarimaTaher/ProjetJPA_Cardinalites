package org.ensa.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Access(AccessType.FIELD)
public class Letudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student" , updatable = false)
    private int id;
    private String prenom;
    private String nom;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "naissance")
    private LocalDate birthday;
    @Transient
    private int age;
    @OneToOne(cascade = CascadeType.PERSIST , mappedBy = "etudiant")
    private ADDRESS adress ;
    @ManyToMany(cascade = CascadeType.PERSIST , fetch = FetchType.EAGER)
    @JoinTable
    private Collection<Course> courses;

    public Collection<Course> getCourses() {
        return courses;
    }

    public void setCourses(Collection<Course> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        age = now.getYear() - birthday.getYear();
        return age;
    }
    public ADDRESS getAdress() {
        return adress;
    }

    public void setAdress(ADDRESS adress) {
        this.adress = adress;
    }

}
