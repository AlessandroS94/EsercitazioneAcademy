package com.tv;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.tv.interfaces.iHub;
import com.tv.interfaces.iTelecomando;
import com.tv.interfaces.iTelefono;

public class TVAdriano extends Elettrodomestico implements iHub, iTelecomando, iTelefono {

	public static void main(String[] args) {
		// String[] canali = { "canale 5", "rete 4", "mediaset extra", "italia juve",
		// "telenorba", "radio maria",
		// "TV2000" };
		
		ArrayList<String> canali = new ArrayList<>();
		TVAdriano tv = new TVAdriano();
		String programmavisione = "canale 12";
		Boolean canalePresente;
		tv.setNumeroSeriale("12e43232se");
		tv.setProduttore("franco");
		System.out.println("inserisci un nuovo canale nella lista: ");
		Scanner input = new Scanner(System.in);
		String nuovoCanaleLista;
		try {
			nuovoCanaleLista = input.nextLine();
			System.out.println(nuovoCanaleLista);
			tv.aggiungiCanale(canali, nuovoCanaleLista);
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}		
		canali.add("rete 4");
		canali.add("canale 12");
		canali.add("francesco demartino");
		stampa(canali);

		System.out.println("inserisci canale in cui cambiare: ");
		String nuovoCanale="";
		try {
			nuovoCanale = input.nextLine();
			System.out.println(nuovoCanale);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

		System.out.println("stavi vedendo " + programmavisione);

		canalePresente = controlloCanale(canali, nuovoCanale);

		System.out.println("inserisci canale da eliminare: ");
		String eliminare = "";
		try {
			eliminare =  input.nextLine();
			tv.eliminaCanale(canali, eliminare);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
			if (canalePresente == true) {
			tv.cambiaCanale(nuovoCanale);
			System.out.println(nuovoCanale);

		} else {
			System.out.println("il canale non è presente");
		}
		stampa(canali);
		
		// System.out.println("dispositivo " + tv.getNumeroSeriale() + " a cura di " +
		// tv.getNumeroSeriale());
		 System.out.println("attualmente stai vedendo "+nuovoCanale);
	};

	private ArrayList<String> canali;
	private String programmavisione;

	public TVAdriano() {
		// TODO Auto-generated constructor stub
	}

	public TVAdriano(String numeroSeriale, String produttore) {
		super(numeroSeriale, produttore);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getCanali() {
		return canali;
	}

	public void setCanali(ArrayList<String> canali) {
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TVAdriano [canali=" + canali + ", programmavisione=" + programmavisione + "]";
	}

	public static void stampa(ArrayList<String> canali2) {
		for (String canale : canali2) {
			System.out.println("sei su " + canale + "!");
		}
	}

	public static Boolean controlloCanale(ArrayList<String> canali, String Nuovo) {
		for (String canale : canali) {
			if (canale == Nuovo) {
				System.out.println("il " + Nuovo + " selezionato corrisponde a " + canale + "!");
				return true;
			}
		}
		return false;
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

	public void eliminaCanale(ArrayList<String> canali, String ce) {
	/*	int index = 0;
		for (String i : canali) {
			if (i == ce) {
				System.out.println(i);
				canali.remove(index);
			}
			index++;
		} */
		canali.remove(ce);
		this.canali = canali; 
	}

	public void aggiungiCanale(ArrayList<String> canali, String cn) {
		canali.add(cn);
		this.canali = canali;
	}

}
