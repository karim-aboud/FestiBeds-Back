package fr.uga.miage.m1.festibeds.application.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Photo;
import fr.uga.miage.m1.festibeds.domain.services.PhotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @PostMapping("/photos")
    public Photo createPhoto(@RequestBody Photo photo) {
        return photoService.createPhoto(photo);
    }

    @GetMapping("/photos/{id}")
    public Photo getPhotoById(@PathVariable int id) {
        return photoService.getPhotoById(id);
    }

    @GetMapping("/photos")
    public List<Photo> getAllPhotos() {
        return photoService.getPhotos();
    }

    @PutMapping("/photos/{id}")
    public Photo updatePhoto(@RequestBody Photo photo) {
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping("/photos/{id}")
    public void deletePhoto(@PathVariable("id") int id) {
        photoService.deletePhotoById(id);
    }

    @DeleteMapping("/photos")
    public void deletePhotos() {
        this.photoService.deleteAll();
    }

}
