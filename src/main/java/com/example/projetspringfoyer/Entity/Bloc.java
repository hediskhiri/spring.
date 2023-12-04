package com.example.projetspringfoyer.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Setter
@Getter
@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc; // Clé primaire
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    Foyer foyer;
    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

    public void setChambres(Chambre chambres) {
    }

    public Chambre[] getChambres() {
        return new Chambre[0];
    }
}