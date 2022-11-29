
import java.util.Arrays;

public class TvAntonio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
	}
	
	String[] canali = new String[] 
			{ "Rai 1", "Rai 2", "Rai 3", "Canale 5 ", "LA7" };
	
	
	
	
	
	
	
	public TvAntonio(String[] canali) {
		super();
		this.canali = canali;
	}







	public String[] getCanali() {
		return canali;
	}







	public void setCanali(String[] canali) {
		this.canali = canali;
	}







	@Override
	public String toString() {
		return "TvAntonio [canali=" + Arrays.toString(canali) + "]";
	}







	public  void Stampa(String[]  canale) {
		
		System.out.println(canali.toString());
		
	}

	

}

