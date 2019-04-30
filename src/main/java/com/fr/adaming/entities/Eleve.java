package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Eleve implements Serializable{

	
	@Id 
	@GeneratedValue
	private int idEleve;
	
	private String nom;
	private String prenom;
	private int dateDeNaissance;
	
	@ManyToOne
	private Section section;
	
	@ManyToMany
	@JoinColumn(name="Convocation")
	List<Epreuve> epreuves;
	
	
	
	

	public Eleve() {
		
	}



	public Eleve(int idEleve, String nom, String prenom, int dateDeNaissance, Section section) {
		super();
		this.idEleve = idEleve;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.section = section;
	}



	@Override
	public String toString() {
		return "Eleve [idEleve=" + idEleve + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", section=" + section + "]";
	}



	public int getIdEleve() {
		return idEleve;
	}

	public void setIdEleve(int idEleve) {
		this.idEleve = idEleve;
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

	public int getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(int dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
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
