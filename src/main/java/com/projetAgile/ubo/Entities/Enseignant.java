package com.projetAgile.ubo.Entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Enseignant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NO_ENSEIGNANT")
    private long noEnseignant;

    private String adresse;


    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "EMAIL_PERSO")
    private String emailPerso;

    @Column(name = "EMAIL_UBO")
    private String emailUbo;

    private String mobile;

    private String nom;

    private String pays;

    private String prenom;

    private String sexe;

    private String telephone;

    @Column(name = "TYPE")
    private String type;

    private String ville;

    //bi-directional many-to-one association to ElementConstitutif
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<ElementConstitutif> elementConstitutifs;

    //bi-directional many-to-one association to Promotion
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<Promotion> promotions;

    //bi-directional many-to-one association to UniteEnseignement
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<UniteEnseignement> uniteEnseignements;

    public Enseignant() {
    }


}
