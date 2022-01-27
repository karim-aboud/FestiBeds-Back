package fr.uga.miage.m1.festibeds.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class Festival {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ndegIdentification")
  int id;
  String domaine;
  int nbPassDisponibles;
  String periodicite;
  String moisHabituelDebut;
  String siteWeb;

  LocalDate dateDebut;
  LocalDate dateFin;
  int duree;
  double prix;
  String commentaire;

  @ManyToOne
  @JoinColumn(name = "organisateur_id")
  @JsonBackReference
  Organisateur organisateur;

  @JsonBackReference
  @ManyToMany(mappedBy = "festivals", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  List<Festivalier> festivaliers = new ArrayList<>();

  @JsonManagedReference
  @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL)
  List<Photo> photos = new ArrayList<Photo>();

  @JsonManagedReference
  @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL)
  List<AvisFestival> avis = new ArrayList<>();



}
