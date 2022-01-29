package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Paiement;
import fr.uga.miage.m1.festibeds.infrastructure.dao.PaiementDAO;

@Service
public class PaiementService {
    @Autowired
    private  PaiementDAO paiementDAO;

    public Paiement createPaiement(Paiement paiement) {
        return paiementDAO.save(paiement);
    }

  
    public Paiement getPaiementById(int id) {
        return paiementDAO.findById(id).get();
    }

    public List<Paiement> getPaiement() {
        return paiementDAO.findAll();
    }

    public Paiement updatePaiement(Paiement paiement) {
        return paiementDAO.save(paiement);
    }

    public void deletePaiementById(int id) {
        this.paiementDAO.deleteById(id);
    }

    public void deleteAll() {
        this.paiementDAO.deleteAll();
    }

    
}