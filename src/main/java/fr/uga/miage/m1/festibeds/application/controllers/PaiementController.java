package fr.uga.miage.m1.festibeds.application.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Paiement;
import fr.uga.miage.m1.festibeds.domain.services.PaiementService;

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

public class PaiementController {

    @Autowired
    private PaiementService paiementService;

    @PostMapping("/paiements")
    public Paiement createPhoto(@RequestBody Paiement paiement) {
        return paiementService.createPaiement(paiement);
    }

    @GetMapping("/paiements/{id}")
    public Paiement getPaiementById(@PathVariable int id) {
        return paiementService.getPaiementById(id);
    }

    @GetMapping("/paiements")
    public List<Paiement> getAllPhotos() {
        return paiementService.getPaiement();
    }

    @PutMapping("/paiements/{id}")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/paiements/{id}")
    public void deletePaiement(@PathVariable("id") int id) {
        paiementService.deletePaiementById(id);
    }

    @DeleteMapping("/paiements")
    public void deletePaiement() {
        this.paiementService.deleteAll();
    }

}