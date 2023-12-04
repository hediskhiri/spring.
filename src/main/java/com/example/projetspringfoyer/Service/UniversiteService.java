package com.example.projetspringfoyer.Service;

import com.example.projetspringfoyer.Entity.Foyer;
import com.example.projetspringfoyer.Entity.Universite;
import com.example.projetspringfoyer.Interface.IUniversiteService;
import com.example.projetspringfoyer.repository.FoyerRepository;
import com.example.projetspringfoyer.repository.UniversiteRepository;

import java.util.List;

public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return universite;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idFoyer) {
        Universite universite = universiteRepository.findById(idFoyer).get();
        universite.setFoyer(null);
        universiteRepository.save(universite);

        return universite;
    }
}