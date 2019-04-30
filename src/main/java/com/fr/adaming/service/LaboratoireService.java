package com.fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.ILaboratoireDao;
import com.fr.adaming.entities.Laboratoire;

@Service
public class LaboratoireService implements ILaboratoireService{

	@Autowired
	private ILaboratoireDao laboratoireDao;

	@Override
	public Laboratoire findOneById(Long id) {
		// TODO Auto-generated method stub
		return laboratoireDao.getOne( id);
	}

	@Override
	public Laboratoire save(Laboratoire l) {
		// TODO Auto-generated method stub
		return laboratoireDao.save(l);
	}

	@Override
	public void delete(Laboratoire l) {
		// TODO Auto-generated method stub
		laboratoireDao.delete(l);
	}

	@Override
	public List<Laboratoire> getAll() {
		// TODO Auto-generated method stub
		return laboratoireDao.findAll();
	}
	
	
}
