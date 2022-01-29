package fr.uga.miage.m1.festibeds.domain.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.miage.m1.festibeds.domain.entities.Reservation;
import fr.uga.miage.m1.festibeds.infrastructure.dao.ReservationDAO;

@Service
public class ReservationService {
    @Autowired
    private ReservationDAO reservationDAO;

    public Reservation createReservation(Reservation reservation) {
        return reservationDAO.save(reservation);
    }

  
    public Reservation getReservationById(int id) {
        return reservationDAO.findById(id).get();
    }

    public List<Reservation> getReservation() {
        return reservationDAO.findAll();
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationDAO.save(reservation);
    }

    public void deleteReservationById(int id) {
        this.reservationDAO.deleteById(id);
    }

    public void deleteAll() {
        this.reservationDAO.deleteAll();
    }

    
}