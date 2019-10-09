package pe.com.cernafukuzaki.java.mockito.ejemplo;

public class Jugador {

	private int numeroMinimoParaGanar;
	private Dado dado; 
	
	public Jugador(Dado dado, int numeroMinimoParaGanar) {
		this.numeroMinimoParaGanar = numeroMinimoParaGanar;
		this.dado = dado;
	}
	
	public boolean jugar() {
		int numeroDado = dado.rodar();
		return numeroDado >= numeroMinimoParaGanar;
	}
}
