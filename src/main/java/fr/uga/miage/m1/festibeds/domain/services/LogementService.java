package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Logement;
import fr.uga.miage.m1.festibeds.infrastructure.dao.LogementDAO;

@Service
public class LogementService {

  @Autowired
  private LogementDAO logementDAO;

  public Logement createLogement(Logement logement) {
    return logementDAO.save(logement);
  }

  public Logement getLogementById(int id) {
    return logementDAO.findById(id).get();
  }

  public List<Logement> getLogements() {
    return logementDAO.findAll();
  }

  public Logement updateLogement(Logement logement) {
    return logementDAO.save(logement);
  }

  public void deleteLogementById(int id) {
    logementDAO.deleteById(id);
  }

  public void deleteAll() {
    logementDAO.deleteAll();
  }

}
