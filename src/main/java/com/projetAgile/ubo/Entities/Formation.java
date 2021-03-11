package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
public class Formation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_FORMATION")
    private String codeFormation;

    @Temporal(TemporalType.DATE)
    @Column(name = "DEBUT_ACCREDITATION")
    private Date debutAccreditation;

    private String diplome;

    @Column(name = "DOUBLE_DIPLOME")
    private String doubleDiplome;

    @Temporal(TemporalType.DATE)
    @Column(name = "FIN_ACCREDITATION")
    private Date finAccreditation;

    @Column(name = "N0_ANNEE")
    private BigDecimal n0Annee;

    @Column(name = "NOM_FORMATION")
    private String nomFormation;

    public Formation() {
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }
}
