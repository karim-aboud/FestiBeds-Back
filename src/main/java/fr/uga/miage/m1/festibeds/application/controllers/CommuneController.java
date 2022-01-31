package fr.uga.miage.m1.festibeds.application.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Commune;
import fr.uga.miage.m1.festibeds.domain.services.CommuneService;

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

public class CommuneController {

    @Autowired
    private CommuneService communeService;

    @PostMapping("/communes")
    public Commune createPhoto(@RequestBody Commune commune) {
        return communeService.createCommune(commune);
    }

    @GetMapping("/communes/insee/{id}")
    public Commune getCommuneById(@PathVariable String id) {
        return communeService.getCommuneById(id);
    }

    @GetMapping("/communes/nom/{nom}")
    public Commune getByNomCommune(@PathVariable String nom){
        return communeService.findByNomCommune(nom);
    }

    @GetMapping("/communes/cp/{code}")
    public Commune getByNomCommune(@PathVariable int code){
        return communeService.findByCodePostal(code);
    }

    @GetMapping("/communes")
    public List<Commune> getAllPhotos() {
        return communeService.getCommune();
    }

    @PutMapping("/communes/{id}")
    public Commune updateCommune(@RequestBody Commune commune) {
        return communeService.updateCommune(commune);
    }

    @DeleteMapping("/communes/{id}")
    public void deleteCommune(@PathVariable("id") String id) {
        communeService.deleteCommuneById(id);
    }

    @DeleteMapping("/communes")
    public void deleteCommune() {
        this.communeService.deleteAll();
    }

}
