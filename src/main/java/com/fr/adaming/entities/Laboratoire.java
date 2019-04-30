package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Laboratoire implements Serializable{

	@Id
	@GeneratedValue
	private int idLaboratoire;
	
	private String nom;

	private int nbrOrdinateur;
	
	@OneToOne
	private Epreuve epreuve;

	
	
	
	
	
	
	
	public Laboratoire() {
		
	}

	public Laboratoire( String nom,  int nbrOrdinateur) {
	
		
		this.nom = nom;
	
		this.nbrOrdinateur = nbrOrdinateur;
		
	}

	@Override
	public String toString() {
		return "Laboratoire [idLaboratoire=" + idLaboratoire + ", nom=" + nom 
				+ ", nbrOrdinateur=" + nbrOrdinateur + ", epreuve=" + epreuve + "]";
	}

	public int getIdLaboratoire() {
		return idLaboratoire;
	}

	public void setIdLaboratoire(int idLaboratoire) {
		this.idLaboratoire = idLaboratoire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbrOrdinateur() {
		return nbrOrdinateur;
	}

	public void setNbrOrdinateur(int nbrOrdinateur) {
		this.nbrOrdinateur = nbrOrdinateur;
	}

	public Epreuve getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}
	
	
	
	
	
	
}
