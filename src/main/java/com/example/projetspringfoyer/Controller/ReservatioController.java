package com.example.projetspringfoyer.Controller;

import com.example.projetspringfoyer.Entity.Reservation;
import com.example.projetspringfoyer.Interface.IReservationService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

public class ReservatioController {
    IReservationService reservationService;

    public List<Reservation> getReservation() {
        List<Reservation> listReservation = reservationService.retrieveAllReservation();
        return listReservation;
    }
    @PostMapping("/add-reservation")
    public List<Reservation> addReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
        return reservationService.retrieveAllReservation();
    }

    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    public Reservation retrieveReservation(@PathVariable long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    public void removeReservation(@PathVariable long idReservation) {
        reservationService.removeReservation(idReservation);
    }
    public List<Reservation> getReservationParAnneeUniversitaire(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date anneeUniversitaire) {
        return reservationService.getReservationParAnneeUniversitaire(anneeUniversitaire);
    }


}
