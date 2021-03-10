package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "ELEMENT_CONSTITUTIF")
@Data
public class ElementConstitutif implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ElementConstitutifPK id;

    private String description;

    private String designation;

    @Column(name = "NBH_CM")
    private BigDecimal nbhCm;

    @Column(name = "NBH_TD")
    private BigDecimal nbhTd;

    @Column(name = "NBH_TP")
    private BigDecimal nbhTp;

    //bi-directional many-to-one association to Enseignant
    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant enseignant;

    //bi-directional many-to-one association to UniteEnseignement
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "CODE_FORMATION", referencedColumnName = "CODE_FORMATION", insertable = false, updatable = false),
            @JoinColumn(name = "CODE_UE", referencedColumnName = "CODE_UE", insertable = false, updatable = false)
    })
    private UniteEnseignement uniteEnseignement;

    public ElementConstitutif() {
    }

}
