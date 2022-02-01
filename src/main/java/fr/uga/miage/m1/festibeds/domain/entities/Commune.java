package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Commune {
    @Id
    String codeInsee;
    int codePostal;
    String nomCommune;
    String nomDepartement;
    String nomRegion;
    @OneToMany(mappedBy = "commune")
    List<Festival> festivals = new ArrayList<Festival>();
    @OneToMany(mappedBy = "commune")
    List<Etablissement> etablissements = new ArrayList<>();

}