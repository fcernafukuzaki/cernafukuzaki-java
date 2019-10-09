package pe.com.cernafukuzaki.java.poo.abstractclass;

public class ImpresoraEpson extends Impresora {

	@Override
	public boolean imprimir(String texto) {
		if(texto == null || texto.isEmpty() || texto.trim().length() == 0) {
			return false;
		} else {
			System.out.println("Imprimiendo... " + texto);
			return true;
		}
	}
	
}
