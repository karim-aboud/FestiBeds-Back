package fr.uga.miage.m1.festibeds.entities;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Commune {
    @Id
    int codeInsee;
    @Column(unique=true)
    int codePostal;
    @Column(unique = true)
    String nom;

    @OneToMany
    @JoinColumn(name="codeINSEE")
    List<Festival> festivals = new ArrayList<Festival>();
}
