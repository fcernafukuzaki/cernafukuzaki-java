package pe.com.cernafukuzaki.java.arrays;

import pe.com.cernafukuzaki.java.util.Util;

public class MedidaTendenciaCentral {

	private static MedidaTendenciaCentral INSTANCE;
	
	private MedidaTendenciaCentral() {
		
	}
	
	public static MedidaTendenciaCentral getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new MedidaTendenciaCentral();
		}
		return INSTANCE;
	}

	public double mediaAritmetica(int[] arregloEnteros, int decimales) {
		/*
		int sumaElementos = Util.sumarElementos(arregloEnteros);
		int cantidadElementos = arregloEnteros.length;
		(float) sumaElementos / cantidadElementos
		*/
		OperacionesMatematicas operaciones = new OperacionesMatematicas();
		return operaciones.mediaAritmetica(arregloEnteros, decimales);
	}

	public double mediana(int[] arregloEnteros) {
		Util.ordenar(arregloEnteros);
		float elementoCentro = (float) arregloEnteros.length / 2;
		int elementoCentral = Math.round(elementoCentro);
		/*
		 * Si la cantidad de elementos es par, retornar promedio de los elementos.
		 * De lo contrario, retornar valor del elemento central.
		 */
		if(arregloEnteros.length % 2 == 0) {
			return (float) (arregloEnteros[elementoCentral - 1] + arregloEnteros[elementoCentral]) / 2;
		} else {
			return arregloEnteros[elementoCentral - 1];
		}
	}
}
