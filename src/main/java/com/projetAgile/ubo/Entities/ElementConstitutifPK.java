package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
@Data
public class ElementConstitutifPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "CODE_FORMATION", insertable = false, updatable = false)
    private String codeFormation;

    @Column(name = "CODE_UE", insertable = false, updatable = false)
    private String codeUe;

    @Column(name = "CODE_EC")
    private String codeEc;

    public ElementConstitutifPK() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementConstitutifPK)) {
            return false;
        }
        ElementConstitutifPK castOther = (ElementConstitutifPK) other;
        return
                this.codeFormation.equals(castOther.codeFormation)
                        && this.codeUe.equals(castOther.codeUe)
                        && this.codeEc.equals(castOther.codeEc);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.codeFormation.hashCode();
        hash = hash * prime + this.codeUe.hashCode();
        hash = hash * prime + this.codeEc.hashCode();

        return hash;
    }
}
