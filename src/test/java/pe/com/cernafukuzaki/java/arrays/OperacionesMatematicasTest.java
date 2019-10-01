package pe.com.cernafukuzaki.java.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;

@Tag("OperacionesMatematicasTest")
@DisplayName("Pruebas de operaciones matemáticas")
@TestMethodOrder(OrderAnnotation.class)
public class OperacionesMatematicasTest {

	int[] arregloEnteros = {2,4,6,8,10};
	int[] arregloEnterosMCD = {18,24};//Máximo Común Divisor
	int[] arregloEnterosMCM = {20,38,11,15};//Mínimo Común Múltiplo
	
	OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
	
	@Test
	@DisplayName("Máximo Común Divisor")
	@Order(1)
	public void obtenerMaximoComunDivisor() {
		assertEquals(2, operacionesMatematicas.obtenerMaximoComunDivisor(arregloEnteros));
	}
	
	@Test
	@DisplayName("Mínimo Común Múltiplo")
	@Order(2)
	public void obtenerMinimoComunMultiplo() {
		assertEquals(12540, operacionesMatematicas.obtenerMinimoComunMultiplo(arregloEnterosMCM));
	}

}
