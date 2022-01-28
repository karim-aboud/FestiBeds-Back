package fr.uga.miage.m1.festibeds;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.uga.miage.m1.festibeds.dao.AvisEtablissementDAO;
import fr.uga.miage.m1.festibeds.dao.AvisFestivalDAO;
import fr.uga.miage.m1.festibeds.dao.CommuneDAO;
import fr.uga.miage.m1.festibeds.dao.FestivalDAO;
import fr.uga.miage.m1.festibeds.dao.FestivalierDAO;
import fr.uga.miage.m1.festibeds.dao.HebergeurDAO;
import fr.uga.miage.m1.festibeds.dao.OrganisateurDAO;
import fr.uga.miage.m1.festibeds.dao.PhotoDAO;
import fr.uga.miage.m1.festibeds.entities.AvisEtablissement;
import fr.uga.miage.m1.festibeds.entities.Commune;
import fr.uga.miage.m1.festibeds.entities.Etablissement;
import fr.uga.miage.m1.festibeds.entities.Festival;
import fr.uga.miage.m1.festibeds.entities.Festivalier;
import fr.uga.miage.m1.festibeds.entities.Hebergeur;
import fr.uga.miage.m1.festibeds.entities.Organisateur;
import fr.uga.miage.m1.festibeds.entities.Photo;
import fr.uga.miage.m1.festibeds.entities.embeddables.AvisFestival;
import fr.uga.miage.m1.festibeds.entities.enums.TypeEtablissement;

@SpringBootApplication
public class FestibedsApplication implements CommandLineRunner{
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
  AvisEtablissementDAO avisEtablissementDAO;
  @Autowired
  PhotoDAO photoDAO;
  @Autowired
  CommuneDAO communeDAO;

  public static void main(String[] args) {
     SpringApplication.run(FestibedsApplication.class, args);
  }

  public void run(String... args) throws IOException {

    BufferedReader reader =new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/SESA45475/Documents/Projet FestiBeds/FestiBeds-Back-main/src/main/resources/opendataset.csv"), "UTF8"));
    String line = "";
    int i = 0;
        while((line=reader.readLine())!=null && i < 1){
            String [] data =line.trim().split(",");
            // if you want to check either it contains some name
            //index 0 is first name, index 1 is last name, index 2 is ID
            System.out.println(data[0]+ " - " + data[1] + " - " + data[2] );
            Festival festival = new Festival();

            festivalDAO.save(festival);
            i++;
        }

  }

}
