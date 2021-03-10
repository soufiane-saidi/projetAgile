package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NO_ETUDIANT")
    private String noEtudiant;

    private String adresse;

    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_NAISSANCE")
    private Date dateNaissance;

    private String email;

    @Column(name = "EMAIL_UBO")
    private String emailUbo;

    @Column(name = "GROUPE_ANGLAIS")
    private BigDecimal groupeAnglais;

    @Column(name = "GROUPE_TP")
    private BigDecimal groupeTp;

    @Column(name = "LIEU_NAISSANCE")
    private String lieuNaissance;

    private String mobile;

    private String nationalite;

    private String nom;

    @Column(name = "PAYS_ORIGINE")
    private String paysOrigine;

    private String prenom;

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
    private Promotion promotion;

    public Etudiant() {
    }


}
