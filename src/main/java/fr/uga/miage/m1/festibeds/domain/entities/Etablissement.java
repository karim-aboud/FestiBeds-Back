package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import fr.uga.miage.m1.festibeds.domain.entities.enums.TypeEtablissement;
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
    String telephone;
    String courriel;
    String coordonnees;
    int note;
    double prix;

    @ManyToOne
    @JoinColumn(name = "hebergeur_id")
    @JsonIgnore
    Hebergeur hebergeur;

    @JsonManagedReference(value="etablissement-photo")
    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
    List<Photo> photos = new ArrayList<Photo>();

    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
    List<AvisEtablissement> avis = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etablissement")
    List<Logement> logements = new ArrayList<>();

    @ManyToOne(optional = true)
    @JsonIgnoreProperties({"festivals","etablissements"})
    @JoinColumn(name="code_insee_commune")
    Commune commune;
}
