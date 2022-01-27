package fr.uga.miage.m1.festibeds;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.uga.miage.m1.festibeds.dao.AvisFestivalDAO;
import fr.uga.miage.m1.festibeds.dao.FestivalDAO;
import fr.uga.miage.m1.festibeds.dao.FestivalierDAO;
import fr.uga.miage.m1.festibeds.dao.HebergeurDAO;
import fr.uga.miage.m1.festibeds.dao.OrganisateurDAO;
import fr.uga.miage.m1.festibeds.dao.PhotoDAO;
import fr.uga.miage.m1.festibeds.entities.AvisFestival;
import fr.uga.miage.m1.festibeds.entities.Etablissement;
import fr.uga.miage.m1.festibeds.entities.Festival;
import fr.uga.miage.m1.festibeds.entities.Festivalier;
import fr.uga.miage.m1.festibeds.entities.Hebergeur;
import fr.uga.miage.m1.festibeds.entities.Organisateur;
import fr.uga.miage.m1.festibeds.entities.Photo;
import fr.uga.miage.m1.festibeds.entities.enums.TypeEtablissement;

@SpringBootApplication
public class FestibedsApplication implements CommandLineRunner {
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
  PhotoDAO photoDAO;

  public static void main(String[] args) {
    SpringApplication.run(FestibedsApplication.class, args);
  }

  public void run(String... args) {

    Hebergeur karim = new Hebergeur();
    karim.setNom("Aboud");
    karim.setCourriel("karim99@gmail.com");
    karim.setMotDePasse("kimo");
    karim.setPrenom("Karim");
    karim.setTelephone("0640753164");

    Etablissement plumesHotel = new Etablissement();
    plumesHotel.setAdresse("Paris");
    plumesHotel.setCapaciteAcceuil(300);
    plumesHotel.setClassement(4);
    plumesHotel.setCodePostal("78500");
    plumesHotel.setCommune("Saint-Nom-la-Bretèche");
    plumesHotel.setCoordonnees("48.8558° N, 2.0191° E");
    plumesHotel.setCourriel("lesplumes@gmail.com");
    plumesHotel.setDescription(
        "Les Plumes Hotel est en plein cœur de La Rochelle. Vivez un séjour unique dans notre Hotel La Rochelle 3 étoiles.");
    plumesHotel.setNomCommercial("Les Plumes");
    plumesHotel.setNomDepartement("Charente-Maritime");
    plumesHotel.setNomRegion("Ile De France");
    plumesHotel.setTelephone("0684069586");
    plumesHotel.setSiteInternet("plumesHotel.fr");
    plumesHotel.setHebergeur(karim);
    plumesHotel.setCapaciteAcceuil(50);
    plumesHotel.setNbChambres(44);
    plumesHotel.setPrix(250);
    plumesHotel.setType(TypeEtablissement.HOTEL);

    Etablissement grandHotel = new Etablissement();
    grandHotel.setAdresse("Lyon");
    grandHotel.setCapaciteAcceuil(320);
    grandHotel.setClassement(5);
    grandHotel.setCodePostal("69000");
    grandHotel.setCommune("Affoux");
    grandHotel.setCoordonnees("45.8450° N, 4.4118° E");
    grandHotel.setCourriel("grandHotel@gmail.com");
    grandHotel.setDescription("Hôtel Lyon 1er arrondissement dans le quartier des Terreaux");
    grandHotel.setNomCommercial("Grand Hotel");
    grandHotel.setNomDepartement("Charente-Maritime");
    grandHotel.setNomRegion("Auvergne Rhone Alpes");
    grandHotel.setTelephone("0689573957");
    grandHotel.setSiteInternet("grandHotel.fr");
    grandHotel.setHebergeur(karim);
    grandHotel.setNbChambres(80);
    grandHotel.setCapaciteAcceuil(65);
    grandHotel.setPrix(260);
    grandHotel.setType(TypeEtablissement.HOTEL);

    karim.getEtablissements().add(plumesHotel);
    karim.getEtablissements().add(grandHotel);

    hebergeurDAO.save(karim);

    Organisateur eddy = new Organisateur();
    eddy.setNom("Nourin");
    eddy.setPrenom("Eddy");
    eddy.setMotDePasse("nourine");
    eddy.setCourriel("eddyn@gmail.com");
    eddy.setTelephone("0674967463");

    Festival festivalDeCanne = new Festival();
    festivalDeCanne.setCommentaire(
        "Toute l'équipe du Festival de Cannes est heureuse de vous accueillir pour cette nouvelle édition");
    festivalDeCanne.setDateDebut(LocalDate.now());
    festivalDeCanne.setDateFin(LocalDate.now().plusDays(30));
    festivalDeCanne.setDomaine("Pluridisciplinaire");
    festivalDeCanne.setDuree(30);
    festivalDeCanne.setMoisHabituelDebut("Mai");
    festivalDeCanne.setNbPassDisponibles(400);
    festivalDeCanne.setPeriodicite("annuelle");
    festivalDeCanne.setPrix(450);
    festivalDeCanne.setSiteWeb("www.festival-cannes.com");
    festivalDeCanne.setOrganisateur(eddy);
    Photo photo1 = new Photo();
    photo1.setType("PHOTO_FESTIVAL");
    photo1.setUrl("https://media2.boutique-clouet.fr/2396-thickbox_default/affiche-festival-de-cannes-de-1951.jpg");
    festivalDeCanne.getPhotos().add(photo1);
    photo1.setFestival(festivalDeCanne);

    eddy.getFestivals().add(festivalDeCanne);
    organisateurDAO.save(eddy);

    Festivalier ahmed = new Festivalier();
    ahmed.setNom("Kimour");
    ahmed.setPrenom("ahmed");
    ahmed.setTelephone("0674967403");
    ahmed.getFestivals().add(festivalDeCanne);
    festivalierDAO.save(ahmed); // festivalier_festival

    Festivalier mitia = new Festivalier();
    mitia.setNom("Ravelobaoavy");
    mitia.setPrenom("Mitia");
    mitia.setTelephone("0683746694");
    mitia.getFestivals().add(festivalDeCanne);
    festivalierDAO.save(mitia); // festivalier_festival

    festivalDeCanne.getFestivaliers().add(ahmed);
    festivalDeCanne.getFestivaliers().add(mitia);

    AvisFestival avisMitiaCannes = new AvisFestival();

    avisMitiaCannes.setAvis(
        "C'est l'un des meilleurs endroits où se trouver si vous êtes un cinéaste, pour vous inspirer, vous motiver et vous lancer dans la réalisation du prochain grand film.");
    avisMitiaCannes.setNote(5);
    avisMitiaCannes.setFestivalier(mitia);
    avisMitiaCannes.setFestival(festivalDeCanne);
    avisFestivalDAO.save(avisMitiaCannes);

    AvisFestival avisAhmedCannes = new AvisFestival();

    avisAhmedCannes.setAvis(
        "J'ai adore ce festival ! je recommande");
    avisAhmedCannes.setNote(5);
    avisAhmedCannes.setFestivalier(ahmed);
    avisAhmedCannes.setFestival(festivalDeCanne);
    avisFestivalDAO.save(avisAhmedCannes);

    festivalDeCanne.getAvis().add(avisMitiaCannes);
    festivalDeCanne.getAvis().add(avisAhmedCannes);
    festivalDAO.save(festivalDeCanne);
    


  }

}
