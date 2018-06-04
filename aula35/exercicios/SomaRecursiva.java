/*Escreva um m�todo recursivo e est�tico que receba um n�mero inteiro positivo "N" e calcule o somat�rio dos n�meros de 1 a N. */

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
