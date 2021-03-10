package com.projetAgile.ubo.Entities;

import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Promotion implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PromotionPK id;

    private String commentaire;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_RENTREE")
    private Date dateRentree;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_REPONSE_LALP")
    private Date dateReponseLalp;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_REPONSE_LP")
    private Date dateReponseLp;

    @Column(name = "LIEU_RENTREE")
    private String lieuRentree;

    @Column(name = "NB_MAX_ETUDIANT")
    private BigDecimal nbMaxEtudiant;

    @Column(name = "PROCESSUS_STAGE")
    private String processusStage;

    @Column(name = "SIGLE_PROMOTION")
    private String siglePromotion;

    //bi-directional many-to-one association to Candidat
    @OneToMany(mappedBy = "promotion")
    @JsonIgnore
    private List<Candidat> candidats;

    //bi-directional many-to-one association to Etudiant
    @OneToMany(mappedBy = "promotion")
    @JsonIgnore
    private List<Etudiant> etudiants;

    //bi-directional many-to-one association to Enseignant
    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT")
    @JsonIgnore
    private Enseignant enseignant;

    public Promotion() {
    }


}
