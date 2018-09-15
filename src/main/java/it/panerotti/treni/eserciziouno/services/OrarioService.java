package it.panerotti.treni.eserciziouno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import it.panerotti.treni.eserciziodue.exceptions.OrarioException;
import it.panerotti.treni.eserciziouno.beans.Orario;
import it.panerotti.treni.eserciziouno.dao.TreniDAO;

@Component
public class OrarioService {

	@Autowired
	private TreniDAO dao;
	
	public String getDelayByCodice(String codiceTreno) {
		List<Orario> listOrario = dao.getOrarioList();
		String ritardoResponse = "";
		
		for(Orario orario:listOrario) {
			if(codiceTreno.equals(orario.getCodiceTreno())) {
				ritardoResponse = "Ore di ritardo pari a : " + (orario.getOrarioPartenzaEffettivo() - orario.getOrarioPartenzaPrevisto());
			}
		}
		if (StringUtils.isEmpty(ritardoResponse))
			ritardoResponse = "Il treno cercato non esiste";
		
		return ritardoResponse;
	}
	
	public boolean isDelayByCodice(String codiceTreno) {
		boolean isDelay = false;
		
		List<Orario> listOrario = dao.getOrarioList();
		
		for(Orario orario:listOrario) {
			if(codiceTreno.equals(orario.getCodiceTreno()) && (orario.getOrarioPartenzaEffettivo() - orario.getOrarioPartenzaPrevisto()) > 0) {
				isDelay = true;
			}
		}
		
		return isDelay;
	}
	
	public void updateStartTrainByCodice(String codiceTreno,int hourStart ) throws OrarioException {
		List<Orario> listOrario = dao.getOrarioList();
		
		for(Orario orario:listOrario) {
			if(codiceTreno.equals(orario.getCodiceTreno())) {
				 if(orario.getOrarioPartenzaPrevisto() > hourStart) {
					 //lancio errore.
					 throw new OrarioException("Orario di partenza effettivo, inferiore rispetto l'ora di partenza previsto!");
				 }else {
					 orario.setOrarioPartenzaEffettivo(hourStart);
				 }
					
			}
		}
	}
}
