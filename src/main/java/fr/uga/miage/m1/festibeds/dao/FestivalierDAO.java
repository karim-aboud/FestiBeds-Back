package fr.uga.miage.m1.festibeds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.entities.Festivalier;

@Repository
public interface FestivalierDAO extends JpaRepository<Festivalier, Integer> {

}
