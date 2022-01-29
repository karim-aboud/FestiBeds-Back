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

import fr.uga.miage.m1.festibeds.domain.entities.AvisFestival;
import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisFestivalPK;
import fr.uga.miage.m1.festibeds.domain.services.AvisFestivalService;

@RestController
@CrossOrigin(origins = "*")

public class AvisFestivalController {

    @Autowired
    private AvisFestivalService avisFestivalService;

    @PostMapping("/avisFestivals")
    public AvisFestival createAvisFestival(@RequestBody AvisFestival avisFestival) {
        return avisFestivalService.createAvisFestival(avisFestival);
    }

    @GetMapping("/avisFestivals/{festivalId}/{festivalierId}")
    public AvisFestival getAvisFestivalById(@PathVariable int festivalId, @PathVariable int festivalierId) {
        AvisFestivalPK id = new AvisFestivalPK();
        id.setFestivalId(festivalId);
        id.setFestivalierId(festivalierId);
        return avisFestivalService.findById(id);
    }

    @GetMapping("/avisFestivals")
    public List<AvisFestival> getAllAvisFestivals() {
        return avisFestivalService.getAvisFestivals();
    }

    @PutMapping("/avisFestivals")
    public AvisFestival updateAvisFestival(@RequestBody AvisFestival avisFestival) {
        return avisFestivalService.updateAvisFestival(avisFestival);
    }

    @DeleteMapping("/avisFestivals/{festivalId}/{festivalierId}")
    public void deleteAvisFestival(@PathVariable int festivalId, @PathVariable int festivalierId) {
        AvisFestivalPK id = new AvisFestivalPK();
        id.setFestivalId(festivalId);
        id.setFestivalierId(festivalierId);
        avisFestivalService.deleteAvisFestivalById(id);
    }

    @DeleteMapping("/avisFestivals")
    public void deleteAvisFestivals() {
        this.avisFestivalService.deleteAll();
    }

}
