package fr.uga.miage.m1.festibeds;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.uga.miage.m1.festibeds.domain.entities.AvisEtablissement;
import fr.uga.miage.m1.festibeds.domain.entities.AvisFestival;
import fr.uga.miage.m1.festibeds.domain.entities.Commune;
import fr.uga.miage.m1.festibeds.domain.entities.Etablissement;
import fr.uga.miage.m1.festibeds.domain.entities.Festival;
import fr.uga.miage.m1.festibeds.domain.entities.Festivalier;
import fr.uga.miage.m1.festibeds.domain.entities.Hebergement;
import fr.uga.miage.m1.festibeds.domain.entities.Hebergeur;
import fr.uga.miage.m1.festibeds.domain.entities.Logement;
import fr.uga.miage.m1.festibeds.domain.entities.Organisateur;
import fr.uga.miage.m1.festibeds.domain.entities.Photo;
import fr.uga.miage.m1.festibeds.domain.entities.Reservation;
import fr.uga.miage.m1.festibeds.domain.entities.enums.TypeEtablissement;
import fr.uga.miage.m1.festibeds.domain.entities.enums.TypeLogement;
import fr.uga.miage.m1.festibeds.infrastructure.dao.AvisEtablissementDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.AvisFestivalDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.CommuneDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.EtablissementDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.FestivalDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.FestivalierDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.HebergementDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.HebergeurDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.LogementDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.OrganisateurDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.PhotoDAO;
import fr.uga.miage.m1.festibeds.infrastructure.dao.ReservationDAO;

@SpringBootApplication
public class FestibedsG3Application implements CommandLineRunner {
  @Autowired
  HebergeurDAO hebergeurDAO;
  @Autowired
  OrganisateurDAO organisateurDAO;
  @Autowired
  FestivalDAO festivalDAO;
  @Autowired
  FestivalierDAO festivalierDAO;
  @Autowired
  AvisFestivalDAO avisFestivalDAO;
  @Autowired
  EtablissementDAO etablissementDAO;
  @Autowired
  AvisEtablissementDAO avisEtablissementDAO;
  @Autowired
  PhotoDAO photoDAO;
  @Autowired
  CommuneDAO communeDAO;
  @Autowired
  ReservationDAO reservationDAO;
  @Autowired
  LogementDAO logementDAO;
  @Autowired
  HebergementDAO hebergementDAO;

  public static void main(String[] args) {
    SpringApplication.run(FestibedsG3Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    

    
    
  }
}
