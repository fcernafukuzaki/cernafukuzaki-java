package pe.com.cernafukuzaki.java.mockito.ejemplo;

import pe.com.cernafukuzaki.java.util.Util;

public class Dado {
	
	private int caras;
	
	public Dado(int caras) {
		this.caras = caras;
	}

	public int rodar() {
		return Util.generarNumeroRandom(caras);
	}
}
