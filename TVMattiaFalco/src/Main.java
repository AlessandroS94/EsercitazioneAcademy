import Model.Canale;
import Model.Tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 6;
        Canale c = new Canale(1, "Rai 1");
        Canale c2 = new Canale(2, "Rai 2");
        Canale c3 = new Canale(5, "Canale 5");
        Canale c4 = new Canale(47, "Super");
        Canale c5 = new Canale(52, "DMAX");

        Tv tv = new Tv(max);
        tv.addCanale(c);
        tv.addCanale(c2);
        tv.addCanale(c3);
        tv.addCanale(c4);
        tv.addCanale(c5);

        tv.stampaCanale(1);
        tv.stampaCanali();
        System.out.println("\n");
        System.out.println(tv.toStringRicorsivo(0));
        System.out.println("\n");

        tv.setCanaleInVisione(c);
        tv.cambiaCanaleClick(52);
        tv.stampaCanaleInVisione();

        tv.cambiaCanaleVoce("Rai 1");
        tv.stampaCanaleInVisione();

        Scanner scn = new Scanner(System.in);
        System.out.println("Inserisci il canale dal telecomando : ");
        int can = scn.nextInt();
        if(tv.exists(can)){
            tv.cambiaCanaleClick(can);
            tv.stampaCanaleInVisione();
        }else{
            System.out.println("Il canale non esiste!");
        }
    }
}