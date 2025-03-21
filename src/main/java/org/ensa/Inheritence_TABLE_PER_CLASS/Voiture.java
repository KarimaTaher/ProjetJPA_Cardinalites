package org.ensa.Inheritence_TABLE_PER_CLASS;

import jakarta.persistence.Entity;

@Entity
public class Voiture extends  Vehicule{
    private int nbPlaces;
}
