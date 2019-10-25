package pe.com.cernafukuzaki.java.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@Tag("MedidaTendenciaCentral")
@DisplayName("Pruebas de medidas de tencencia central")
@TestMethodOrder(OrderAnnotation.class)
class MedidaTendenciaCentralTest {

	int[] arregloEnteros = {3,2,0,3,0,3,0,2,0,0,3,1,1,0,1,0,1,0,2,3,0,1,0,4,1,0,2,1,3,1,1,2,1,2,0,2,4,0};
	int[] arregloEnterosElementosPar = {3,3,0,3,0,3,0,2,0,0,3,5};
	int[] arregloEnterosElementosPar2 = {3,2,0,3,0,3,0,2,0,0,3,5};
	int[] arregloEnterosElementosImpar = {3,3,0,3,0,3,0,2,0,0,3,5,5};
	int[] arregloEnterosElementosImpar2 = {3,2,0,3,0,3,0,2,0,0,3,5,5};
	
	MedidaTendenciaCentral medidaTendenciaCentral = MedidaTendenciaCentral.getInstance();
	
	@Test
	@DisplayName("Media aritmética de arreglo")
	@Order(1)
	public void cuandoMediaAritmeticaEsDecimal() {
		int decimales = 2;
		assertEquals(1.32, medidaTendenciaCentral.mediaAritmetica(arregloEnteros, decimales));
	}
	
	@Test
	@DisplayName("Mediana de arreglo con elementos pares")
	@Order(2)
	public void cuandoMediana() {
		assertEquals(1, medidaTendenciaCentral.mediana(arregloEnteros));
	}
	
	@Test
	@DisplayName("Mediana de arreglo con elementos pares es un número decimal")
	@Order(3)
	public void cuandoMedianaEsSumaDeDosElementos() {
		assertEquals(2.5, medidaTendenciaCentral.mediana(arregloEnterosElementosPar));
	}
	
	@Test
	@DisplayName("Mediana de arreglo con elementos pares es igual a número entero")
	@Order(4)
	public void cuandoMedianaElementosSonPares2() {
		assertEquals(2, medidaTendenciaCentral.mediana(arregloEnterosElementosPar2));
	}
	
	@Test
	@DisplayName("Mediana de arreglo con elementos impares es un número entero")
	@Order(5)
	public void cuandoMedianaElementosSonImpares() {
		assertEquals(3, medidaTendenciaCentral.mediana(arregloEnterosElementosImpar));
	}
	
	@Test
	@DisplayName("Mediana de arreglo con elementos impares es un número entero")
	@Order(6)
	public void cuandoMedianaElementosSonImpares2() {
		assertEquals(2, medidaTendenciaCentral.mediana(arregloEnterosElementosImpar2));
	}

}
