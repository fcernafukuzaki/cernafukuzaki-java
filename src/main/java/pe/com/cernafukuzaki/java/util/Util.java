package pe.com.cernafukuzaki.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {
	
	public static <T extends Number> T sumarElementos(Object tipo, List<T> elementos) {
		if (tipo.equals(Integer.TYPE)) {
			return (T) new Integer(sumarElementos(elementos.stream().mapToInt(i -> (Integer) i.intValue()).toArray()));
		} else if (tipo.equals(Double.TYPE)) {
			return (T) new Double(sumarElementos(elementos.stream().mapToDouble(i -> (Double) i.doubleValue()).toArray()));
		} else if (tipo.equals(Long.TYPE)) {
			return (T) new Long((long) sumarElementos(elementos.stream().mapToLong(i -> (Long) i.longValue()).toArray()));
		}
		return null;
	}
	
	public static int sumarElementos(int... elementos) {
		return Arrays.stream(elementos).sum();
	}
	
	public static double sumarElementos(double... elementos) {
		return Arrays.stream(elementos).sum();
	}
	
	public static double sumarElementos(long... elementos) {
		return Arrays.stream(elementos).sum();
	}
	
	public static int[] nElementosMayores(int tamanio, int... elementos) {
		int contadorTamanio = 0;
		List<Integer> arrayElementosMayores = new ArrayList<Integer>();
		Arrays.sort(elementos);
		while(contadorTamanio < tamanio) {
			arrayElementosMayores.add(Arrays.stream(elementos).limit(elementos.length-contadorTamanio).reduce((primero, ultimo) -> ultimo).getAsInt());
			contadorTamanio++;
		}
		return arrayElementosMayores.stream().mapToInt(i -> i).toArray();
	}
}
