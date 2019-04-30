package com.fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IMatiereDao;
import com.fr.adaming.entities.Matiere;

@Service
public class MatiereService implements IMatiereService{

	@Autowired
	private IMatiereDao matiereDao;

	@Override
	public Matiere findOneById(Long id) {
		// TODO Auto-generated method stub
		return matiereDao.getOne( id);
	}

	@Override
	public Matiere save(Matiere m) {
		// TODO Auto-generated method stub
		return matiereDao.save(m);
	}

	@Override
	public void delete(Matiere m) {
		// TODO Auto-generated method stub
		matiereDao.delete(m);
	}

	@Override
	public List<Matiere> getAll() {
		// TODO Auto-generated method stub
		return matiereDao.findAll();
	}

	
	

	
}
