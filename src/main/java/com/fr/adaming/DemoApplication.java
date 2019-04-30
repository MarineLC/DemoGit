package com.fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.dao.IEleveDao;
import com.fr.adaming.dao.IEpreuveDao;
import com.fr.adaming.dao.ILaboratoireDao;
import com.fr.adaming.dao.IMatiereDao;
import com.fr.adaming.dao.ISectionDao;
import com.fr.adaming.entities.Eleve;
import com.fr.adaming.entities.Epreuve;
import com.fr.adaming.entities.Laboratoire;
import com.fr.adaming.entities.Matiere;
import com.fr.adaming.entities.Section;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
//		IEleveDao edao = ctx.getBean(com.fr.adaming.dao.IEleveDao.class);
//		
//		
//		Eleve e = new Eleve();
//		edao.save(e);
//		
		
	
		ILaboratoireDao ldao = ctx.getBean(com.fr.adaming.dao.ILaboratoireDao.class);
		
		IEpreuveDao edao = ctx.getBean(com.fr.adaming.dao.IEpreuveDao.class);
		
		IMatiereDao mdao = ctx.getBean(com.fr.adaming.dao.IMatiereDao.class);
		
		ISectionDao sdao = ctx.getBean(com.fr.adaming.dao.ISectionDao.class);
		
		Laboratoire l = new Laboratoire( "Physique", 3);
		ldao.save(l);
		Section s = new Section("Mathématique");
		sdao.save(s);
		
		Matiere m = new Matiere("Informatique",2 , 4 );
		m.setSection(s);
		mdao.save(m);
				
		Epreuve e = new Epreuve("26/04/2019","10h");
		e.setLaboratoire(l);
		e.setMatiere(m);
		edao.save(e);
		
		
		
	
		
	
		
		
	}
		
		
	}


