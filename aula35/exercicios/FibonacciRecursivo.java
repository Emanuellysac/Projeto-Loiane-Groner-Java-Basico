/*Escreva um metodo recursivo e estatico que calcule e retorne o N-­‐esimo termo da sequencia Fibonacci. Alguns numeros desta sequencia
sao: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...*/

package br.com.aula35.exercicios;

public class FibonacciRecursivo {
	
	public static int fibonacci(int num) {
		
		if (num < 2) {
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
		
	}
	
}


