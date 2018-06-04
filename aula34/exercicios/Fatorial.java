/* Escreva um método para calcular factorial de um número na classe Calculadora do exercício anterior. */

package br.com.aula34.exercicios;

public class Fatorial {
	
	public static int fatorial(int num) {
		
		int resultado = 1;
		for(int i=num; i>1; i--) {
			resultado = resultado * i;
		}
		
		return resultado;
		
	}

}
