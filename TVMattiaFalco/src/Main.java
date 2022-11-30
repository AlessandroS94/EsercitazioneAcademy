import Model.Canale;
import Model.Tv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Canale c = new Canale(1, "Rai 1");
        Canale c2 = new Canale(2, "Rai 2");
        Canale c3 = new Canale(5, "Canale 5");
        Canale c4 = new Canale(47, "Super");
        Canale c5 = new Canale(52, "DMAX");

        Tv tv = new Tv();
        tv.addCanale(c);
        tv.addCanale(c2);
        tv.addCanale(c3);
        tv.addCanale(c4);
        tv.addCanale(c5);
        tv.setCanaleInVisione(c);

        Scanner scn = new Scanner(System.in);
        int scelta ,can;
        String voce;
        boolean exit = false;

        while (exit != true) {
            scelta = 0;
            do {
                System.out.println("Benvenuto su " + tv.getCanaleInVisione().getNome());
                System.out.println("1 - Canale successivo");
                System.out.println("2 - Canale precedente");
                System.out.println("3 - Inserisci il canale");
                System.out.println("4 - Inserisci tramite comando vocale");
                System.out.println("5 - Elenco canali");
                System.out.println("6 - Esci");
                scelta = scn.nextInt();
                if (scelta>6 || scelta<1){
                    System.out.println("Inserisci un numero compreso tra 1 e 6!");
                }
            }while(scelta<1 || scelta>6);

            switch (scelta) {
                case 1:
                    tv.prossimoCanaleClick();
                    break;
                case 2:
                    tv.precedenteCanaleClick();
                    break;
                case 3:
                    do {
                        System.out.println("Inserisci il canale : ");
                        can = scn.nextInt();
                    }while(!tv.exists(can));

                    tv.cambiaCanaleClick(can);
                    break;
                case 4:
                    System.out.println("Quale canale vuoi guardare : ");
                    voce = scn.next();
                    tv.cambiaCanaleVoce(voce);
                    break;
                case 5:
                    tv.stampaCanali();
                    break;
                case 6:
                    exit = true;
            }
        }

        /*
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
         */
    }
}