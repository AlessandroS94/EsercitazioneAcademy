package tvprj.tv;

import java.util.Arrays;

public class TV {

	String[] canali;

	public String[] getTvlist() {
		return canali;
	}

	public void setTvlist(String[] canali) {
		this.canali = canali;
	}

	@Override
	public String toString() {
		return "TV [canali=" + Arrays.toString(canali) + "]";
	}

	public TV(String[] canali) {
		super();
		this.canali = canali;
	}

}
