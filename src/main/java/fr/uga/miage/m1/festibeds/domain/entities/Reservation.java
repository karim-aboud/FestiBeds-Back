package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.Data;

@Data
@Entity
public class Reservation {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;

    LocalDate dateReservation;
    String statutReservation;
    String montant;
    @JsonIncludeProperties("id")
    @ManyToOne
    @JoinColumn(name="festivalier_id")
    Festivalier festivalier;
    @JsonIncludeProperties({
        "ndegIdentification",
        "nomManifestation"
    })
    @ManyToOne
    @JoinColumn(name="festival_id")
    Festival festival;
}