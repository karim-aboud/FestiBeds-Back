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

import fr.uga.miage.m1.festibeds.domain.entities.Logement;
import fr.uga.miage.m1.festibeds.domain.services.LogementService;

@RestController
@CrossOrigin(origins = "*")
public class LogementController {
  @Autowired
  private LogementService logementService;

  @PostMapping("/logements")
  public Logement createLogement(@RequestBody Logement logement) {
    return logementService.createLogement(logement);
  }

  @GetMapping("/logements/{id}")
  public Logement getLogementById(@PathVariable int id) {
    return logementService.getLogementById(id);
  }

  @GetMapping("/logements")
  public List<Logement> getAllLogements() {
    return logementService.getLogements();
  }

  @PutMapping("/logements/{id}")
  public Logement updateLogement(@RequestBody Logement logement) {
    return logementService.updateLogement(logement);
  }

  @DeleteMapping("/logements/{id}")
  public void deleteLogement(@PathVariable("id") int id) {
    logementService.deleteLogementById(id);
  }

  @DeleteMapping("/logements")
  public void deleteLogements() {
    this.logementService.deleteAll();
  }
}
