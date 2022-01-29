package fr.uga.miage.m1.festibeds.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Photo;
import fr.uga.miage.m1.festibeds.infrastructure.dao.PhotoDAO;

@Service
public class PhotoService {
    @Autowired
    private PhotoDAO photoDAO;

    public Photo createPhoto(Photo photo) {
        return photoDAO.save(photo);
    }

    public List<Photo> createPhotos(List<Photo> organisateurs) {
        return photoDAO.saveAll(organisateurs);
    }

    public Photo getPhotoById(int id) {
        return photoDAO.findById(id).get();
    }

    public List<Photo> getPhotos() {
        return photoDAO.findAll();
    }

    public Photo updatePhoto(Photo photo) {
        return photoDAO.save(photo);
    }

    public void deletePhotoById(int id) {
        this.photoDAO.deleteById(id);
    }

    public void deleteAll() {
        this.photoDAO.deleteAll();
    }

}
