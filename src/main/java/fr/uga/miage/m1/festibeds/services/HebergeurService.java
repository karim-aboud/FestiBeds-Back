package fr.uga.miage.m1.festibeds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.dao.HebergeurDAO;
import fr.uga.miage.m1.festibeds.entities.Hebergeur;

@Service
public class HebergeurService {

    @Autowired
    private HebergeurDAO hebergeurDAO;

    public Hebergeur createHebergeur(Hebergeur hebergeur){
        return hebergeurDAO.save(hebergeur);
    }

    public List<Hebergeur> createHebergeurs(List<Hebergeur> Hebergeurs) {
        return hebergeurDAO.saveAll(Hebergeurs);
      }
    
      public Hebergeur getHebergeurById(int id) {
        return hebergeurDAO.findById(id).get();
      }
    
      public List<Hebergeur> getHebergeurs() {
        return hebergeurDAO.findAll();
      }
    
      public Hebergeur updateHebergeur(Hebergeur hebergeur) {
        return hebergeurDAO.save(hebergeur);
      }
    
      public void deleteHebergeurById(int id) {
        this.hebergeurDAO.deleteById(id);
      }
    
      public void deleteAll() {
        this.hebergeurDAO.deleteAll();
      }

    
}
