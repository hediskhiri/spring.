package com.example.projetspringfoyer.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation; // Clé primaire
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiantS;

    public void setEtudiant(Etudiant etudiant) {
    }
}