package fr.uga.miage.m1.festibeds.controllers;

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

import fr.uga.miage.m1.festibeds.entities.Hebergeur;
import fr.uga.miage.m1.festibeds.services.HebergeurService;

@RestController
@CrossOrigin(origins = "*")
public class HebergeurController {
  @Autowired
  private HebergeurService hebergeurService;

  @PostMapping("/hebergeurs")
  public Hebergeur createHebergeur(@RequestBody Hebergeur hebergeur) {
    return hebergeurService.createHebergeur(hebergeur);
  }

  @GetMapping("/hebergeurs/{id}")
  public Hebergeur getHebergeurById(@PathVariable int id) {
    return hebergeurService.getHebergeurById(id);
  }

  @GetMapping("/hebergeurs")
  public List<Hebergeur> getAllHebergeurs() {
    return hebergeurService.getHebergeurs();
  }

  @PutMapping("/hebergeurs/{id}")
  public Hebergeur updateHebergeur(@PathVariable int id, @RequestBody Hebergeur hebergeur) {
    return hebergeurService.updateHebergeur(hebergeur);
  }

  @DeleteMapping("/hebergeurs/{id}")
  public void deleteHebergeur(@PathVariable("id") int id) {
    hebergeurService.deleteHebergeurById(id);
  }

  @DeleteMapping("/hebergeurs")
  public void deleteHebergeurs() {
    this.hebergeurService.deleteAll();
  }

}
