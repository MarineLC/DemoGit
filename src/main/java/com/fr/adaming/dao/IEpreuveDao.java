package com.fr.adaming.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Epreuve;

@Repository
public interface IEpreuveDao  extends JpaRepository<Epreuve, Long> {

	
	
}
