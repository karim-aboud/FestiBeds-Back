package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Commune {
    @Id
    String codeINSEE;
    int codePostal;
    String nomCommune;
    @OneToMany
    @JoinColumn(name="codeINSEE")
    List<Festival> festivals = new ArrayList<Festival>();


}