/*Escreva um método recursivo e estático que receba um número inteiro positivo "N" e calcule o somatório dos números de 1 a N. */

package br.com.aula35.exercicios;

public class SomaRecursiva {
	
	//Com recursividade
	public static int soma(int x) {
		
		if(x == 0) {
			return 0;
		}
			System.out.println(x);
			return x + soma(x-1);		
	}
	
	//Sem recursividade
	public static int somatorio(int x) {
		
		int adicao = 0;
		for(int i=x; i>0; i--) {
			adicao += i;
			System.out.println(i);
		}
		
		return adicao;
	}	
}
