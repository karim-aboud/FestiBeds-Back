package fr.uga.miage.m1.festibeds.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class CompteUtilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nom;
    String prenom;
    String telephone;
    
}
