package com.example.projetspringfoyer.repository;

import com.example.projetspringfoyer.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudientRepository extends JpaRepository<Etudiant,Long> {


    Etudiant findByNomEtAndPrenomEt(String nomEt, String prenomEt);
}