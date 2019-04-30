package com.fr.adaming.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entities.Eleve;
import com.fr.adaming.entities.Epreuve;
import com.fr.adaming.service.IEleveService;

@RestController
public class EleveController {

	@Autowired
	private IEleveService eleveDao;
	
	
	@GetMapping("/api/get/{idEleve}")
	public Eleve findOneById(@PathVariable Long id) {
		return eleveDao.findOneById(id);
		
//		@PostMapping("/api/Eleve/save")
//		public Eleve save(@RequestBody Eleve e) {
//			return eleveDao.save(e);
//			
//			
//		}
//		
//		
//		@DeleteMapping("/api/Eleve/delete")
//		public void delete(@RequestBody Eleve e) {
//			
//			eleveDao.delete(e);	
//		}
//		
//		@GetMapping("/api/Eleve/getall")
//		public List<Eleve> getAll() {
//			return eleveDao.getAll();
//		}
//		
	

		
		
		
	}
	
	
	
}
