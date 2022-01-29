package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Etablissement;
import fr.uga.miage.m1.festibeds.infrastructure.dao.EtablissementDAO;

@Service
public class EtablissementService {

  @Autowired
  private EtablissementDAO etablissementDAO;

  public Etablissement createEtablissement(Etablissement etablissement) {
    return etablissementDAO.save(etablissement);
  }

  public Etablissement getEtablissementById(int id) {
    return etablissementDAO.findById(id).get();
  }

  public List<Etablissement> getEtablissements() {
    return etablissementDAO.findAll();
  }

  public Etablissement updateEtablissement(Etablissement etablissement) {
    return etablissementDAO.save(etablissement);
  }

  public void deleteEtablissementById(int id) {
    etablissementDAO.deleteById(id);
  }

  public void deleteAll() {
    etablissementDAO.deleteAll();
  }

}
