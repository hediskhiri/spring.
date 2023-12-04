package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Foyer;
import com.example.projetspringfoyer.Service.BlocNotFoundException;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer(Foyer f);

    Foyer updateFoyer(Foyer e);

    Foyer retrieveFoyer(Long idFoyer);

    void removeFoyer(Long idFoyer);
    void archiverFoyer (long idFoyer);
    Foyer addFoyerWithBloc (Foyer foyer) ;
}