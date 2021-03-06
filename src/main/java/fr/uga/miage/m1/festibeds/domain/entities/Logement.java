package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import fr.uga.miage.m1.festibeds.domain.entities.enums.TypeLogement;
import lombok.Data;

@Data
@Entity
public class Logement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int nbPersonnes;
    double prix;
    String optionsSpecifiques;
    String description;

    @Enumerated(EnumType.STRING)
    TypeLogement type;

    @JsonManagedReference(value="logement-photo")
    @OneToMany(mappedBy = "logement", cascade = CascadeType.ALL)
    List<Photo> photos = new ArrayList<Photo>();

    @OneToOne(optional = true, mappedBy = "logement")
    @JsonIncludeProperties("id")
    Hebergement hebergement;

    @ManyToOne(optional = true)
    @JsonIncludeProperties({"id","type","nomCommercial"})
    @JoinColumn(name="logement_id", nullable = true)
    Etablissement etablissement;

}
