package it.panerotti.treni.eserciziouno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.panerotti.treni.eserciziodue.exceptions.OrarioException;
import it.panerotti.treni.eserciziouno.services.OrarioService;

@Controller
public class OrarioController {

	@Autowired
	private OrarioService orarioService;
	
	@RequestMapping(value="/getDelayByCodice", method = RequestMethod.GET)
	public @ResponseBody String getDelayByCodice(@PathVariable String codiceTreno) {
		
		String delayTreno = orarioService.getDelayByCodice(codiceTreno);
		
		//Only for test
		System.out.println("Response of orarioService.getDelayByCodice -> " + delayTreno);
	 
		return delayTreno;

	}
	
	@RequestMapping(value="/isDelayByCodice", method = RequestMethod.GET)
	public @ResponseBody Boolean isDelayByCodice(@PathVariable String codiceTreno) {
		
		Boolean isDelay = orarioService.isDelayByCodice(codiceTreno);
		//Only for test		
		System.out.println("Response of orarioService.isDelayByCodice -> " + isDelay);
		
		return isDelay;

	}
	
	@RequestMapping(value="/updateOrario", method = RequestMethod.GET)
	public @ResponseBody Boolean updateOrario(@PathVariable String codiceTreno,@PathVariable int orarioPartenzaTreno) throws OrarioException {
		
	    orarioService.updateStartTrainByCodice(codiceTreno, orarioPartenzaTreno);
		 		
	 
		return true;

	}
}
