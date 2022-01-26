package fr.uga.miage.m1.festibeds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.dao.FestivalDAO;
import fr.uga.miage.m1.festibeds.entities.Festival;

@Service
public class FestivalService {

  @Autowired
  private FestivalDAO festivalDAO;

  public Festival createFestival(Festival festival) {
    return festivalDAO.save(festival);
  }

  public Festival getFestivalById(int id) {
    return festivalDAO.findById(id).get();
  }

  public List<Festival> getFestivals() {
    return festivalDAO.findAll();
  }

  public Festival updateFestival(Festival festival) {
    return festivalDAO.save(festival);
  }

  public void deleteFestivalById(int id) {
    festivalDAO.deleteById(id);
  }

  public void deleteAll() {
    festivalDAO.deleteAll();
  }

}
