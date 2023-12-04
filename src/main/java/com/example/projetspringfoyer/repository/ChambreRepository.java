package com.example.projetspringfoyer.repository;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Chambre;
import com.example.projetspringfoyer.Entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    // List<Chambre> findByBlocAndTypeChambre(Bloc blocs, TypeChambre typeChambre);

    // List<Chambre> findByEstValide(boolean estValide);

    // List<Chambre> findByBlocAndCapaciteGreaterThan(Bloc blocs, int capaciteMinimale);

    //public long countByBlocIdAndType( TypeChambre type, long idBloc );
    // public List<Reservation> findByAnneeUniversitaire(Date dateDebut , Date dateFin );

    Chambre findAllByNumeroChambre(Long numChambres);

    public List<Chambre> findByBlocNomBloc(String nomBloc);

    public long countByTypeChambreAndBloc(TypeChambre typeChambre, Bloc bloc);
}

