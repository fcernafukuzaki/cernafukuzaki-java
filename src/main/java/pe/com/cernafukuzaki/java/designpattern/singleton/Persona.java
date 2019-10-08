package pe.com.cernafukuzaki.java.designpattern.singleton;

public class Persona {

	/*
	 * Instancia est�tica y final.
	 * Static: Puede ser utilizado sin instanciar la clase.
	 * Final: No es modificable.
	 */
	private static final Persona INSTANCE = new Persona();
	
	/*
	 * Constructor privado.
	 */
	private Persona() {
		
	}
	
	/*
	 * Operaci�n que retorna la �nica instancia
	 */
	public static Persona getInstance() {
		return INSTANCE;
	}
}
