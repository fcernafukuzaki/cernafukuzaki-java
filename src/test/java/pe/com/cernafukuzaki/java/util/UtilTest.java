package pe.com.cernafukuzaki.java.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@Tag("UtilTest")
@DisplayName("Pruebas de clase utilitaria")
@TestMethodOrder(OrderAnnotation.class)
class UtilTest {

	int[] arregloEnteros = {2,4,6,8,10};
	double[] arregloDecimales = {2.5,4.1,6.5,8.5,10.9};
	long[] arregloLong = {22222,444444,644444,88888,10000};
	
	List<Integer> listaEnteros = Arrays.stream(arregloEnteros).boxed().collect(Collectors.toList());
	List<Double> listaDecimales = Arrays.stream(arregloDecimales).boxed().collect(Collectors.toList());
	List<Long> listaLong = Arrays.stream(arregloLong).boxed().collect(Collectors.toList());
	
	int[] arregloEnterosDesordenado = {2,4,45,6,8,10,24};
	
	@Test
	@DisplayName("Suma de arreglo de enteros")
	@Order(1)
	void sumarElementosEnteros() {
		assertEquals(30,Util.sumarElementos(arregloEnteros));
	}
	
	@Test
	@DisplayName("Suma de arreglo de decimales")
	@Order(2)
	void sumarElementosDecimales() {
		assertEquals(32.5,Util.sumarElementos(arregloDecimales));
	}
	
	@Test
	@DisplayName("Suma de arreglo de long")
	@Order(3)
	void sumarElementosLong() {
		assertEquals(1209998,Util.sumarElementos(arregloLong));
	}
	
	@Test
	@DisplayName("Suma de arreglo de lista de enteros")
	@Order(4)
	void sumarElementosListaEnteros() {
		assertEquals(30,Util.sumarElementos(Integer.TYPE, listaEnteros));
	}
	
	@Test
	@DisplayName("Suma de arreglo de lista de decimales")
	@Order(5)
	void sumarElementosListaDecimales() {
		assertEquals(32.5,Util.sumarElementos(Double.TYPE, listaDecimales));
	}

	@Test
	@DisplayName("Suma de arreglo de lista de long")
	@Order(6)
	void sumarElementosListaLong() {
		assertEquals(1209998,Util.sumarElementos(Long.TYPE, listaLong));
	}
	
	@Test
	@DisplayName("Obtener los 2 elementos mayores de un arreglo de enteros")
	@Order(7)
	void obtenerLosDosPrimerosElementosMayores() {
		assertArrayEquals(new int[] {45,24}, Util.nElementosMayores(2, arregloEnterosDesordenado));
	}
	
	@Test
	@DisplayName("Obtener los 4 elementos mayores de un arreglo de enteros")
	@Order(8)
	void obtenerLosCuatroPrimerosElementosMayores() {
		assertArrayEquals(new int[] {45,24,10,8}, Util.nElementosMayores(4, arregloEnterosDesordenado));
	}
}
