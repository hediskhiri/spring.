package com.example.projetspringfoyer.Service;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Chambre;
import com.example.projetspringfoyer.Interface.IBlocService;
import com.example.projetspringfoyer.repository.BlocRepository;
import com.example.projetspringfoyer.repository.ChambreRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BlocService  implements IBlocService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public Bloc retrieveAllBloc() {
        return (Bloc) blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(Long numChambre, String nomBloc) throws BlocNotFoundException {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        // Make sure the bloc exists
        if (bloc != null) {
            Long numChambres = null;
            Chambre chambres = chambreRepository.findAllByNumeroChambre(numChambres);

            bloc.setChambres(chambres);

            // Save the updated bloc with associated chambres
            blocRepository.save(bloc);

            return bloc;
        } else {
            // Handle the case where the bloc does not exist
            throw new BlocNotFoundException("Bloc with name " + nomBloc + " not found");
        }
    }
    @Scheduled(fixedRate = 60000)  //déclenche toutes les minutes
    @Override
    public void listeChambresParBloc() {
        List<Chambre> chambres = chambreRepository.findAll();
        List<Bloc> blocs = blocRepository.findAll();
        for (Bloc bloc : blocs) {
            System.out.println("bloc : " + bloc.getNomBloc() + " ayant une capacité de : " + bloc.getCapaciteBloc());
            System.out.println("Liste des chambres du bloc " + bloc.getNomBloc() + " :");


            for (Chambre chambre : chambres) {
                System.out.println("chambre numéro " + chambre.getNumeroChambre() + " de type " + chambre.getTypeChambre());
            }
        }
    }

}
