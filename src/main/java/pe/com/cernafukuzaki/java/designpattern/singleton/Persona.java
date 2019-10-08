package pe.com.cernafukuzaki.java.designpattern.singleton;

public class Persona {

	/*
	 * Instancia estática y final.
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
	 * Operación que retorna la única instancia
	 */
	public static Persona getInstance() {
		return INSTANCE;
	}
}
