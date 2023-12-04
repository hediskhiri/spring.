package com.example.projetspringfoyer.repository;

import com.example.projetspringfoyer.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

    Universite findByNomUniversite(String nomUniversite);

}