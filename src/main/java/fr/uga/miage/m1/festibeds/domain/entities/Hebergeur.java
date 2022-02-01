package fr.uga.miage.m1.festibeds.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hebergeur extends CompteUtilisateur{
   
    String courriel;
    String motDePasse;
    @OneToMany(mappedBy = "hebergeur", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    List<Etablissement> etablissements = new ArrayList<>();


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourriel() {
        return courriel;
    }
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public List<Etablissement> getEtablissements() {
        return etablissements;
    }
    public void setEtablissements(List<Etablissement> etablissements) {
        this.etablissements = etablissements;
    }

}