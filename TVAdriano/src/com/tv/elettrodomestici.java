package com.tv;

public class elettrodomestici {

	private String numeroSeriale;
	private String produttore;
	
	public String getNumeroSeriale() {
		return numeroSeriale;
	}
	public void setNumeroSeriale(String numeroSeriale) {
		this.numeroSeriale = numeroSeriale;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public elettrodomestici(String numeroSeriale, String produttore) {
		this.numeroSeriale = numeroSeriale;
		this.produttore = produttore;
	}
	
	
}
