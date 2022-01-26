package fr.uga.miage.m1.festibeds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.entities.Etablissement;

@Repository
public interface EtablissementDAO extends JpaRepository<Etablissement,Integer>{
    
}
