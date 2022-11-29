import java.util.Arrays;

public class TvMicheleBellizzi {

	String[] canali;

	public TvMicheleBellizzi(String[] canali) {
		
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TvMicheleBellizzi [canali=" + Arrays.toString(canali) + "]";
	}

	public String[] getCanali() {
		return canali;
	}

	public void setCanali(String[] canali) {
		this.canali = canali;
	}
}