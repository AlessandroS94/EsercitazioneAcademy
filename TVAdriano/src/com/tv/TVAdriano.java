package com.tv;

import java.util.Arrays;

public class TVAdriano {

	public static void main(String[] args) {
		String[] canali = { "canale 5", "rete 4", "mediaset extra", "italia juve", "telenorba", "radio maria",
				"TV2000" };

		stampa(canali);
	};

	private String[] canali;

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}

	public TVAdriano(String[] canali) {
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
