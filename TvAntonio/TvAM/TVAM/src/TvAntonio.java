
import java.util.Arrays;

public class TvAntonio {

	String[] canali;

	public TvAntonio(String[] canali) {
		
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TvAntonio [canali=" + Arrays.toString(canali) + "]";
	}

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}
}