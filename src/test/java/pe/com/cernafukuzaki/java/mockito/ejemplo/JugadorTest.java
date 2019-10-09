package pe.com.cernafukuzaki.java.mockito.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.mockito.Mockito;


@TestMethodOrder(OrderAnnotation.class)
class JugadorTest {

	@Test
	@Order(1)
	void gana_cuando_numero_es_igual() {
		Dado dado = Mockito.mock(Dado.class);
		Mockito.when(dado.rodar()).thenReturn(3);
		Jugador jugador = new Jugador(dado, 3);
		assertEquals(true, jugador.jugar());
	}
	
	@Test
	@Order(2)
	void gana_cuando_numero_es_mayor() {
		Dado dado = Mockito.mock(Dado.class);
		Mockito.when(dado.rodar()).thenReturn(6);
		Jugador jugador = new Jugador(dado, 3);
		assertEquals(true, jugador.jugar());
	}
	
	@Test
	@Order(3)
	void pierde_cuando_numero_es_menor() {
		Dado dado = Mockito.mock(Dado.class);
		Mockito.when(dado.rodar()).thenReturn(1);
		Jugador jugador = new Jugador(dado, 3);
		assertEquals(false, jugador.jugar());
	}

}
