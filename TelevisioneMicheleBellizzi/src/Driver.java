import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stampa();
		
		

	}

	public static void stampa() {
		Scanner input= new Scanner(System.in);
		
		Elettrodomestici elettrodomestici = new Elettrodomestici();
		
		String Produttore=elettrodomestici.produttore;
		int Seriale= elettrodomestici.NumSeriale;
		System.out.println("inserire produttore:");
		Produttore= input.next();
		System.out.println("inserire il seriale");
		Seriale=input.nextInt();
		
		String canale;
		int numeroCanali;
		System.out.println("quanti canali vuoi inserire: ");
		numeroCanali=input.nextInt();
		String[] canali = new String[numeroCanali];
		System.out.println("inserisci  canali:");
		for(int i=0; i<canali.length;i++) {
			canale=input.next();
			canali[i]=canale;
		}
	
		
TvMicheleBellizzi tvMicheleBellizzi= new TvMicheleBellizzi(Seriale,Produttore , canali);

System.out.println(tvMicheleBellizzi);	
tvMicheleBellizzi.toStringRicorsivo(numeroCanali-1, canali);
Arrays.sort(canali);
		
		
	}
}