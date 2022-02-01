// package fr.uga.miage.m1.festibeds.domain.services;


// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import fr.uga.miage.m1.festibeds.domain.entities.Departement;
// import fr.uga.miage.m1.festibeds.infrastructure.dao.DepartementDAO;

// @Service
// public class DepartementService {
//     @Autowired
//     private DepartementDAO departementDAO;

//     public Departement createDepartement(Departement departement) {
//         return departementDAO.save(departement);
//     }

  
//     public Departement getDepartementById(int id) {
//         return departementDAO.findById(id).get();
//     }

//     public List<Departement> getDepartement() {
//         return departementDAO.findAll();
//     }

//     public Departement updateDepartement(Departement departement) {
//         return departementDAO.save(departement);
//     }

//     public void deleteDepartementById(int id) {
//         this.departementDAO.deleteById(id);
//     }

//     public void deleteAll() {
//         this.departementDAO.deleteAll();
//     }

    
// }