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

}
