package fr.uga.miage.m1.festibeds.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.uga.miage.m1.festibeds.domain.entities.AvisEtablissement;
import fr.uga.miage.m1.festibeds.domain.entities.embeddables.AvisEtablissementPK;

public interface AvisEtablissementDAO extends JpaRepository<AvisEtablissement, AvisEtablissementPK> {
    List<AvisEtablissement> findByIdEtablissementId(int etablissmentId);
    List<AvisEtablissement> findByIdFestivalierId(int festivalierId);
}
