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

import fr.uga.miage.m1.festibeds.domain.entities.Etablissement;
import fr.uga.miage.m1.festibeds.domain.services.EtablissementService;

@RestController
@CrossOrigin(origins = "*")

public class EtablissementController {

  @Autowired
  private EtablissementService etablissementService;
  
  @PostMapping("/etablissements")
  public Etablissement createEtablissement(@RequestBody Etablissement etablissement) {
    return etablissementService.createEtablissement(etablissement);
  }

  @GetMapping("/etablissements/{id}")
  public Etablissement getEtablissementById(@PathVariable int id) {
    return etablissementService.getEtablissementById(id);
  }

  @GetMapping("/etablissements")
  public List<Etablissement> getAllEtablissements() {
    return etablissementService.getEtablissements();
  }

  @PutMapping("/etablissements/{id}")
  public Etablissement updateEtablissement(@RequestBody Etablissement etablissement) {
    return etablissementService.updateEtablissement(etablissement);
  }

  @DeleteMapping("/etablissements/{id}")
  public void deleteEtablissement(@PathVariable("id") int id) {
    etablissementService.deleteEtablissementById(id);
  }

  @DeleteMapping("/etablissements")
  public void deleteEtablissements() {
    this.etablissementService.deleteAll();
  }

}
