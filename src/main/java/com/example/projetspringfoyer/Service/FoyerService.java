package com.example.projetspringfoyer.Service;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Foyer;
import com.example.projetspringfoyer.Interface.IFoyerService;
import com.example.projetspringfoyer.repository.BlocRepository;
import com.example.projetspringfoyer.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
    BlocRepository blocRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public void archiverFoyer(long idFoyer) {

    }

    @Override
    public Foyer addFoyerWithBloc(Foyer foyer) {
        Bloc bloc = blocRepository.findByNomBloc(foyer.getNomBloc()); // Adjust this based on your actual logic

        if (bloc != null) {
            // Set the bloc for the foyer
            foyer.setBloc(bloc);

            // Save the foyer with the associated bloc
            foyerRepository.save(foyer);

            return foyer;
        } else {
            // Handle the case where the bloc is not found
            throw new BlocNotFoundException("Bloc with name " + foyer.getNomBloc() + " not found");
        }
    }

}