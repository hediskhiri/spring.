package com.example.projetspringfoyer.Controller;

import com.example.projetspringfoyer.Entity.Universite;
import com.example.projetspringfoyer.Interface.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UniversityController {
    IUniversiteService universiteService;

    public List<Universite> retrieveAllUniversities() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversite();
        return listUniversites;
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        universiteService.addUniversite(universite);
        return universiteService.retrieveAllUniversite().get(universiteService.retrieveAllUniversite().size() - 1);
    }

    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }
    @DeleteMapping("/remove-universite/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }

    @ResponseBody
    public Universite affecterFoyerAUniversite(@PathVariable("idUniversite") String idUniversite,
                                               @PathVariable("idFoyer") long idFoyer)
    {
        Universite universite =universiteService.affecterFoyerAUniversite(idFoyer,idUniversite);
        return universite;
    }
    @ResponseBody
    public Universite desaffecterFoyerAUniversite(@PathVariable("idUniversite") long idUniversite) {
        Universite universite = universiteService.desaffecterFoyerAUniversite(idUniversite);
        return universite;
    }



}
