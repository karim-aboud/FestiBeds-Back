// package fr.uga.miage.m1.festibeds.application.controllers;

// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.RestController;

// import fr.uga.miage.m1.festibeds.domain.entities.Region;
// import fr.uga.miage.m1.festibeds.domain.services.RegionService;

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

// public class RegionController {

//     @Autowired
//     private RegionService regionService;

//     @PostMapping("/regions")
//     public Region createPhoto(@RequestBody Region region) {
//         return regionService.createRegion(region);
//     }

//     @GetMapping("/regions/{id}")
//     public Region getRegionById(@PathVariable int id) {
//         return regionService.getRegionById(id);
//     }

//     @GetMapping("/regions")
//     public List<Region> getAllPhotos() {
//         return regionService.getRegion();
//     }

//     @PutMapping("/regions/{id}")
//     public Region updateRegion(@RequestBody Region region) {
//         return regionService.updateRegion(region);
//     }

//     @DeleteMapping("/regions/{id}")
//     public void deleteRegion(@PathVariable("id") int id) {
//         regionService.deleteRegionById(id);
//     }

//     @DeleteMapping("/regions")
//     public void deleteRegion() {
//         this.regionService.deleteAll();
//     }

// }
