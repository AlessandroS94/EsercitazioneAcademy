import java.util.Arrays;

public class TvMicheleBellizzi extends Elettrodomestici{

	String[] canali;

	

	public TvMicheleBellizzi(int numSeriale, String produttore, String[] canali) {
		super(numSeriale, produttore);
		this.canali = canali;
	}


	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}

	
	public String toStringRicorsivo(int n, String s[]){
	    if(n==0){
	        System.out.println(s[n]);
	        return "fine";
	    }
	    System.out.println(s[n]);

	    return toStringRicorsivo(n-1 ,s);
	    
	    
	}


	@Override
	public String toString() {
		return "TvMicheleBellizzi [canali=" + Arrays.toString(canali) + ", NumSeriale=" + NumSeriale + ", produttore="
				+ produttore + "]";
	}
	
	
	
	
	}



