package fr.uga.miage.m1.festibeds.application.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Hebergement;
import fr.uga.miage.m1.festibeds.domain.services.HebergementService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")

public class HebergementController {

    @Autowired
    private HebergementService hebergementService;

    @PostMapping("/hebergements")
    public Hebergement createPhoto(@RequestBody Hebergement hebergement) {
        return hebergementService.createHebergement(hebergement);
    }

    @GetMapping("/hebergements/{id}")
    public Hebergement getHebergementById(@PathVariable int id) {
        return hebergementService.getHebergementById(id);
    }

    @GetMapping("/hebergements")
    public List<Hebergement> getAllPhotos() {
        return hebergementService.getHebergement();
    }

    @PutMapping("/hebergements/{id}")
    public Hebergement updateHebergement(@RequestBody Hebergement hebergement) {
        return hebergementService.updateHebergement(hebergement);
    }

    @DeleteMapping("/hebergements/{id}")
    public void deleteHebergement(@PathVariable("id") int id) {
        hebergementService.deleteHebergementById(id);
    }

    @DeleteMapping("/hebergements")
    public void deleteHebergement() {
        this.hebergementService.deleteAll();
    }

}
