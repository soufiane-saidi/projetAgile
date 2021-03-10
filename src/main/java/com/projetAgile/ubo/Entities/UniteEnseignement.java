package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "UNITE_ENSEIGNEMENT")
@Data
public class UniteEnseignement implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UniteEnseignementPK id;

    private String description;

    private String designation;



    @Column(name = "NBH_CM")
    private BigDecimal nbhCm;

    @Column(name = "NBH_TD")
    private BigDecimal nbhTd;

    @Column(name = "NBH_TP")
    private BigDecimal nbhTp;

    private String semestre;

    //bi-directional many-to-one association to ElementConstitutif
    @OneToMany(mappedBy = "uniteEnseignement")
    private List<ElementConstitutif> elementConstitutifs;

    //bi-directional many-to-one association to Enseignant
    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant enseignant;

    public UniteEnseignement() {
    }

}
