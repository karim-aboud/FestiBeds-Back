package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Organisateur extends CompteUtilisateur {

  String courriel;
  String motDePasse;

  @OneToMany(mappedBy = "organisateur", cascade = CascadeType.ALL )
  
  @JsonManagedReference
  List<Festival> festivals = new ArrayList<>();

}