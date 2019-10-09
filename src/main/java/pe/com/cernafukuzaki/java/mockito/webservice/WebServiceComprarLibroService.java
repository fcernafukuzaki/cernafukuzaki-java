package pe.com.cernafukuzaki.java.mockito.webservice;

import static pe.com.cernafukuzaki.java.mockito.webservice.WebServiceComprarLibroResponse.WebServiceComprarLibroResponseMensaje.OK;

public class WebServiceComprarLibroService {

	private WebServiceComprarLibroPort webServiceComprarLibro;
	
	public WebServiceComprarLibroService(WebServiceComprarLibroPort webServiceComprarLibro) {
		this.webServiceComprarLibro = webServiceComprarLibro;
	}
	
	public boolean comprarLibro(Libro libro) {
		WebServiceComprarLibroResponse response = webServiceComprarLibro.comprarLibro(new WebServiceComprarLibroRequest(libro));
		return response.getMensaje() == OK;
	}
}
