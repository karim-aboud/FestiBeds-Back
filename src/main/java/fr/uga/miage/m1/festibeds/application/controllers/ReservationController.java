package fr.uga.miage.m1.festibeds.application.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.miage.m1.festibeds.domain.entities.Reservation;
import fr.uga.miage.m1.festibeds.domain.services.ReservationService;

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

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/reservations")
    public Reservation createPhoto(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/reservations/{id}")
    public Reservation getReservationById(@PathVariable int id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping("/reservations")
    public List<Reservation> getAllPhotos() {
        return reservationService.getReservation();
    }

    @PutMapping("/reservations/{id}")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable("id") int id) {
        reservationService.deleteReservationById(id);
    }

    @DeleteMapping("/reservations")
    public void deleteReservation() {
        this.reservationService.deleteAll();
    }

}
