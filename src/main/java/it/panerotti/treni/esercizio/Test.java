package it.panerotti.treni.esercizio;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import it.panerotti.treni.AppConfig;
import it.panerotti.treni.eserciziodue.exceptions.OrarioException;
import it.panerotti.treni.eserciziotre.controllers.TabelloneController;
import it.panerotti.treni.eserciziouno.beans.Orario;
import it.panerotti.treni.eserciziouno.controllers.OrarioController;
import it.panerotti.treni.eserciziouno.dao.TreniDAO;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class Test {

	
	@Autowired
	private OrarioController orarioController;
	
	@Autowired
	private TabelloneController tabelloneController;

	@Autowired
	private TreniDAO dao;
	
	@org.junit.Test
	public void test1() throws OrarioException {
		// method for populate data test
		dao.caricaDati();
		
		for (Orario orario:dao.getOrarioList()) {
			orarioController.getDelayByCodice(orario.getCodiceTreno());
			orarioController.isDelayByCodice(orario.getCodiceTreno());
			try {
				//for second exercise
				orarioController.updateOrario(orario.getCodiceTreno(), 1);
			}catch(OrarioException e) {
				System.out.println(e.getMessage());
			}
		}
		 
   
	}
	
	@org.junit.Test
	public void test3() throws OrarioException {
		// method for populate data test
		dao.caricaDati();
		Orario orario = new Orario ("IC0212",13,null,"Milano");
		// for point 1 exercise 3
		tabelloneController.insertFirstOrario(orario);
		
		// check test controller
		System.out.println(dao.getOrarioList().get(0));
		
		tabelloneController.addOrario(orario);
		// check test controller
		System.out.println(dao.getOrarioList().get(dao.getOrarioList().size() -1));
		
		
		System.out.println("Verifico che cancella il primo elemento. Stampo il primo elemento: " + dao.getOrarioList().get(0));
		
		tabelloneController.deleteFirstOrario();
		
		System.out.println("Ristampo il primo elemento dopo l'esecuzione di deleteFirstOrario -> " + dao.getOrarioList().get(0));
		
		System.out.println("TEST STAMPA TUTTI I TRENI: \n " + tabelloneController.getAllOrari());
   
	}
}
