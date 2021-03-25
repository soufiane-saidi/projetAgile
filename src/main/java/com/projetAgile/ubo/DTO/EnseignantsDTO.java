package com.projetAgile.ubo.DTO;

import com.projetAgile.ubo.Entities.UniteEnseignement;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class EnseignantsDTO {
    private long id;
    private String nom;
    private String prenom;
    private BigDecimal nombreHeuresTD;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public BigDecimal getNombreHeuresTD() {
		return nombreHeuresTD;
	}
	public void setNombreHeuresTD(BigDecimal nombreHeuresTD) {
		this.nombreHeuresTD = nombreHeuresTD;
	}
    
}
