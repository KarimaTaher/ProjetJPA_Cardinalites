package org.ensa.Inheritence_Joined;

import jakarta.persistence.Entity;

@Entity
public class Employee extends Personne {
    private String company;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
