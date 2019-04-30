package com.fr.adaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IEpreuveDao;
import com.fr.adaming.entities.Epreuve;


@Service
public class EpreuveService implements IEpreuveService {

	
	@Autowired
	private IEpreuveDao epreuveDao;

	@Override
	public Epreuve findOneById(Long id) {
		// TODO Auto-generated method stub
		return epreuveDao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve e) {
		// TODO Auto-generated method stub
		return epreuveDao.save(e);
	}

	@Override
	public void delete(Epreuve e) {
		// TODO Auto-generated method stub
		epreuveDao.delete(e);
	}

	@Override
	public List<Epreuve> getAll() {
		// TODO Auto-generated method stub
		return epreuveDao.findAll();
	}

	
	
	
	
	
}
