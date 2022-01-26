package fr.uga.miage.m1.festibeds.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Festivalier extends CompteUtilisateur {

  @ManyToMany
  @JoinTable(name = "FESTIVALIER_FESTIVAL", joinColumns = @JoinColumn(name = "festivalier_id"), inverseJoinColumns = @JoinColumn(name = "ndeg_id"))
  List<Festival> festivals = new ArrayList<>();

  @OneToMany(mappedBy = "festivalier", cascade = CascadeType.ALL)
  List<AvisFestival> avis = new ArrayList<>();

  public List<Festival> getFestivals() {
    return festivals;
  }

  public void setFestivals(List<Festival> festivals) {
    this.festivals = festivals;
  }

  public List<AvisFestival> getAvis() {
    return avis;
  }

  public void setAvis(List<AvisFestival> avis) {
    this.avis = avis;
  }

}
