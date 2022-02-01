package fr.uga.miage.m1.festibeds.domain.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Festival {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  String ndegIdentification;
  String nomManifestation;
  String domaine;
  String complementDomaine;
  int nbPassDisponibles;
  String periodicite;
  String moisHabituelDebut;
  String siteWeb;

  LocalDate dateDebutAncien;
  LocalDate dateFinAncien;
  int duree;
  double prix;
  String commentaires;

  @ManyToOne
  @JoinColumn(name = "organisateur_id")
  @JsonIgnore
  Organisateur organisateur;

  @JsonIgnore
  @ManyToMany(mappedBy = "festivals", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  List<Festivalier> festivaliers = new ArrayList<>();

  @JsonManagedReference(value="festival-photo")
  @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL)
  List<Photo> photos = new ArrayList<Photo>();

  @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL)
  List<AvisFestival> avis = new ArrayList<>();

  @OneToMany(mappedBy = "festival")
  List<Reservation> reservations = new ArrayList<>();

  @OneToMany(mappedBy = "festival")
  List<Hebergement> hebergements = new ArrayList<>();

  @ManyToOne(optional = true)
  @JsonIgnoreProperties({"festivals","etablissements"})
  @JoinColumn(name="code_insee_commune")
  Commune commune;
 
}
