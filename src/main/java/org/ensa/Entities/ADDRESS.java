package org.ensa.Entities;

import jakarta.persistence.*;

@Entity
public class ADDRESS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address" , updatable = false)
    private int id;
    @Column(name="rue",length = 255)
    private String rue;
    @Column(name="ville",length = 255)
    private String ville;
    @Column(name="codePostal")
    private long codePostal;
    @Column(name = "pays",length = 255)
    private String pays;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Letudiant etudiant;

    public int getId() {
        return id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public long getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(long codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
