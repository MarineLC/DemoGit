package com.fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.ISectionDao;
import com.fr.adaming.entities.Section;

@Service
public class SectionService implements ISectionService{

	@Autowired
	private ISectionDao sectionDao;

	@Override
	public Section findOneById(Long id) {
		// TODO Auto-generated method stub
		return sectionDao.getOne( id);
	}

	@Override
	public Section save(Section s) {
		// TODO Auto-generated method stub
		return sectionDao.save(s);
	}

	@Override
	public void delete(Section s) {
		// TODO Auto-generated method stub
		sectionDao.delete(s);
	}

	@Override
	public List<Section> getAll() {
		// TODO Auto-generated method stub
		return sectionDao.findAll();
	}
	
	
	
	
}
