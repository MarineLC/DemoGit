package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IEleveDao;
import com.fr.adaming.entities.Eleve;

@Service
public class EleveService implements IEleveService{

	@Autowired
	private IEleveDao eleveDao;
	


	@Override
	public Eleve save(Eleve e) {
		// TODO Auto-generated method stub
		return eleveDao.save(e);
	}

	@Override
	public void delete(Eleve e) {
		// TODO Auto-generated method stub
		eleveDao.delete(e);
	}

	@Override
	public List<Eleve> getAll() {
		// TODO Auto-generated method stub
		return eleveDao.findAll();
	}

	@Override
	public Eleve findOneById(Long id) {
		// TODO Auto-generated method stub
		return eleveDao.getOne(id);
	}



	
	
	
}
