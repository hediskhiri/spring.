package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite(Universite u);

    Universite updateUniversite(Universite e);

    Universite retrieveUniversite(Long idUniversite);

    void removeUniversite(Long idUniversite);
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) ;
    public Universite desaffecterFoyerAUniversite(long idUniversite);
}
