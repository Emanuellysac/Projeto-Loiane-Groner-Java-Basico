/* Escreva um m�todo para calcular factorial de um n�mero na classe Calculadora do exerc�cio anterior. */

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
