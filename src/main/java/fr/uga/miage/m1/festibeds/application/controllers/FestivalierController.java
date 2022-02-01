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

import fr.uga.miage.m1.festibeds.domain.entities.Festivalier;
import fr.uga.miage.m1.festibeds.domain.services.FestivalierService;

@RestController
@CrossOrigin(origins = "*")
public class FestivalierController {

    @Autowired
    private FestivalierService festivalierService;

    @PostMapping("/festivaliers")
    public Festivalier createFestival(@RequestBody Festivalier festivalier) {
        return festivalierService.createFestivalier(festivalier);
    }

    @GetMapping("/festivaliers/{id}")
    public Festivalier getFestivalById(@PathVariable int id) {
        return festivalierService.getFestivalierById(id);
    }

    @GetMapping("/festivaliers")
    public List<Festivalier> getAllFestivals() {
        return festivalierService.getFestivaliers();
    }

    @PutMapping("/festivaliers/{id}")
    public Festivalier updateFestival(@RequestBody Festivalier festivalier) {
        return festivalierService.updateFestivalier(festivalier);
    }

    @DeleteMapping("/festivaliers/{id}")
    public void deleteFestival(@PathVariable("id") int id) {
        festivalierService.deleteFestivalierById(id);
    }

    @DeleteMapping("/festivaliers")
    public void deleteFestivals() {
        this.festivalierService.deleteAll();
    }
}