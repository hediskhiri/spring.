package com.example.projetspringfoyer.Service;

import com.example.projetspringfoyer.Entity.Reservation;
import com.example.projetspringfoyer.Interface.IReservationService;
import com.example.projetspringfoyer.repository.ReservationRepository;

import java.util.Date;
import java.util.List;

public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(String.valueOf(idReservation)).get();
    }

    @Override
    public void removeReservation(Long idReservation) {
        reservationRepository.deleteById(String.valueOf(idReservation));
    }
    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(Date anneeUniversitaire) {
        return reservationRepository.findByAnneeUniversitaire(anneeUniversitaire);
    }
}