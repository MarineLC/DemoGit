package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.fr.adaming.entities.Section;
import com.fr.adaming.service.ISectionService;

@RestController
public class SectionController {

	@Autowired
	private ISectionService sectionDao;
	
	@GetMapping("/api/get/{idSection}")
	public Section findOneById(@PathVariable Long id) {
		return sectionDao.findOneById(id);
	}

	@PostMapping("/api/Section/save")
	public Section save(@RequestBody Section s) {
		return sectionDao.save(s);
	}

	@DeleteMapping("/api/Section/delete")
	public void delete(@RequestBody Section s) {
		sectionDao.delete(s);
	}

	@GetMapping("/api/Section/getall")
	public List<Section> getAll() {
		return sectionDao.getAll();
	}
	
	
}
