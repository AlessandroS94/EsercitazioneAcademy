package it.academy.corso.impl;

import it.academy.corso.interfaces.Hub;
import it.academy.corso.interfaces.Mobile;
import it.academy.corso.interfaces.Telecomando;

public class Tv implements Telecomando, Mobile, Hub {
    private String[] canali = {"Italia1", "Canale5", "La7"};
    private String canaleGuardato;

    public String getCanaleGuardato() {
        return canaleGuardato;
    }

    public void setCanaleGuardato(String canaleGuardato) {
        this.canaleGuardato = canaleGuardato;
    }

    public Tv(String[] canali) {
        this.canali = canali;
    }

    public Tv() {

    }

    public String[] getCanali() {
        return canali;
    }

    public void setCanali(String[] canali) {
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
        if (n == this.canali.length - 1) {
            System.out.println(this.canali[n]);
            return "FINE";
        }
        System.out.println(this.canali[n]);
        return toStringRicorsivo(n + 1);
    }

    @Override
    public void cambiaCanaleHub(int n) {
        this.canaleGuardato = canali[n];
    }

    @Override
    public void cambiaCanaleMobile(int n) {
        this.canaleGuardato = canali[n];
    }

    @Override
    public void cambiaCanaleTelecomando(int n) {
        this.canaleGuardato = canali[n];
    }
}
