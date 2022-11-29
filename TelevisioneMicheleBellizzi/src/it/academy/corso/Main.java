package it.academy.corso;

import it.academy.corso.impl.Tv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]a){
        Tv tv = new Tv(new String[]{"canale1", "canale2"});
        String [] b = new String[]{"canale1", "canale2"};
        System.out.println(tv.toStringRicorsivo(0, b));
        System.out.println(tv.toStringRicorsivo(0));
        System.out.println("--------------------------");
        tv.cambiaCanaleHub(1);
        System.out.println(tv.getCanaleGuardato());
    }
}
