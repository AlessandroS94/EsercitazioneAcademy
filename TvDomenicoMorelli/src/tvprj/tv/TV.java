package tvprj.tv;

import java.util.Arrays;
import java.util.Iterator;

public class TV extends Elettrodomestici {
	String[] canali;

	public TV(String produttore, int seriale, String[] canali) {
		super(produttore, seriale);
		this.canali = canali;
	}

	public String[] getTvlist() {
		return canali;
	}

	public void setTvlist(String[] canali) {
		this.canali = canali;
	}

	public String recoursiveToString(int n, String[] arr) {

		if (n == 0) {
			System.out.println(arr[n]);
			System.out.println("fine");
		}
		System.out.println(arr[n]);
		return recoursiveToString(n - 1, arr);
	}

	@Override
	public String toString() {
		return "TV [canali=" + Arrays.toString(canali) + ", produttore=" + produttore + ", seriale=" + seriale + "]";
	}
	
	

}
