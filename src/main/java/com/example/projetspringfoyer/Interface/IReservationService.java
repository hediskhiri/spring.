package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation(Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation(Long idReservation);

    void removeReservation(Long idReservation);

    List<Reservation> getReservationParAnneeUniversitaire(Date anneeUniversitaire);


}