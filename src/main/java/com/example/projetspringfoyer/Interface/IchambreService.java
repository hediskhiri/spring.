package com.example.projetspringfoyer.Interface;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Chambre;
import com.example.projetspringfoyer.Entity.TypeChambre;

import java.util.List;

public interface IchambreService {
    List<Chambre> retrieveAllChambre();

    Chambre addChambre(Chambre ch);

    Chambre updateChambre(Chambre ch);

    Chambre retrieveChambre(Long idChambre);

    void removeChambre(Long idChambre);
    public List<Chambre> getChambresParNomBloc( String nomBloc );
    public long nbChambreParTypeEtBloc(TypeChambre type, Bloc idBloc );

    void pourcentageChambreParTypeChambre();
}