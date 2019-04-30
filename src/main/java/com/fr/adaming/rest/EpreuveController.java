package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Epreuve;
import com.fr.adaming.service.IEpreuveService;

@RestController
public class EpreuveController {

	@Autowired
	private IEpreuveService serviceDao;
	
	@GetMapping("/api/get/{idEpreuve}")
	public Epreuve findOneById(@PathVariable Long id) {
		
		return serviceDao.findOneById(id);
		
	}
	
	@PostMapping("/api/Epreuve/save")
	public Epreuve save(@RequestBody Epreuve e) {
		return serviceDao.save(e);
		
		
	}
	
	
	@DeleteMapping("/api/Epreuve/delete")
	public void delete(@RequestBody Epreuve e) {
		
	serviceDao.delete(e);	
	}
	
	@GetMapping("/api/Epreuve/getall")
	public List<Epreuve> getAll() {
		return serviceDao.getAll();
	}
	
}
