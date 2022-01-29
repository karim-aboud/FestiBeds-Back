package fr.uga.miage.m1.festibeds.domain.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Hebergement;
import fr.uga.miage.m1.festibeds.infrastructure.dao.HebergementDAO;

@Service
public class HebergementService {
    @Autowired
    private HebergementDAO hebergementDAO;

    public Hebergement createHebergement(Hebergement hebergement) {
        return hebergementDAO.save(hebergement);
    }

  
    public Hebergement getHebergementById(int id) {
        return hebergementDAO.findById(id).get();
    }

    public List<Hebergement> getHebergement() {
        return hebergementDAO.findAll();
    }

    public Hebergement updateHebergement(Hebergement hebergement) {
        return hebergementDAO.save(hebergement);
    }

    public void deleteHebergementById(int id) {
        this.hebergementDAO.deleteById(id);
    }

    public void deleteAll() {
        this.hebergementDAO.deleteAll();
    }
   
}