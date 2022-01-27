package fr.uga.miage.m1.festibeds.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import fr.uga.miage.m1.festibeds.entities.enums.TypeEtablissement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    TypeEtablissement type;
    String nomCommercial;
    int classement;
    int capaciteAcceuil;
    int nbUnitesHabitation;
    int nbChambres;
    int nbEmplacements;
    String description;
    String siteInternet;
    String adresse;
    String codePostal;
    String commune;
    String telephone;
    String courriel;
    String coordonnees;
    int note;
    String nomDepartement;
    String nomRegion;
    double prix;

    @ManyToOne
    @JoinColumn(name = "hebergeur_id")
    @JsonBackReference
    Hebergeur hebergeur;

}