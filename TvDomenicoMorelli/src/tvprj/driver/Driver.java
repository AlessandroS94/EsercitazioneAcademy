package tvprj.driver;

import tvprj.tv.TV;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strAr1=new String[] {"Ani", "Sam", "Joe"};
		
		TV tv = new TV(null, 0, strAr1);
		
		//tv.recoursiveToString(strAr1.length-1, strAr1);
	}

}
