package com.tv;

public class TvAdriano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] canali =  { "canale 5", "rete 4", "mediaset extra", "italia juve", "telenorba", "radio maria", "TV2000" };
		
	}

	private String[] canali;

	public void stampa(String[] canali) {
		 for(String canale: canali) {
	            System.out.println("sei su... " + canale + "!");
	        }
	}

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}

	public TvAdriano(String[] canali) {
		this.canali = canali;
	}

}
