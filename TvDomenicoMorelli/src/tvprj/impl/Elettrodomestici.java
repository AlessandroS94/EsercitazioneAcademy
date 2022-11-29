package tvprj.impl;

public class Elettrodomestici {

	String produttore;
	int seriale;

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

	public int getSeriale() {
		return seriale;
	}

	public void setSeriale(int seriale) {
		this.seriale = seriale;
	}

	public Elettrodomestici(String produttore, int seriale) {
		this.produttore = produttore;
		this.seriale = seriale;
	}

	public Elettrodomestici() {

	}

	@Override
	public String toString() {
		return "Elettrodomestici [produttore=" + produttore + ", seriale=" + seriale + "]";
	}
}
