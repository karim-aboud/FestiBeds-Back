package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.AvisEtablissement;
import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisEtablissementPK;
import fr.uga.miage.m1.festibeds.infrastructure.dao.AvisEtablissementDAO;

@Service
public class AvisEtablissementService {
    @Autowired
    AvisEtablissementDAO avisEtablissementDAO;

    public List<AvisEtablissement> getAvisEtablissements() {
        return avisEtablissementDAO.findAll();
    }

    public List<AvisEtablissement> findByEtablissementId(int etablissementId) {
        return avisEtablissementDAO.findByIdEtablissementId(etablissementId);
    }

    public List<AvisEtablissement> findByFestivalierId(int festivalierId) {
        return avisEtablissementDAO.findByIdFestivalierId(festivalierId);
    }

    // public AvisEtablissement findByEtablissementIdAndEtablissementierId(int festivalId, int
    // festivalierId){
    // return avisEtablissementDAO.findByEtablissementIdAndEtablissementierId(festivalId,
    // festivalierId);
    // }

    public AvisEtablissement findById(AvisEtablissementPK id) {
        return avisEtablissementDAO.findById(id).get();
    }

    public AvisEtablissement createAvisEtablissement(AvisEtablissement avisEtablissement) {
        return avisEtablissementDAO.save(avisEtablissement);
    }

    public AvisEtablissement updateAvisEtablissement(AvisEtablissement avisEtablissement) {
        return avisEtablissementDAO.save(avisEtablissement);
    }

    public void deleteAvisEtablissementById(AvisEtablissementPK id) {
        avisEtablissementDAO.deleteById(id);
    }

    public void deleteAll() {
        avisEtablissementDAO.deleteAll();
    }

}
