package com.example.projetspringfoyer.repository;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByUniversite(Universite universite);
    Bloc findByNomBloc (String nomBloc );

}