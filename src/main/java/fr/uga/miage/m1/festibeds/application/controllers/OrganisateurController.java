package fr.uga.miage.m1.festibeds.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Organisateur;
import fr.uga.miage.m1.festibeds.domain.services.OrganisateurService;

@RestController
@CrossOrigin(origins = "*")
public class OrganisateurController {
  @Autowired
  private OrganisateurService organisateurService;

  @PostMapping("/organisateurs")
  public Organisateur createOrganisateur(@RequestBody Organisateur organisateur) {
    return organisateurService.createOrganisateur(organisateur);
  }

  @GetMapping("/organisateurs/{id}")
  public Organisateur getOrganisateurById(@PathVariable int id) {
    return organisateurService.getOrganisateurById(id);
  }

  @GetMapping("/organisateurs")
  public List<Organisateur> getAllOrganisateurs() {
    return organisateurService.getOrganisateurs();
  }

  @PutMapping("/organisateurs/{id}")
  public Organisateur updateOrganisateur(@RequestBody Organisateur organisateur) {
    return organisateurService.updateOrganisateur(organisateur);
  }

  @DeleteMapping("/organisateurs/{id}")
  public void deleteOrganisateur(@PathVariable("id") int id) {
    organisateurService.deleteOrganisateurById(id);
  }

  @DeleteMapping("/organisateurs")
  public void deleteOrganisateurs() {
    this.organisateurService.deleteAll();
  }
}
