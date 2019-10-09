package pe.com.cernafukuzaki.java.mockito.webservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;//JUnit 4
import org.mockito.junit.jupiter.MockitoExtension;

//@RunWith(MockitoJUnitRunner.class)//JUnit 4
@ExtendWith(MockitoExtension.class)//JUnit 5
class WebServiceComprarLibroServiceTest {

	/* Inicio Prueba utilizando dependencia de inyección */
	@InjectMocks
	public WebServiceComprarLibroService service;
	
	@Mock
	public WebServiceComprarLibroPort port;
	
	@Test
	void cuando_es_satisfactoria() {
		service = new WebServiceComprarLibroService(port);
		Mockito.when(port.comprarLibro(Mockito.any()))
			.thenReturn(new WebServiceComprarLibroResponse(WebServiceComprarLibroResponse.WebServiceComprarLibroResponseMensaje.OK));
		boolean resultado = service.comprarLibro(new Libro("Harry Potter 1"));
		assertTrue(resultado);
	}
	
	@Test
	void cuando_no_es_satisfactoria() {
		service = new WebServiceComprarLibroService(port);
		Mockito.when(port.comprarLibro(Mockito.any()))
			.thenReturn(new WebServiceComprarLibroResponse(WebServiceComprarLibroResponse.WebServiceComprarLibroResponseMensaje.ERROR));
		boolean resultado = service.comprarLibro(new Libro("Harry Potter 1"));
		assertFalse(resultado);
	}
	/* Fin Prueba utilizando dependencia de inyección */
	
	/* Inicio Prueba instanciando clases */
	/*
	@Test
	void cuando_es_satisfactoria() {
		WebServiceComprarLibro port = Mockito.mock(WebServiceComprarLibro.class);
		Mockito.when(port.comprarLibro(Mockito.any()))
			.thenReturn(new WebServiceComprarLibroResponse(WebServiceComprarLibroResponse.WebServiceComprarLibroResponseMensaje.OK));
		WebServiceComprarLibroService service = new WebServiceComprarLibroService(port);
		boolean resultado = service.comprarLibro(new Libro("Harry Potter 1"));
		assertTrue(resultado);
	}
	
	@Test
	void cuando_no_es_satisfactoria() {
		WebServiceComprarLibro port = Mockito.mock(WebServiceComprarLibro.class);
		Mockito.when(port.comprarLibro(Mockito.any()))
			.thenReturn(new WebServiceComprarLibroResponse(WebServiceComprarLibroResponse.WebServiceComprarLibroResponseMensaje.ERROR));
		WebServiceComprarLibroService service = new WebServiceComprarLibroService(port);
		boolean resultado = service.comprarLibro(new Libro("Harry Potter 1"));
		assertFalse(resultado);
	}
	*/
	/* Inicio Prueba instanciando clases */

}
