package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;


import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


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
}