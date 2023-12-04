package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Etudiant;
import com.example.projetspringfoyer.Service.EtudiantOrReservationNotFoundException;

import java.util.List;


public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

        Etudiant addEtudiant(Etudiant e);

        Etudiant updateEtudiant(Etudiant e);

        Etudiant retrieveEtudiant(Long idEtudiant);

        void removeEtudiant(Long idEtudiant);
        Etudiant affecterEtudiantAReservation(String nomEt , String prenomEt ,  String   idReservation ) throws EtudiantOrReservationNotFoundException;
}