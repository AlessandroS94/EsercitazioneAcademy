package tvprj.impl;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	private String name;
	private int version;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public MapClass(String name, int version) {

		this.name = name;
		this.version = version;
	}


}
