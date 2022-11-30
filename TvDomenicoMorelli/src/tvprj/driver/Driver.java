package tvprj.driver;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tvprj.impl.TV;

public class Driver {

	public static void main(String[] args) {
		short ctrl = 0;
		List<String> list = new ArrayList<>();

		list.add("italia1");
		list.add("italia2");
		list.add("italia3");
		list.add("Radio Maria");
		list.add("MTV");
		TV tv = new TV();
		tv.setCanali(list);
		Scanner sc = new Scanner(System.in);
		String canaleUtente = null;
		do {

			System.out.println("C'a ma fa'?\n");
			System.out.println("1) Aggiungi canale");
			System.out.println("\n2) Cambia canale");
			System.out.println("\n3) Rimuovi canale");
			ctrl=sc.nextShort();
			sc.nextLine();
			switch (ctrl) {
			case 1:
				System.out.println("Inserisci il nome del canale da aggiungere");
				canaleUtente = sc.nextLine();
				tv.addCanale(canaleUtente);
				break;
			case 2:
				System.out.println("Inserisci il nome del canale da visualizzare");
				canaleUtente = sc.nextLine();
				tv.cambiaCanale(canaleUtente);
				break;
			case 3:
				tv.cambiaCanale(null);
				break;
			case 4:
				tv.printCanali();
				break;

			default:
				System.out.println("Valore non accettato: " + ctrl);
			}
		} while (ctrl != 1 && ctrl != 2 && ctrl != 3&& ctrl != 4);

		System.out.println("Ecco tutti i canali");
		tv.printCanali();
		
	}
}
