package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Festivalier;
import fr.uga.miage.m1.festibeds.infrastructure.dao.FestivalierDAO;

@Service
public class FestivalierService {

    @Autowired
    private FestivalierDAO festivalierDAO;

     public Festivalier createFestivalier(Festivalier festivalier) {
    return festivalierDAO.save(festivalier);
  }

  public Festivalier getFestivalierById(int id) {
    return festivalierDAO.findById(id).get();
  }

  public List<Festivalier> getFestivaliers() {
    return festivalierDAO.findAll();
  }

  public Festivalier updateFestivalier(Festivalier festivalier) {
    return festivalierDAO.save(festivalier);
  }

  public void deleteFestivalierById(int id) {
    festivalierDAO.deleteById(id);
  }

  public void deleteAll() {
    festivalierDAO.deleteAll();
  }
}
