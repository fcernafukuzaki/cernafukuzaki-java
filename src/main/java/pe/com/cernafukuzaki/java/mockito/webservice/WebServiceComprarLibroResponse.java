package pe.com.cernafukuzaki.java.mockito.webservice;

public class WebServiceComprarLibroResponse {

	enum WebServiceComprarLibroResponseMensaje {
		OK, ERROR
	}
	
	private WebServiceComprarLibroResponseMensaje mensaje;

	public WebServiceComprarLibroResponse(WebServiceComprarLibroResponseMensaje mensaje) {
		this.mensaje = mensaje;
	}

	public WebServiceComprarLibroResponseMensaje getMensaje() {
		return mensaje;
	}

}
