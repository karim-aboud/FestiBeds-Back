package fr.uga.miage.m1.festibeds.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.dao.CommuneDAO;
import fr.uga.miage.m1.festibeds.entities.Commune;

@RestController
@CrossOrigin(origins = "*")
public class CommuneController {

    @Autowired
    CommuneDAO communeDAO;

    @GetMapping("/communes/insee/{id}")
    Commune getById(@PathVariable int id){
        return communeDAO.findById(id).get();
    }

    @GetMapping("/communes/nom/{nom}")
    Commune getByNom(@PathVariable String nom){
        return communeDAO.findByNom(nom);
    }

    @GetMapping("/communes/cp/{code}")
    Commune getByNom(@PathVariable int code){
        return communeDAO.findByCodePostal(code);
    }
    
}
