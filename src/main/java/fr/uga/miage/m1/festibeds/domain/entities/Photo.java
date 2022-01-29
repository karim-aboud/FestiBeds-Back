package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String type;
    String url;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "festival_id")
    Festival festival;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    Etablissement etablissement;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "logement_id")
    Logement logement;

}
