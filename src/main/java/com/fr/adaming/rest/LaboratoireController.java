package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Laboratoire;

import com.fr.adaming.service.ILaboratoireService;

@RestController
public class LaboratoireController {

	
	@Autowired
	private ILaboratoireService laboratoireDao;
	
	@GetMapping("/api/get/{idLaboratoie}")
	public Laboratoire findOneById(@PathVariable Long id) {
		return laboratoireDao.findOneById(id);
	}

	@PostMapping("/api/Laboratoire/save")
	public Laboratoire save(@RequestBody Laboratoire l) {
		return laboratoireDao.save(l);
	}

	@DeleteMapping("/api/Laboratoire/delete")
	public void delete(@RequestBody Laboratoire l) {
		laboratoireDao.delete(l);
	}

	@GetMapping("/api/Laboratoire/getall")
	public List<Laboratoire> getAll() {
		return laboratoireDao.getAll();
	}

	
	
	
}
