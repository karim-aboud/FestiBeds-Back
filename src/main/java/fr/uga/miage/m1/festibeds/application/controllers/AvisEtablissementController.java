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

import fr.uga.miage.m1.festibeds.domain.entities.AvisEtablissement;
import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisEtablissementPK;
import fr.uga.miage.m1.festibeds.domain.services.AvisEtablissementService;

@RestController
@CrossOrigin(origins = "*")
public class AvisEtablissementController {
    @Autowired
    private AvisEtablissementService avisEtablissementService;

    @PostMapping("/avisEtablissements")
    public AvisEtablissement createAvisEtablissement(@RequestBody AvisEtablissement avisEtablissement) {
        return avisEtablissementService.createAvisEtablissement(avisEtablissement);
    }

    @GetMapping("/avisEtablissements/{etablissementId}/{festivalierId}")
    public AvisEtablissement getAvisEtablissementById(@PathVariable int etablissementId,
            @PathVariable int festivalierId) {
        AvisEtablissementPK id = new AvisEtablissementPK();
        id.setEtablissementId(etablissementId);
        id.setFestivalierId(festivalierId);
        return avisEtablissementService.findById(id);
    }

    @GetMapping("/avisEtablissements")
    public List<AvisEtablissement> getAllAvisEtablissements() {
        return avisEtablissementService.getAvisEtablissements();
    }

    @PutMapping("/avisEtablissements")
    public AvisEtablissement updateAvisEtablissement(@RequestBody AvisEtablissement avisEtablissement) {
        return avisEtablissementService.updateAvisEtablissement(avisEtablissement);
    }

    @DeleteMapping("/avisEtablissements/{etablissementId}/{festivalierId}")
    public void deleteAvisEtablissement(@PathVariable int etablissementId, @PathVariable int festivalierId) {
        AvisEtablissementPK id = new AvisEtablissementPK();
        id.setEtablissementId(etablissementId);
        id.setFestivalierId(festivalierId);
        avisEtablissementService.deleteAvisEtablissementById(id);
    }

    @DeleteMapping("/avisEtablissements")
    public void deleteAvisEtablissements() {
        this.avisEtablissementService.deleteAll();
    }

}
