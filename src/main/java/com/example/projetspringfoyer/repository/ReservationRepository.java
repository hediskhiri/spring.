package com.example.projetspringfoyer.repository;

import com.example.projetspringfoyer.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    List<Reservation> findByAnneeUniversitaire(Date dateDebut);
}
