package tvprj.impl;

import java.util.Arrays;
import java.util.Iterator;

import tvprj.interfaces.Hub;
import tvprj.interfaces.Telecomando;
import tvprj.interfaces.Telefono;

public class TV extends Elettrodomestici implements Hub, Telefono, Telecomando {
	String[] canali;
	String canaleCorrente;

	public TV(String produttore, int seriale, String[] canali, String canaleCorrente) {
		super(produttore, seriale);
		this.canali = canali;
		this.canaleCorrente = canaleCorrente;
	}

	public TV() {
		super();
	}

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}

	public String getCanaleCorrente() {
		return canaleCorrente;
	}

	public void setCanaleCorrente(String canaleCorrente) {
		this.canaleCorrente = canaleCorrente;
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
	public String toString() {
		return "TV [canali=" + Arrays.toString(canali) + ", produttore=" + produttore + ", seriale=" + seriale + "]";
	}

	@Override
	public void cambiaCanale(String canale) {
		if (this.canali == null) {
			System.out.println("l'array e' vuoto");
		} else {
			int i = 0;
			do {

				if (canale == canali[i]) {
					this.canaleCorrente = canale;
					System.out.println("Il canale " + canale + " e' presente");
				}
				++i;
			} while (canale == canali[i] || i == canali.length);
			if (i == canali.length)
				System.out.println("Canale non presente");
		}

	}

}
