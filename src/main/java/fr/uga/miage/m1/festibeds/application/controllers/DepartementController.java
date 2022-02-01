// package fr.uga.miage.m1.festibeds.application.controllers;

// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.RestController;

// import fr.uga.miage.m1.festibeds.domain.entities.Departement;
// import fr.uga.miage.m1.festibeds.domain.services.DepartementService;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @CrossOrigin(origins = "*")

// public class DepartementController {

//     @Autowired
//     private DepartementService departementService;

//     @PostMapping("/departements")
//     public Departement createPhoto(@RequestBody Departement departement) {
//         return departementService.createDepartement(departement);
//     }

//     @GetMapping("/departements/{id}")
//     public Departement getDepartementById(@PathVariable int id) {
//         return departementService.getDepartementById(id);
//     }

//     @GetMapping("/departements")
//     public List<Departement> getAllPhotos() {
//         return departementService.getDepartement();
//     }

//     @PutMapping("/departements/{id}")
//     public Departement updateDepartement(@RequestBody Departement departement) {
//         return departementService.updateDepartement(departement);
//     }

//     @DeleteMapping("/departements/{id}")
//     public void deleteDepartement(@PathVariable("id") int id) {
//         departementService.deleteDepartementById(id);
//     }

//     @DeleteMapping("/departements")
//     public void deleteDepartement() {
//         this.departementService.deleteAll();
//     }

// }
