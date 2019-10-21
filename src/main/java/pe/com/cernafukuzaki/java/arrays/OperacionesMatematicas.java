package pe.com.cernafukuzaki.java.arrays;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

import pe.com.cernafukuzaki.java.util.Util;

public class OperacionesMatematicas {
	
	public int obtenerMaximoComunDivisor(int[] arreglo) {
		int numeroMenor = obtenerNumeroMenor(arreglo);
		boolean esMCD = true;
		boolean finalizo = false;
		while(!finalizo) {
			for(int i=0; i < arreglo.length && esMCD == true; i++) {
				if(arreglo[i]%numeroMenor!=0) {
					esMCD = false;
				} else {
					System.out.println(" arreglo[i]:" + arreglo[i] + "\tnumeroMenor:"+numeroMenor);
				}
			}
			
			if(!esMCD) {
				numeroMenor--;
				esMCD = true;//reset variable
			} else {
				finalizo = true;
			}
		}
		System.out.println(" Máximo común divisor:" + numeroMenor);
		return numeroMenor;
	}

	public int obtenerMinimoComunMultiplo(int[] arreglo) {
		int numeroMayor = obtenerNumeroMayor(arreglo);
		boolean finalizo = false;
		int mcm = 0;
		int multiplicador = 0;
		int contador = 0;//Aumenta si el número en común es divisible entre todos los elementos del arreglo
		while(!finalizo) {
			contador = 0;//reset
			multiplicador++;
			mcm = numeroMayor * multiplicador;//reset
			for(int i=0; i < arreglo.length; i++) {
				if(mcm%arreglo[i]==0) {
					contador++;
					System.out.println(" mcm:" + mcm + " \tarreglo[" + i + "]:" + arreglo[i] + " \tmultiplicador:" + multiplicador + " \tcontador:" + contador);
				}
			}
			if(contador == arreglo.length) {
				finalizo = true;
			}
		}
		System.out.println(" Mínimo Común Múltiplo:" + mcm);
		return mcm;
	}
	
	private int obtenerNumeroMenor(int[] arreglo) {
		int menor = arreglo[0];
		for(int i=0; i< arreglo.length; i++) {
			if(arreglo[i] < menor) {
				menor = arreglo[i];
			}
		}
		return menor;
	}
	
	private int obtenerNumeroMayor(int[] arreglo) {
		int mayor = arreglo[0];
		for(int i=0; i< arreglo.length; i++) {
			if(arreglo[i] > mayor) {
				mayor = arreglo[i];
			}
		}
		return mayor;
	}
	
	/**
	 * Factorial de un número entero.
	 * <p>Retorna factorial de un número entero.</p>
	 * 
	 * @author Francisco Cerna Fukuzaki
	 * @param numero Número entero.
	 * @return Factorial.
	 */
	public long factorial(int numero) {
		return LongStream.rangeClosed(1, numero).reduce(1, (long x, long y) -> x * y);
	}
	
	/**
	 * Media aritmética
	 * <p>Retorna promedio de un arreglo de números enteros.</p>
	 * 
	 * @author Francisco Cerna Fukuzaki
	 * @param numeros Números enteros.
	 * @return Promedio.
	 */
	public double mediaAritmetica(int[] numeros, int decimales) {
		return Util.redondear(Arrays.stream(numeros).mapToLong((x) -> (Integer) x).summaryStatistics().getAverage(), decimales);
	}

}
