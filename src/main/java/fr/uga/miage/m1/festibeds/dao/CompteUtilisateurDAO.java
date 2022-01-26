package fr.uga.miage.m1.festibeds.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.entities.CompteUtilisateur;

@Primary
@Repository
public interface CompteUtilisateurDAO extends JpaRepository<CompteUtilisateur, Integer>{
    
}
