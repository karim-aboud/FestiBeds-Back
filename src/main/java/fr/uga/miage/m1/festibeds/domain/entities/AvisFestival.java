package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisFestivalPK;
import lombok.Data;

@Data
@Entity
public class AvisFestival {
    @EmbeddedId
    AvisFestivalPK id = new AvisFestivalPK();

    @ManyToOne
    @MapsId("festivalierId")
    @JoinColumn(name = "festivalier_id")
    @JsonIgnore
    Festivalier festivalier = new Festivalier();

    @ManyToOne
    @MapsId("festivalId")
    @JoinColumn(name = "festival_id")
    @JsonIgnore
    Festival festival = new Festival();

    int note;
    String avis;
}
