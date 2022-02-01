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

import fr.uga.miage.m1.festibeds.domain.entities.Festival;
import fr.uga.miage.m1.festibeds.domain.services.FestivalService;

@RestController
@CrossOrigin(origins = "*")
public class FestivalController {
  @Autowired
  private FestivalService festivalService;

  @PostMapping("/festivals")
  public Festival createFestival(@RequestBody Festival festival) {
    return festivalService.createFestival(festival);
  }

  @GetMapping("/festivals/id/{id}")
  public Festival getFestivalById(@PathVariable(required = true) String id) {
    return festivalService.getFestivalById(id);
  }

  @GetMapping("/festivals/{nom}")
  public List<Festival> getFestivalsByNomManifestation(@PathVariable String nom){
    return festivalService.getFestivalsByNomManifestation(nom);
  }

  @GetMapping("/festivals")
  public List<Festival> getAllFestivals() {
    return festivalService.getFestivals();
  }

  @PutMapping("/festivals/{id}")
  public Festival updateFestival(@RequestBody Festival festival) {
    return festivalService.updateFestival(festival);
  }

  @DeleteMapping("/festivals/{id}")
  public void deleteFestival(@PathVariable("id") String id) {
    festivalService.deleteFestivalById(id);
  }

  @DeleteMapping("/festivals")
  public void deleteFestivals() {
    this.festivalService.deleteAll();
  }
}
