package fr.uga.miage.m1.festibeds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.dao.OrganisateurDAO;
import fr.uga.miage.m1.festibeds.entities.Organisateur;

@Service
public class OrganisateurService {
    @Autowired
    private OrganisateurDAO organisateurRepository;

    public Organisateur createOrganisateur(Organisateur organisateur){
        return organisateurRepository.save(organisateur);
    }

    public List<Organisateur> createOrganisateurs(List<Organisateur> organisateurs) {
        return organisateurRepository.saveAll(organisateurs);
      }
    
      public Organisateur getOrganisateurById(int id) {
        return organisateurRepository.findById(id).get();
      }
    
      public List<Organisateur> getOrganisateurs() {
        return organisateurRepository.findAll();
      }
    
      public Organisateur updateOrganisateur(Organisateur organisateur) {
        return organisateurRepository.save(organisateur);
      }
    
      public void deleteOrganisateurById(int id) {
        this.organisateurRepository.deleteById(id);
      }
    
      public void deleteAll() {
        this.organisateurRepository.deleteAll();
      }
}
