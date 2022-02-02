package fr.uga.miage.m1.festibeds.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.domain.entities.Commune;

@Repository
public interface CommuneDAO extends JpaRepository<Commune, Integer>{
  Commune findByNomCommune(String nom);
  Commune findByCodePostal(int codePostal);
}