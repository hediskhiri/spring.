package com.example.projetspringfoyer.Controller;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Service.BlocNotFoundException;
import com.example.projetspringfoyer.Service.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    BlocService blocService;
    @GetMapping("/retrive-all-blocs")
    public Bloc retrieveAllBlocs() {
        Bloc bloc = blocService.retrieveAllBloc();
        return bloc;
    }


    public Bloc affecterChambresABloc(@PathVariable("numChambre") Long numChambre,
                                      @PathVariable("nomBloc") String nomBloc) throws BlocNotFoundException {
        return blocService.affecterChambresABloc(numChambre, nomBloc);
    }
    }
