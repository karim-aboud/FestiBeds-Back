package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Festival;
import fr.uga.miage.m1.festibeds.infrastructure.dao.FestivalDAO;

@Service
public class FestivalService {

  @Autowired
  private FestivalDAO festivalDAO;

  public Festival createFestival(Festival festival) {
    return festivalDAO.save(festival);
  }

  public Festival getFestivalById(String id) {
    return festivalDAO.findById(id).get();
  }

  public List<Festival> getFestivalsByNomManifestation(String nom){
    if(nom.length() >= 3){
      return festivalDAO.findByNomManifestationContainingIgnoreCase(nom);

    } else{
      return null;
    }
  }

  public List<Festival> getFestivals() {
    return festivalDAO.findAll();
  }

  public Festival updateFestival(Festival festival) {
    return festivalDAO.save(festival);
  }

  public void deleteFestivalById(String id) {
    festivalDAO.deleteById(id);
  }

  public void deleteAll() {
    festivalDAO.deleteAll();
  }

}
