package it.academy.corso.impl;

import java.util.ArrayList;
import java.util.HashMap;

import it.academy.corso.interfaces.Hub;
import it.academy.corso.interfaces.Mobile;
import it.academy.corso.interfaces.Telecomando;

public class Tv implements Telecomando, Mobile, Hub {
	private ArrayList<String> canali = new ArrayList<String>();
	public HashMap<String, Integer> getApplication() {
		return application;
	}

	public void setApplication(HashMap<String, Integer> application) {
		this.application = application;
	}

	private HashMap<String, Integer> application= new HashMap<>();
	
	private String canaleGuardato;

	
	
	public String getCanaleGuardato() {
		return canaleGuardato;
	}

	public void setCanaleGuardato(String canaleGuardato) {
		this.canaleGuardato = canaleGuardato;
	}

	public ArrayList<String> getCanali() {
		return canali;
	}

	public void setCanali(ArrayList<String> canali) {
		this.canali = canali;
	}

	public Tv() {

	}

	public Tv(ArrayList<String> canali) {
		this.canali = canali;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String toStringRicorsivo(int n, String[] a) {
		if (n == a.length - 1) {
			System.out.println(a[n]);
			return "FINE";
		}
		System.out.println(a[n]);
		return toStringRicorsivo(n + 1, a);
	}

	public String toStringRicorsivo(int n) {
		if (n == this.canali.size() - 1) {
			System.out.println(canali);
			return "FINE";
		}
		System.out.println(canali);
		return toStringRicorsivo(n + 1);
	}

	@Override
	public void cambiaCanaleHub(int n) {
	canaleGuardato= canali.get(n);

	}

	@Override
	public void cambiaCanaleMobile(int n) {
		canaleGuardato= canali.get(n);

	}

	@Override
	public void cambiaCanaleTelecomando(int n) {
		canaleGuardato= canali.get(n);


	}

	@Override
	public void cambiaCanaleTelefono(int n) {
		canaleGuardato= canali.get(n);


	}
	
	


}
