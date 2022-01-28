package fr.uga.miage.m1.festibeds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.entities.Commune;

@Repository
public interface CommuneDAO extends JpaRepository<Commune, Integer> {
    Commune findByNom(String nom);
    Commune findByCodePostal(int code);
}
