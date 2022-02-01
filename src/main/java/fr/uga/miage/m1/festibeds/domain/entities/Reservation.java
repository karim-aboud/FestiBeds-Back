package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","festivals"})
public class Reservation {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;

    LocalDate dateReservation;
    String statutReservation;
    double montant;

    
    @ManyToOne
    @JoinColumn(name="festivalier_id")
    Festivalier festivalier;

    @ManyToOne
    @JoinColumn(name="festival_id")
    Festival festival;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="reservation_id")
    @JsonManagedReference
    List<Hebergement> hebergement  = new ArrayList<>() ;


}

