package fr.uga.miage.m1.festibeds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.dao.AvisFestivalDAO;
import fr.uga.miage.m1.festibeds.entities.embeddables.AvisFestival;
import fr.uga.miage.m1.festibeds.entities.embeddables.AvisFestivalPK;

@Service
public class AvisFestivalService {

    @Autowired
    AvisFestivalDAO avisFestivalDAO;

    public List<AvisFestival> getAvisFestivals() {
        return avisFestivalDAO.findAll();
    }

    public List<AvisFestival> findByFestivalId(int festivalId) {
        return avisFestivalDAO.findByIdFestivalId(festivalId);
    }

    public List<AvisFestival> findByFestivalierId(int festivalierId) {
        return avisFestivalDAO.findByIdFestivalierId(festivalierId);
    }

    // public AvisFestival findByFestivalIdAndFestivalierId(int festivalId, int
    // festivalierId){
    // return avisFestivalDAO.findByFestivalIdAndFestivalierId(festivalId,
    // festivalierId);
    // }

    public AvisFestival findById(AvisFestivalPK id) {
        return avisFestivalDAO.findById(id).get();
    }

    public AvisFestival createAvisFestival(AvisFestival avisFestival) {
        return avisFestivalDAO.save(avisFestival);
    }

    public AvisFestival updateAvisFestival(AvisFestival avisFestival) {
        return avisFestivalDAO.save(avisFestival);
    }

    public void deleteAvisFestivalById(AvisFestivalPK id) {
        avisFestivalDAO.deleteById(id);
    }

    public void deleteAll() {
        avisFestivalDAO.deleteAll();
    }

}