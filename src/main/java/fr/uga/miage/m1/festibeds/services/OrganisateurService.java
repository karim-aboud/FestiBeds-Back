package fr.uga.miage.m1.festibeds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.dao.OrganisateurDAO;
import fr.uga.miage.m1.festibeds.entities.Organisateur;

@Service
public class OrganisateurService {
  @Autowired
  private OrganisateurDAO organisateurDAO;

  public Organisateur createOrganisateur(Organisateur organisateur) {
    return organisateurDAO.save(organisateur);
  }

  public List<Organisateur> createOrganisateurs(List<Organisateur> organisateurs) {
    return organisateurDAO.saveAll(organisateurs);
  }

  public Organisateur getOrganisateurById(int id) {
    return organisateurDAO.findById(id).get();
  }

  public List<Organisateur> getOrganisateurs() {
    return organisateurDAO.findAll();
  }

  public Organisateur updateOrganisateur(Organisateur organisateur) {
    return organisateurDAO.save(organisateur);
  }

  public void deleteOrganisateurById(int id) {
    this.organisateurDAO.deleteById(id);
  }

  public void deleteAll() {
    this.organisateurDAO.deleteAll();
  }
}
