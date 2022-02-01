package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisEtablissementPK;
import lombok.Data;

@Data
@Entity
public class AvisEtablissement {
    @EmbeddedId
    AvisEtablissementPK id = new AvisEtablissementPK();

    @ManyToOne
    @MapsId("festivalierId")
    @JoinColumn(name = "festivalier_id")
    @JsonIgnore
    Festivalier festivalier = new Festivalier();

    @ManyToOne
    @MapsId("etablissementId")
    @JoinColumn(name = "etablissement_id", nullable = true)
    @JsonIgnore
    Etablissement etablissement = new Etablissement();

    int note;
    String avis;
    
}
