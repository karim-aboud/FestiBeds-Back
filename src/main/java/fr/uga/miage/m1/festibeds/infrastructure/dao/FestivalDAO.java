package fr.uga.miage.m1.festibeds.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.domain.entities.Festival;

@Repository
public interface FestivalDAO extends JpaRepository<Festival, String>{
    List<Festival> findByNomManifestationContainingIgnoreCase(String nom);
}
