import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stampa();

	}

	public static void stampa() {
		
		Scanner input= new Scanner(System.in);
		String canale;
		String[] canali = new String[10];
		System.out.println("inserisci 10 canali:");
		for(int i=0; i<canali.length;i++) {
			canale=input.next();
			canali[i]=canale;
		}
	
		
		TvMicheleBellizzi tvMicheleBellizzi= new TvMicheleBellizzi(canali);
System.out.println(tvMicheleBellizzi);		
		
		
	}
}
