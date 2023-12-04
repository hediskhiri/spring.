package com.example.projetspringfoyer.Controller;

import com.example.projetspringfoyer.Entity.Bloc;
import com.example.projetspringfoyer.Entity.Chambre;
import com.example.projetspringfoyer.Entity.TypeChambre;
import com.example.projetspringfoyer.Interface.IchambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")

public class ChambreController {
    IchambreService chambreService;
    public List<Chambre> getChambresParNomBloc(@PathVariable String nomBloc) {
        return chambreService.getChambresParNomBloc(nomBloc);
    }
    public long nbChambreParTypeEtBloc(@RequestParam TypeChambre typeChambre, @RequestParam Bloc idBloc) {
        return chambreService.nbChambreParTypeEtBloc(typeChambre, idBloc);
    }


}