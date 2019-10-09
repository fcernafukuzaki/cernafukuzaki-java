package pe.com.cernafukuzaki.java.poo.abstractclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@DisplayName("Pruebas de clase abstracta")
@TestMethodOrder(OrderAnnotation.class)
class ImpresoraEpsonTest {

	@Test
	@DisplayName("Imprimiendo texto en impresora Epson")
	@Order(1)
	void imprimirTextoEnImpresoraEpson() {
		Impresora epson = new ImpresoraEpson();
		assertTrue(epson.imprimir("Hoja de prueba."));
	}
	
	@Test
	@DisplayName("Imprimiendo texto vacío en impresora Epson")
	@Order(2)
	void imprimirTextoVacioEnImpresoraEpson() {
		Impresora epson = new ImpresoraEpson();
		assertFalse(epson.imprimir(""));
	}
	
	@Test
	@DisplayName("Imprimiendo texto con espacio en blanco en impresora Epson")
	@Order(3)
	void imprimirEspaciosEnBlancoEnImpresoraEpson() {
		Impresora epson = new ImpresoraEpson();
		assertFalse(epson.imprimir("    "));
	}
	
	@Test
	@DisplayName("Imprimiendo objeto nulo en impresora Epson")
	@Order(4)
	void imprimirTextoNuloEnImpresoraEpson() {
		Impresora epson = new ImpresoraEpson();
		assertFalse(epson.imprimir(null));
	}

}
