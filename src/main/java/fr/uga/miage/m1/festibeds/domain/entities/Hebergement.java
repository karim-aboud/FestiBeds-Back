package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.Data;

@Data
@Entity
public class Hebergement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne
    @JoinColumn(name = "festival_id")
    @JsonIncludeProperties({
        "ndegIdentification",
        "nomManifestation"
    })
    Festival festival;

    @JsonIncludeProperties({
        "id"
    })
    @JoinColumn(name="logement_id")
    @OneToOne
    Logement logement;
}