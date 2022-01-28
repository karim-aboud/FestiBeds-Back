package fr.uga.miage.m1.festibeds.entities.embeddables;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class AvisEtablissementPK implements Serializable{
    @Column(name = "festivalier_id")
    int festivalierId;

    @Column(name = "etablissment_id")
    int etablissementId;

}
