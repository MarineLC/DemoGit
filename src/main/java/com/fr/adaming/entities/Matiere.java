package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere implements Serializable {
	
	@Id
	@GeneratedValue
	private int idMatiere;
	
	private String libelle;
	private int duree;
	private float coeff;
	
	@ManyToOne
	private Section section;
	
	@OneToMany
	List<Epreuve> epreuves;

	
	
	


	public Matiere() {
	
	}
	
	


	public Matiere( String libelle, int duree, float coeff) {
		
		
		this.libelle = libelle;
		this.duree = duree;
		this.coeff = coeff;

	}




	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", libelle=" + libelle + ", duree=" + duree + ", coeff=" + coeff
				+ ", section=" + section + ", epreuves=" + epreuves + "]";
	}


	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public float getCoeff() {
		return coeff;
	}

	public void setCoeff(float coeff) {
		this.coeff = coeff;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	
	
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}
	

}
