package tvprj.driver;

import tvprj.impl.TV;

public class Driver {

	public static void main(String[] args) {
		
		 String[] strAr1=new String[] {"italia1", "italia2", "italia3","Radio Maria","MTV"};
		System.out.println("inizio");
		TV tv = new TV();
		tv.setCanali(strAr1);
			
		tv.cambiaCanale("italia1");
	}
}
