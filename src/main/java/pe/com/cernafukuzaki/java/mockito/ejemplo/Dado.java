package pe.com.cernafukuzaki.java.mockito.ejemplo;

import pe.com.cernafukuzaki.java.util.Util;

public class Dado {
	
	private int caras;
	
	public Dado(int caras) {
		this.caras = caras;
	}

	/**
	 * Retorna valor al rodar un dado.
	 * <p>Retorna el valor de la cara del dado.</p>
	 * 
	 * @author Francisco Cerna Fukuzaki
	 * @return Número de la cara del dado.
	 */
	public int rodar() {
		return Util.generarNumeroRandom(caras);
	}
}
