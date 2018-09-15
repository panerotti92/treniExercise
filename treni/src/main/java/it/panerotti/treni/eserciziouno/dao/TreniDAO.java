package it.panerotti.treni.eserciziouno.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.panerotti.treni.eserciziouno.beans.Orario;

@Component
public class TreniDAO {

	private List<Orario> orarioList = new ArrayList<Orario>();

	public void caricaDati() {
		for(int i=0; i < 10; i++) {
			Orario orario = new Orario("ICTY00" + i,i+2,i+3,"RM");
			orarioList.add(orario);
		}
	}
	
	
	public void setOrarioList(List<Orario> orarioList) {
		this.orarioList = orarioList;
	}


	public List<Orario> getOrarioList() {
		return orarioList;
	}

 
	
	
	
}
