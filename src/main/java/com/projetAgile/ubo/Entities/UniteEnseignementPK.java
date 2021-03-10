package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
@Embeddable
public class UniteEnseignementPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CODE_FORMATION")
    private String codeFormation;

    @Column(name = "CODE_UE")
    private String codeUe;

    public UniteEnseignementPK() {
    }


    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniteEnseignementPK)) {
            return false;
        }
        UniteEnseignementPK castOther = (UniteEnseignementPK) other;
        return
                this.codeFormation.equals(castOther.codeFormation)
                        && this.codeUe.equals(castOther.codeUe);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.codeFormation.hashCode();
        hash = hash * prime + this.codeUe.hashCode();

        return hash;
    }
}
