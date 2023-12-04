package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Service.BlocNotFoundException;

public interface IBlocService {
    Bloc retrieveAllBloc();

    Bloc addBloc(Bloc b);

    Bloc updateBloc(Bloc b);

    Bloc retrieveBloc(Long idBloc);

    void removeBloc(Long idBloc);
    public Bloc affecterChambresABloc(Long numChambre, String nomBloc) throws BlocNotFoundException;
    void listeChambresParBloc();
}
