package it.panerotti.treni.eserciziouno.beans;

public class Orario {
	
	private String codiceTreno;
	private int orarioPartenzaPrevisto;
	private int orarioPartenzaEffettivo;
	private String destinazioneTreno;
	
	public Orario(String codiceTreno, int orarioPartenzaPrevisto, Integer orarioPartenzaEffettivo,
			String destinazioneTreno) {
 
		this.codiceTreno = codiceTreno;
		this.orarioPartenzaPrevisto = orarioPartenzaPrevisto;
		this.destinazioneTreno = destinazioneTreno;
		
		if (orarioPartenzaEffettivo == null)
			this.orarioPartenzaEffettivo = orarioPartenzaPrevisto;
		else
			this.orarioPartenzaEffettivo = orarioPartenzaEffettivo;
	}

	public String getCodiceTreno() {
		return codiceTreno;
	}

	public void setCodiceTreno(String codiceTreno) {
		this.codiceTreno = codiceTreno;
	}

	public int getOrarioPartenzaPrevisto() {
		return orarioPartenzaPrevisto;
	}

	public void setOrarioPartenzaPrevisto(int orarioPartenzaPrevisto) {
		this.orarioPartenzaPrevisto = orarioPartenzaPrevisto;
	}

	public int getOrarioPartenzaEffettivo() {
		return orarioPartenzaEffettivo;
	}

	public void setOrarioPartenzaEffettivo(int orarioPartenzaEffettivo) {
		this.orarioPartenzaEffettivo = orarioPartenzaEffettivo;
	}

	public String getDestinazioneTreno() {
		return destinazioneTreno;
	}

	public void setDestinazioneTreno(String destinazioneTreno) {
		this.destinazioneTreno = destinazioneTreno;
	}

	@Override
	public String toString() {
		return "Treno " + codiceTreno + " per " + destinazioneTreno  + " - partenza ore: "+orarioPartenzaPrevisto
				+ " - orario effettivo: ore " + orarioPartenzaEffettivo + " - ritardo " + (orarioPartenzaEffettivo - orarioPartenzaPrevisto) + " ore/a .";
	}
	
	
}
