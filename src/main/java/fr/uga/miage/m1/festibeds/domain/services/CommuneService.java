package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Commune;
import fr.uga.miage.m1.festibeds.infrastructure.dao.CommuneDAO;

@Service
public class CommuneService {
    @Autowired
    private CommuneDAO communeDAO;

    public Commune createCommune(Commune commune) {
        return communeDAO.save(commune);
    }

  
    public Commune getCommuneById(int id) {
        return communeDAO.findById(id).get();
    }

    public Commune findByNomCommune(String nom){
        return communeDAO.findByNomCommune(nom);
    }

    public Commune findByCodePostal(int code){
        return communeDAO.findByCodePostal(code);
    }

    public List<Commune> getCommune() {
        return communeDAO.findAll();
    }

    public Commune updateCommune(Commune commune) {
        return communeDAO.save(commune);
    }

    public void deleteCommuneById(int id) {
        this.communeDAO.deleteById(id);
    }

    public void deleteAll() {
        this.communeDAO.deleteAll();
    }


    
}