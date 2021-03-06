package fr.uga.miage.m1.festibeds.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.miage.m1.festibeds.domain.entities.AvisFestival;
import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisFestivalPK;

@Repository
public interface AvisFestivalDAO extends JpaRepository<AvisFestival, AvisFestivalPK> {

  List<AvisFestival> findByIdFestivalId(int festivalId);

  List<AvisFestival> findByIdFestivalierId(int festivalierId);

  // AvisFestival findByFestivalIdAndFestivalierId(int festivalId, int festivalierId);
}