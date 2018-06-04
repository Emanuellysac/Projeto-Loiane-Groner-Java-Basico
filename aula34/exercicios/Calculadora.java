/*Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois números),
elevar à potência n. Desenvolva um programa para testar essa classe. */

package br.com.aula34.exercicios;

public class Calculadora {
	
	private static double resultado;
	
	public static double somar1(double num1, double num2) {
		return resultado = num1 + num2;
	}
	
	public static double subtrair1(double num1, double num2) {
		return resultado = num1 - num2;
	}
	
	public static double dividir1(double num1, double num2) {
		return resultado = num1 / num2;
	}
	
	public static double multiplicar1(double num1, double num2) {
		return resultado = num1 * num2;
	}
	
	public static int potencia1(int base, int expoente) {
		int total = 1;
		for (int i=1; i<=expoente; i++) {
		     total = total * base;
    	}
		
  		return total;		
	} 
}
