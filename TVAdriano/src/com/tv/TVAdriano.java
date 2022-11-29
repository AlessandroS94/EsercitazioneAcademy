package com.tv;

import java.util.Arrays;
import java.util.Scanner;

import com.tv.interfaces.iHub;
import com.tv.interfaces.iTelecomando;
import com.tv.interfaces.iTelefono;

public class TVAdriano extends Elettrodomestico implements iHub, iTelecomando, iTelefono {

	public static void main(String[] args) {
		String[] canali = { "canale 5", "rete 4", "mediaset extra", "italia juve", "telenorba", "radio maria",
				"TV2000"};
		//System.out.println("inserisci il canale nuovo: ");
		//Scanner input= new Scanner(System.in);
		String programmavisione = "canale 5";
		String nuovoCanale = "rete 4";
		Boolean canalePresente;
		
		
		TVAdriano tv = new TVAdriano();
		tv.setNumeroSeriale("12e43232se");
		tv.setProduttore("franco");
		System.out.println(programmavisione);
		
		canalePresente= controlloCanale(canali, nuovoCanale);
		
		if(canalePresente==true) {
			tv.cambiaCanale(nuovoCanale);
			System.out.println(nuovoCanale);
			
		} else {
			System.out.println("il canale non è presente");
		}
		// stampa(canali);
		// System.out.println("dispositivo " + tv.getNumeroSeriale() + " a cura di " +
		// tv.getNumeroSeriale());
		//System.out.println(nuovoCanale);
	};

	private String[] canali;
	private String programmavisione;

	public TVAdriano() {
		// TODO Auto-generated constructor stub
	}

	public TVAdriano(String numeroSeriale, String produttore) {
		super(numeroSeriale, produttore);
		// TODO Auto-generated constructor stub
	}

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TVadriano [canali=" + Arrays.toString(canali) + "]";
	}

	public static void stampa(String[] canali) {
		for (String canale : canali) {
			System.out.println("sei su" + canale + "!");
		}
	}

	public static Boolean controlloCanale(String[] canali, String Nuovo) {
		for (String canale : canali) {
			if (canale == Nuovo) {
				System.out.println("il " + Nuovo + " selezionato corrisponde a " + canale + "!");
				return true;
			} 
		}return false;
	}

	/*
	 * public static String stampaR(String[] canali) { int n = canali.length; String
	 * canale = canali[n]; System.out.println("sei su" + canale + "!"); return
	 * canale + stampa(canali[n-1]); }
	 */

	public String toStringRicorsivo(int n, String s[]) {
		if (n == 0) {
			System.out.println(s[n]);
			return "fine";
		}
		System.out.println(s[n]);
		return toStringRicorsivo(n - 1, s);
	}

	@Override
	public void cambiaCanale(String n) {
		// TODO Auto-generated method stub
		this.programmavisione = n;
	}

}
