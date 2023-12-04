package com.example.projetspringfoyer.Controller;

import com.example.projetspringfoyer.Entity.Foyer;
import com.example.projetspringfoyer.Interface.IFoyerService;
import com.example.projetspringfoyer.Service.BlocNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    public List<Foyer> getFoyer() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }
    @PostMapping("/foyer/add-etudiant")
    public List<Foyer> addEtudiantToFoyer(@RequestBody Foyer foyer) {
        foyerService.addFoyer(foyer);
        return foyerService.retrieveAllFoyers();
    }

    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    public void removeEtudiant(@PathVariable long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }
    @PostMapping("/add-foyer")
    public List<Foyer> addFoyer(@RequestBody Foyer foyer) {
        foyerService.addFoyer(foyer);
        return foyerService.retrieveAllFoyers();
    }
    @PostMapping("/add-foyer-with-bloc")
    public List<Foyer> addFoyerWithBloc(@RequestBody Foyer foyer) throws BlocNotFoundException {
        foyerService.addFoyerWithBloc(foyer);
        return foyerService.retrieveAllFoyers();
    }


}