package it.panerotti.treni.eserciziotre.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.panerotti.treni.eserciziouno.beans.Orario;
import it.panerotti.treni.eserciziouno.dao.TreniDAO;

@Component
public class TabelloneService {

	@Autowired
	private TreniDAO dao;
	
	public void insertFirstOrario(Orario orario) {
		
		List<Orario> orarioListTemp = dao.getOrarioList();
		List<Orario> orarioList = new ArrayList<Orario>();
		orarioList.add(orario);
		
		for(Orario o : orarioListTemp)
			orarioList.add(o);
		
		dao.setOrarioList(orarioList);
		
	}
	
	public void addOrario(Orario orario) {
		dao.getOrarioList().add(orario);
	}
	
	public void deleteFirstOrario() {
		List<Orario> orarioListTemp = dao.getOrarioList();
		List<Orario> orarioList = new ArrayList<Orario>();
		
		for ( int i=1; i < orarioListTemp.size()-1;i++)
			orarioList.add(orarioListTemp.get(i));
		 dao.setOrarioList(orarioList);
	}
	
	public String getAllOrari() {
		String orari = "";
		List<Orario> orarioList = dao.getOrarioList();
		
		if(orarioList.size() > 0) {
			for(Orario o : orarioList)
				orari += o.toString() + " \n";
		}else {
			orari = "Il tabellone è vuoto.";
		}
		
		return orari;
	}
	
	
}
