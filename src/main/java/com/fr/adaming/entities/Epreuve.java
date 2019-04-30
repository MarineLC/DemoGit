package com.fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Epreuve implements Serializable {
	
	@Id
	@GeneratedValue
	private int idEpreuve;
	
	private String date;
	private String heure;
	
	@ManyToOne
	private Matiere matiere;
	
	@OneToOne
	private Laboratoire laboratoire;
	
	
	
	

	public Epreuve() {
	
	}



	public Epreuve( String date, String heure) {
		
		this.date = date;
		this.heure = heure;
		
	}



	@Override
	public String toString() {
		return "Epreuve [idEpreuve=" + idEpreuve + ", date=" + date + ", heure=" + heure + ", matiere=" + matiere
				+ ", laboratoire=" + laboratoire + "]";
	}



	public Laboratoire getLaboratoire() {
		return laboratoire;
	}



	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}



	public int getIdEpreuve() {
		return idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	
	
	
	

}
