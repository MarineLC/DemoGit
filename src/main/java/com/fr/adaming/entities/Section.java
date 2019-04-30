package com.fr.adaming.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Section implements Serializable{
	
	@Id @GeneratedValue
	private int idSection;
	
	private String libelle;
	
	@OneToMany (mappedBy="section")
	List<Eleve> eleves;
	
	@OneToMany (mappedBy="section")
	List<Matiere> matieres;

	public Section() {
	
	}


	






	public Section( String libelle) {
		
	
		this.libelle = libelle;
		
	}









	@Override
	public String toString() {
		return "Section [idSection=" + idSection + ", libelle=" + libelle + ", eleves=" + eleves + ", matieres=" + matieres + "]";
	}



	public int getIdSection() {
		return idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public List<Eleve> getEleves() {
		return eleves;
	}



	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}



	public List<Matiere> getMatieres() {
		return matieres;
	}



	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}



	
	

}
