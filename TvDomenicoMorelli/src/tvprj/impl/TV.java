package tvprj.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import tvprj.interfaces.Hub;
import tvprj.interfaces.Telecomando;
import tvprj.interfaces.Telefono;

public class TV extends Elettrodomestici implements Hub, Telefono, Telecomando {
	List<String> canali;
	String canaleCorrente;

	public TV() {
		super();
	}

	public List<String> getCanali() {
		return canali;
	}

	public void setCanali(List<String> canali) {
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TV [canali=" + canali + ", canaleCorrente=" + canaleCorrente + ", produttore=" + produttore
				+ ", seriale=" + seriale + "]";
	}

	public String getCanaleCorrente() {
		return canaleCorrente;
	}

	public String recoursiveToString(int n, String[] arr) {

		if (n == 0) {
			System.out.println(arr[n]);
			System.out.println("fine");
		}
		System.out.println(arr[n]);
		return recoursiveToString(n - 1, arr);
	}

	@Override
	public void cambiaCanale(String canaleUtente) {
		this.canaleCorrente = canaleUtente; 
		
	}
	
	public void addCanale(String canaleUtente) {
		this.canali.add(canaleUtente); 
		
	}
	
	public void printCanali() {
		for(String str:canali) {
			System.out.println(str);
		}
	}

	/*
	 * @Override public void cambiaCanale(String canale) { if (this.canali == null)
	 * { System.out.println("l'array e' vuoto"); } else { int i = 0; do {
	 * 
	 * if (canale.equals(canali[i])) { this.canaleCorrente = canale;
	 * System.out.println("Il canale " + canale + " e' presente"); } ++i; } while
	 * (canale == canali[i] || i == canali.length);
	 * 
	 * /* errore * if (i == canali.length)
	 * System.out.println("Canale non presente"); }
	 * 
	 * }
	 */
}
