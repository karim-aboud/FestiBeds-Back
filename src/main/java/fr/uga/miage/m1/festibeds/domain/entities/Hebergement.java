package fr.uga.miage.m1.festibeds.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity

public class Hebergement {
    @Id
    int id;
    @ManyToOne
    @JoinColumn(name = "festival_id")
    Festival festival;

    @OneToOne 
    @JoinColumn(name = "logement_id")
    Logement logement;
    


}