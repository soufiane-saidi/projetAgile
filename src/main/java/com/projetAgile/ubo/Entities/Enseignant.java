package com.projetAgile.ubo.Entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Enseignant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NO_ENSEIGNANT")
    private long noEnseignant;

    private String adresse;


    @Column(name = "CODE_POSTAL")
    private String codePostal;

    @Column(name = "EMAIL_PERSO")
    private String emailPerso;

    @Column(name = "EMAIL_UBO")
    private String emailUbo;

    private String mobile;

    private String nom;

    private String pays;

    private String prenom;

    private String sexe;

    private String telephone;

    @Column(name = "TYPE")
    private String type;

    private String ville;

    //bi-directional many-to-one association to ElementConstitutif
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<ElementConstitutif> elementConstitutifs;

    //bi-directional many-to-one association to Promotion
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<Promotion> promotions;

    //bi-directional many-to-one association to UniteEnseignement
    @OneToMany(mappedBy = "enseignant")
    @JsonIgnore
    private List<UniteEnseignement> uniteEnseignements;

    public Enseignant() {
    }

	public long getNoEnseignant() {
		return noEnseignant;
	}

	public void setNoEnseignant(long noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getEmailPerso() {
		return emailPerso;
	}

	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}

	public String getEmailUbo() {
		return emailUbo;
	}

	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<ElementConstitutif> getElementConstitutifs() {
		return elementConstitutifs;
	}

	public void setElementConstitutifs(List<ElementConstitutif> elementConstitutifs) {
		this.elementConstitutifs = elementConstitutifs;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public List<UniteEnseignement> getUniteEnseignements() {
		return uniteEnseignements;
	}

	public void setUniteEnseignements(List<UniteEnseignement> uniteEnseignements) {
		this.uniteEnseignements = uniteEnseignements;
	}
    
    


}
