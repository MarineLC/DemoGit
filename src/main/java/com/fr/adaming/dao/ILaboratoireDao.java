package com.fr.adaming.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entities.Laboratoire;

@Repository
public interface ILaboratoireDao extends JpaRepository<Laboratoire, Long>{

	

	
}
