package com.example.projetspringfoyer.Entity;



import jakarta.persistence.*;
        import lombok.Getter;
        import lombok.Setter;

        import java.io.Serializable;
@Setter
@Getter
@Entity
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite; // Clé primaire
    private String nomUniversite;
    private String adresse;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn
    private Foyer foyer;

    public void setFoyer(Foyer foyer) {
    }
}