// package fr.uga.miage.m1.festibeds.domain.services;


// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import fr.uga.miage.m1.festibeds.domain.entities.Region;
// import fr.uga.miage.m1.festibeds.infrastructure.dao.RegionDAO;

// @Service
// public class RegionService {
//     @Autowired
//     private RegionDAO regionDAO;

//     public Region createRegion(Region region) {
//         return regionDAO.save(region);
//     }

  
//     public Region getRegionById(int id) {
//         return regionDAO.findById(id).get();
//     }

//     public List<Region> getRegion() {
//         return regionDAO.findAll();
//     }

//     public Region updateRegion(Region region) {
//         return regionDAO.save(region);
//     }

//     public void deleteRegionById(int id) {
//         this.regionDAO.deleteById(id);
//     }

//     public void deleteAll() {
//         this.regionDAO.deleteAll();
//     }

    
// }