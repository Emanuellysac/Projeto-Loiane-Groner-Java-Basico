package br.com.aula35.recursividade;

public class FatorialRecursivo {

	/*
	 * public static int fatorial(int num) {
	 * 
	 * int resultado = 1; 
	 * 	for(int i=num; i>1; i--) { 
	 *	 resultado = resultado * i; }
	 * 
	 * return resultado;
	 * 
	 * }
	 */

	public static int fatorialRecursivo(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorialRecursivo(num - 1);

	}
}
