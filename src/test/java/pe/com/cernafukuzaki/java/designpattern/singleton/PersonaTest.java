package pe.com.cernafukuzaki.java.designpattern.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pruebas de clase persona")
class PersonaTest {

	@Test
	@DisplayName("Todas las personas son iguales")
	void personaHombreIgualAMujer() {
		Persona hombre = Persona.getInstance();
		Persona mujer = Persona.getInstance();
		assertEquals(hombre, mujer);
	}

}
