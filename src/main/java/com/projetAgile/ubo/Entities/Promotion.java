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
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="CODE_FORMATION",insertable=false, updatable=false)
    private Formation formation;

    public Promotion() {
    }

	public PromotionPK getId() {
		return id;
	}

	public void setId(PromotionPK id) {
		this.id = id;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateRentree() {
		return dateRentree;
	}

	public void setDateRentree(Date dateRentree) {
		this.dateRentree = dateRentree;
	}

	public Date getDateReponseLalp() {
		return dateReponseLalp;
	}

	public void setDateReponseLalp(Date dateReponseLalp) {
		this.dateReponseLalp = dateReponseLalp;
	}

	public Date getDateReponseLp() {
		return dateReponseLp;
	}

	public void setDateReponseLp(Date dateReponseLp) {
		this.dateReponseLp = dateReponseLp;
	}

	public String getLieuRentree() {
		return lieuRentree;
	}

	public void setLieuRentree(String lieuRentree) {
		this.lieuRentree = lieuRentree;
	}

	public BigDecimal getNbMaxEtudiant() {
		return nbMaxEtudiant;
	}

	public void setNbMaxEtudiant(BigDecimal nbMaxEtudiant) {
		this.nbMaxEtudiant = nbMaxEtudiant;
	}

	public String getProcessusStage() {
		return processusStage;
	}

	public void setProcessusStage(String processusStage) {
		this.processusStage = processusStage;
	}

	public String getSiglePromotion() {
		return siglePromotion;
	}

	public void setSiglePromotion(String siglePromotion) {
		this.siglePromotion = siglePromotion;
	}

	public List<Candidat> getCandidats() {
		return candidats;
	}

	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

    
    

}
