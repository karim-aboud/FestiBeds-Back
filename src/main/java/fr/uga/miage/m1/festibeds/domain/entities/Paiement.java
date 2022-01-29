package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Paiement {
    @Id
    int id;
    int montantPaiement;

    @OneToOne
    Reservation reservation;
    
}