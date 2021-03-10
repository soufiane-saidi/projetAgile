package com.projetAgile.ubo.Entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Candidat implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NO_CANDIDAT")
    private String noCandidat;

    private String adresse;


    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "CONFIRMATION_CANDIDAT")
    private String confirmationCandidat;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_NAISSANCE")
    private Date dateNaissance;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_REPONSE_CANDIDAT")
    private Date dateReponseCandidat;

    private String email;

    @Column(name = "LIEU_NAISSANCE")
    private String lieuNaissance;

    @Column(name = "LISTE_SELECTION")
    private String listeSelection;

    private String mobile;

    private String nationalite;

    private String nom;

    @Column(name = "PAYS_ORIGINE")
    private String paysOrigine;

    private String prenom;

    @Column(name = "SELECTION_NO_ORDRE")
    private BigDecimal selectionNoOrdre;

    private String sexe;

    private String telephone;

    @Column(name = "UNIVERSITE_ORIGINE")
    private String universiteOrigine;

    private String ville;

    //bi-directional many-to-one association to Promotion
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ANNEE_UNIVERSITAIRE", referencedColumnName = "ANNEE_UNIVERSITAIRE"),
            @JoinColumn(name = "CODE_FORMATION", referencedColumnName = "CODE_FORMATION")
    })
    @JsonIgnore
    private Promotion promotion;

    public Candidat() {
    }

}
