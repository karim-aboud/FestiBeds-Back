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
    // Festival lesNuitsSecretes = new Festival();
    // lesNuitsSecretes.setNdegIdentification("1");
    // lesNuitsSecretes.setNomManifestation("Les Nuits Secr??tes");
    // lesNuitsSecretes.setCommentaires(
    //     "Toute l'??quipe du Festival de Cannes est heureuse de vous accueillir pour cette nouvelle ??dition");
    // lesNuitsSecretes.setDateDebutAncien(LocalDate.now());
    // lesNuitsSecretes.setDateFinAncien(LocalDate.now().plusDays(30));
    // lesNuitsSecretes.setDomaine("Pluridisciplinaire");
    // lesNuitsSecretes.setDuree(30);
    // lesNuitsSecretes.setMoisHabituelDebut("07 (juillet)");
    // lesNuitsSecretes.setNbPassDisponibles(400);
    // lesNuitsSecretes.setPeriodicite("annuelle");
    // lesNuitsSecretes.setPrix(450);
    // lesNuitsSecretes.setSiteWeb("https://www.lesnuitssecretes.com/");
    // lesNuitsSecretes.setNbPassDisponibles(400);
    
    // Photo photoLNS = new Photo();
    // photoLNS.setType("PHOTO_FESTIVAL");
    // photoLNS.setUrl("https://generation.hautsdefrance.fr/wp-content/uploads/2019/03/NS2.jpg");
    // lesNuitsSecretes.getPhotos().add(photoLNS);
    // photoLNS.setFestival(lesNuitsSecretes);

    // festivalDAO.save(lesNuitsSecretes);

    // Festival lollapaloozaParis = new Festival();
    // // lollapaloozaParis.setNdegIdentification("2");
    // lollapaloozaParis.setNomManifestation("Lollapalooza Paris");
    // lollapaloozaParis.setCommentaires(
    //     "Toute l'??quipe du Festival de Cannes est heureuse de vous accueillir pour cette nouvelle ??dition");
    // lollapaloozaParis.setDateDebutAncien(LocalDate.now());
    // lollapaloozaParis.setDateFinAncien(LocalDate.now().plusDays(30));
    // lollapaloozaParis.setDomaine("Pluridisciplinaire");
    // lollapaloozaParis.setDuree(30);
    // lollapaloozaParis.setMoisHabituelDebut("07 (juillet)");
    // lollapaloozaParis.setNbPassDisponibles(400);
    // lollapaloozaParis.setPeriodicite("annuelle");
    // lollapaloozaParis.setPrix(500);
    // lollapaloozaParis.setSiteWeb("https://www.lollaparis.com/");
    // lollapaloozaParis.setNbPassDisponibles(400);
    // Photo photoLP = new Photo();
    // photoLP.setType("PHOTO_FESTIVAL");
    // photoLP.setUrl("http://www.parisetudiant.com/uploads/assets/evenements/recto_flyer/2022/07/1375536_festival-lollapalooza-paris.jpg");
    // lollapaloozaParis.getPhotos().add(photoLP);
    // photoLP.setFestival(lollapaloozaParis);

    // festivalDAO.save(lollapaloozaParis);


    // Hebergeur karim = new Hebergeur();
    // karim.setNom("Aboud");
    // karim.setCourriel("karim99@gmail.com");
    // karim.setMotDePasse("kimo");
    // karim.setPrenom("Karim");
    // karim.setTelephone("0640753164");

    // Etablissement plumesHotel = new Etablissement();
    // plumesHotel.setCapaciteAcceuil(300);
    // plumesHotel.setClassement(4);
    // plumesHotel.setAdresse("Lieu-dit C??te de la Croix");
    // plumesHotel.setCoordonnees("48.8558?? N, 2.0191?? E");
    // plumesHotel.setCourriel("lesplumes@gmail.com");
    // plumesHotel.setDescription(
    //     "Les Plumes Hotel est en plein c??ur de La Rochelle. Vivez un s??jour unique dans notre Hotel La Rochelle 3 ??toiles.");
    // plumesHotel.setNomCommercial("Les Plumes");
    // plumesHotel.setTelephone("0684069586");
    // plumesHotel.setSiteInternet("plumesHotel.fr");
    // plumesHotel.setHebergeur(karim);
    // plumesHotel.setCapaciteAcceuil(50);
    // plumesHotel.setNbChambres(44);
    // plumesHotel.setPrix(250);
    // plumesHotel.setType(TypeEtablissement.HOTEL);

    
    // Commune commune = new Commune();
    // commune.setCodeInsee("1000");
    // commune.setCodePostal(38000);
    // commune.setNomDepartement("Isere");
    // commune.setNomRegion("Auvergne Rhone Alpes");
    // commune.setNomCommune("Grenoble");
    // commune.getFestivals().add(lesNuitsSecretes);
    // commune.getEtablissements().add(plumesHotel);
    
    // communeDAO.save(commune);

    // plumesHotel.setCommune(commune);
    // lesNuitsSecretes.setCommune(commune);
    // festivalDAO.save(lesNuitsSecretes);
    // hebergeurDAO.save(karim);
    // etablissementDAO.save(plumesHotel);

    // Photo photo2 = new Photo();
    // photo2.setType("PHOTO_HOTEL");
    // photo2.setUrl("toz.png");

    // Photo photo3 = new Photo();
    // photo3.setType("PHOTO_HOTEL");
    // photo3.setUrl("ok.png");

    // plumesHotel.getPhotos().add(photo2);

    // photo2.setEtablissement(plumesHotel);

    // Etablissement grandHotel = new Etablissement();
    // grandHotel.setCapaciteAcceuil(320);
    // grandHotel.setClassement(5);
    // grandHotel.setAdresse("733 ROUTE DE LA CROISETTE");
    // grandHotel.setCommune(commune);
    // grandHotel.setCoordonnees("45.8450?? N, 4.4118?? E");
    // grandHotel.setCourriel("grandHotel@gmail.com");
    // grandHotel.setDescription("H??tel Lyon 1er arrondissement dans le quartier des Terreaux");
    // grandHotel.setNomCommercial("Grand Hotel");
    // grandHotel.setTelephone("0689573957");
    // grandHotel.setSiteInternet("grandHotel.fr");
    // grandHotel.setHebergeur(karim);
    // grandHotel.setNbChambres(80);
    // grandHotel.setCapaciteAcceuil(65);
    // grandHotel.setPrix(260);
    // grandHotel.setType(TypeEtablissement.HOTEL);

    // grandHotel.getPhotos().add(photo3);
    // photo3.setEtablissement(grandHotel);

    // karim.getEtablissements().add(plumesHotel);
    // karim.getEtablissements().add(grandHotel);

    // hebergeurDAO.save(karim);
    // commune.getEtablissements().add(grandHotel);

    // Organisateur eddy = new Organisateur();
    // eddy.setNom("Nourin");
    // eddy.setPrenom("Eddy");
    // eddy.setMotDePasse("nourine");
    // eddy.setCourriel("eddyn@gmail.com");
    // eddy.setTelephone("0674967463");

    // Festival festivalDeCanne = new Festival();
    // // festivalDeCanne.setNdegIdentification("3");
    // festivalDeCanne.setNomManifestation("Festival de Cannes");
    // festivalDeCanne.setCommentaires(
    //     "Toute l'??quipe du Festival de Cannes est heureuse de vous accueillir pour cette nouvelle ??dition");
    // festivalDeCanne.setDomaine("Cin??ma et audiovisuel");
    // festivalDeCanne.setComplementDomaine("");
    // festivalDeCanne.setMoisHabituelDebut("05 (mai)");
    // festivalDeCanne.setNbPassDisponibles(400);
    // festivalDeCanne.setPeriodicite("annuelle");
    // festivalDeCanne.setPrix(450);
    // festivalDeCanne.setSiteWeb("www.festival-cannes.com");
    // festivalDeCanne.setDateDebutAncien(LocalDate.now());
    // festivalDeCanne.setDateFinAncien(LocalDate.now().plusDays(30));
    // festivalDeCanne.setDuree(30);
    // festivalDeCanne.setOrganisateur(eddy);
    // Photo photo1 = new Photo();
    // photo1.setType("PHOTO_FESTIVAL");
    // photo1.setUrl("http://www.lefilmfrancais.com/images/com_papyrus/92f56a90cd658132fce16b08b8d06e12.jpg");
    // festivalDeCanne.getPhotos().add(photo1);
    // photo1.setFestival(festivalDeCanne);

    // eddy.getFestivals().add(festivalDeCanne);

    // Festival festivalDeGrenoble = new Festival();
    // // festivalDeGrenoble.setNdegIdentification("4");
    // festivalDeGrenoble.setNomManifestation("Festival de Grenoble");
    // festivalDeGrenoble.setCommentaires(
    //     "Toute l'??quipe du Festival de Grenoble est heureuse de vous accueillir");
    // festivalDeGrenoble.setDomaine("Cirque et Arts de la rue");
    // festivalDeGrenoble.setComplementDomaine("Arts de la rue");
    // festivalDeGrenoble.setMoisHabituelDebut("04 (avril)");
    // festivalDeGrenoble.setNbPassDisponibles(400);
    // festivalDeGrenoble.setPeriodicite("annuelle");
    // festivalDeGrenoble.setPrix(450);
    // festivalDeGrenoble.setSiteWeb("www.festival-grenoble.com");
    // festivalDeGrenoble.setDateDebutAncien(LocalDate.now());
    // festivalDeGrenoble.setDateFinAncien(LocalDate.now().plusDays(30));
    // festivalDeGrenoble.setDuree(30);
    // festivalDeGrenoble.setOrganisateur(eddy);
    // Photo photo4 = new Photo();
    // photo4.setType("PHOTO_FESTIVAL");
    // photo4.setUrl("https://www.48imagesseconde.fr/wp-content/uploads/2017/03/Affiche-2018-web.jpg");
    // festivalDeGrenoble.getPhotos().add(photo4);
    // photo4.setFestival(festivalDeGrenoble);

    // eddy.getFestivals().add(festivalDeGrenoble);

    // organisateurDAO.save(eddy);

    // Photo photo5 = new Photo();
    // photo5.setType("PHOTO_HEBERGEMENT");
    // photo5.setUrl("https://pixabay.com/photos/to-travel-hotel-room-hotel-room-1677347/");

    // Logement chambre255Plumes = new Logement();
    // chambre255Plumes.setDescription("Chambre double wifi confortable");
    // chambre255Plumes.setNbPersonnes(2);
    // chambre255Plumes.setType(TypeLogement.CHAMBRE_DOUBLE);
    // chambre255Plumes.setPrix(89);
    // chambre255Plumes.getPhotos().add(photo5);
    // chambre255Plumes.setOptionsSpecifiques(" vue sur mer");
    // chambre255Plumes.setEtablissement(plumesHotel);

    // plumesHotel.getLogements().add(chambre255Plumes);

    // logementDAO.save(chambre255Plumes);

    // Hebergement hebergementAhmed = new Hebergement ();
    // hebergementAhmed.setFestival(festivalDeCanne);
    // hebergementAhmed.setLogement(chambre255Plumes);

    // hebergementDAO.save(hebergementAhmed);

    // Festivalier ahmed = new Festivalier();
    // ahmed.setNom("Kimour");
    // ahmed.setPrenom("ahmed");
    // ahmed.setTelephone("0674967403");
    // ahmed.getFestivals().add(festivalDeCanne);
    // festivalierDAO.save(ahmed); // festivalier_festival

    // Reservation reservationAhmed = new Reservation();
    // reservationAhmed.setFestivalier(ahmed);
    // reservationAhmed.setMontant("550");
    // reservationAhmed.setStatutReservation("En cours");
    // reservationAhmed.setDateReservation(LocalDate.now());
    // reservationAhmed.setFestival(festivalDeCanne);
    // reservationAhmed.getHebergements().add(hebergementAhmed);
    // reservationDAO.save(reservationAhmed);

    // Festivalier mitia = new Festivalier();
    // mitia.setNom("Ravelobaoavy");
    // mitia.setPrenom("Mitia");
    // mitia.setTelephone("0683746694");
    // mitia.getFestivals().add(festivalDeCanne);
    // festivalierDAO.save(mitia); // festivalier_festival

    // festivalDeCanne.getFestivaliers().add(ahmed);
    // festivalDeCanne.getFestivaliers().add(mitia);

    // AvisFestival avisMitiaCannes = new AvisFestival();
    // avisMitiaCannes.setAvis(
    //     "C'est l'un des meilleurs endroits o?? se trouver si vous ??tes un cin??aste, pour vous inspirer, vous motiver et vous lancer dans la r??alisation du prochain grand film.");
    // avisMitiaCannes.setNote(5);
    // avisMitiaCannes.setFestivalier(mitia);
    // avisMitiaCannes.setFestival(festivalDeCanne);
    // avisFestivalDAO.save(avisMitiaCannes);

    // AvisFestival avisAhmedCannes = new AvisFestival();

    // avisAhmedCannes.setAvis(
    //     "J'ai adore ce festival ! je recommande");
    // avisAhmedCannes.setNote(5);
    // avisAhmedCannes.setFestivalier(ahmed);
    // avisAhmedCannes.setFestival(festivalDeCanne);
    // avisFestivalDAO.save(avisAhmedCannes);

    // festivalDeCanne.getAvis().add(avisMitiaCannes);
    // festivalDeCanne.getAvis().add(avisAhmedCannes);

    // AvisEtablissement avisMitiaPlumesHotel = new AvisEtablissement();

    // avisMitiaPlumesHotel.setAvis(
    //     "Tres beau Hotel!, avec une belle vue sur l'exterieur!");
    // avisMitiaPlumesHotel.setNote(5);
    // avisMitiaPlumesHotel.setFestivalier(mitia);
    // avisMitiaPlumesHotel.setEtablissement(plumesHotel);
    // avisEtablissementDAO.save(avisMitiaPlumesHotel);

    // plumesHotel.getAvis().add(avisMitiaPlumesHotel);

    // festivalDAO.save(festivalDeCanne);

  }
}
