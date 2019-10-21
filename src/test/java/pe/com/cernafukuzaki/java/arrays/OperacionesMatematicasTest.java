package pe.com.cernafukuzaki.java.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;

@Tag("OperacionesMatematicasTest")
@DisplayName("Pruebas de operaciones matem�ticas")
@TestMethodOrder(OrderAnnotation.class)
public class OperacionesMatematicasTest {

	int[] arregloEnteros = {2,4,6,8,10};
	int[] arregloEnterosMCD = {18,24};//M�ximo Com�n Divisor
	int[] arregloEnterosMCM = {20,38,11,15};//M�nimo Com�n M�ltiplo
	
	OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
	
	@Test
	@DisplayName("M�ximo Com�n Divisor")
	@Order(1)
	public void obtenerMaximoComunDivisor() {
		assertEquals(2, operacionesMatematicas.obtenerMaximoComunDivisor(arregloEnteros));
	}
	
	@Test
	@DisplayName("M�nimo Com�n M�ltiplo")
	@Order(2)
	public void obtenerMinimoComunMultiplo() {
		assertEquals(12540, operacionesMatematicas.obtenerMinimoComunMultiplo(arregloEnterosMCM));
	}
	
	@Test
	@DisplayName("Factorial de 3 es 6")
	@Order(3)
	public void cuandoFactorial3() {
		assertEquals(6, operacionesMatematicas.factorial(3));
	}
	
	@Test
	@DisplayName("Factorial de 13 es 6227020800")
	@Order(4)
	public void cuandoFactorial13() {
		assertEquals(new Long("6227020800"), operacionesMatematicas.factorial(13));
	}
	
	@Test
	@DisplayName("Media aritm�tica de arreglo de 3,7,9")
	@Order(5)
	public void cuandoArregloTieneElementosImpar() {
		int[] arreglo = {3,7,9};
		int decimales = 4;
		assertEquals(6.3333, operacionesMatematicas.mediaAritmetica(arreglo, decimales));
	}
	
	@Test
	@DisplayName("Media aritm�tica de arreglo de 53,87,19,102")
	@Order(6)
	public void cuandoArregloTieneElementosPar() {
		int[] arreglo = {53,87,19,102};
		int decimales = 4;
		assertEquals(65.25, operacionesMatematicas.mediaAritmetica(arreglo, decimales));
	}
	
}
