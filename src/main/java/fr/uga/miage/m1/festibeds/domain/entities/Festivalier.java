package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","reservations"})
public class Festivalier extends CompteUtilisateur {

  @ManyToMany  @JoinTable(name = "FESTIVALIER_FESTIVAL", joinColumns = @JoinColumn(name = "festivalier_id"), inverseJoinColumns = @JoinColumn(name = "ndeg_id"))
  List<Festival> festivals = new ArrayList<>();


  @OneToMany(mappedBy = "festivalier", cascade = CascadeType.ALL)
  List<AvisFestival> avis = new ArrayList<>();

  @OneToMany
  @JoinColumn(name="festivalier_id")
  List<Reservation> reservations = new ArrayList<>();

} 
