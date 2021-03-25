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
    
    //bi-directional many-to-one association to Formation
    @ManyToOne
    @JoinColumn(name = "CODE_FORMATION")
    private Formation formation;

    //bi-directional many-to-one association to Enseignant
    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT")
    private Enseignant enseignant;

    
    public UniteEnseignement() {
    }


	public UniteEnseignementPK getId() {
		return id;
	}


	public void setId(UniteEnseignementPK id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public BigDecimal getNbhCm() {
		return nbhCm;
	}


	public void setNbhCm(BigDecimal nbhCm) {
		this.nbhCm = nbhCm;
	}


	public BigDecimal getNbhTd() {
		return nbhTd;
	}


	public void setNbhTd(BigDecimal nbhTd) {
		this.nbhTd = nbhTd;
	}


	public BigDecimal getNbhTp() {
		return nbhTp;
	}


	public void setNbhTp(BigDecimal nbhTp) {
		this.nbhTp = nbhTp;
	}


	public String getSemestre() {
		return semestre;
	}


	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}


	public List<ElementConstitutif> getElementConstitutifs() {
		return elementConstitutifs;
	}


	public void setElementConstitutifs(List<ElementConstitutif> elementConstitutifs) {
		this.elementConstitutifs = elementConstitutifs;
	}


	public Formation getFormation() {
		return formation;
	}


	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	public Enseignant getEnseignant() {
		return enseignant;
	}


	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

}
