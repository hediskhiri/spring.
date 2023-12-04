package com.example.projetspringfoyer.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Setter
@Getter
@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
// Constructeur et accesseurs (getters) et mutateurs (setters)

    @ManyToMany(mappedBy="etudiantS", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}