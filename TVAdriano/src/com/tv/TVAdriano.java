package com.tv;

import java.util.Arrays;

public class TVAdriano extends Elettrodomestico {

	public static void main(String[] args) {
		String[] canali = { "canale 5", "rete 4", "mediaset extra", "italia juve", "telenorba", "radio maria",
				"TV2000" };
		//String numeroSeriale= "12e43232se";
		//String produttore ="franco";
		TVAdriano tv = new TVAdriano();
		//Elettrodomestico elettrodometico = new Elettrodomestico();
		tv.setNumeroSeriale("12e43232se");
		tv.setProduttore("franco");
		stampa(canali);
		System.out.println("dispositivo " + tv.getNumeroSeriale() + " a cura di  " + tv.getNumeroSeriale());
	};

	private String[] canali;

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

	/*public static String stampaR(String[] canali) {
		int n = canali.length;
		String canale = canali[n];
		System.out.println("sei su" + canale + "!");
		return canale + stampa(canali[n-1]);
	} */
	
	public String toStringRicorsivo(int n, String s[]) {
		    if(n==0){
		        System.out.println(s[n]);
		        return "fine";
		    }
		    System.out.println(s[n]);
		    return toStringRicorsivo(n-1 ,s);
	}
	
	
	

}
