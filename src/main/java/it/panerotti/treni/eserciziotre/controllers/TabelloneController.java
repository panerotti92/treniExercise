package it.panerotti.treni.eserciziotre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.panerotti.treni.eserciziotre.services.TabelloneService;
import it.panerotti.treni.eserciziouno.beans.Orario;

@Controller
public class TabelloneController {
	
	@Autowired
	private TabelloneService tabelloneService;
	
	@RequestMapping(value="/insertFirstOrario", method = RequestMethod.GET)
	public @ResponseBody String insertFirstOrario(@PathVariable Orario orario) {
		
		tabelloneService.insertFirstOrario(orario);
		
		return "OK";
	}
	
	@RequestMapping(value="/addOrario", method = RequestMethod.GET)
	public @ResponseBody String addOrario(@PathVariable Orario orario) {
		
		tabelloneService.addOrario(orario);
		
		return "OK";
	}
	
	@RequestMapping(value="/deleteFirstOrario", method = RequestMethod.GET)
	public @ResponseBody String deleteFirstOrario() {
		
		tabelloneService.deleteFirstOrario();
		
		return "OK";
	}
	
	@RequestMapping(value="/getAllOrari", method = RequestMethod.GET)
	public @ResponseBody String getAllOrari() {
		
		String allOrari = tabelloneService.getAllOrari();
		 
		
		return allOrari;
	}

}
