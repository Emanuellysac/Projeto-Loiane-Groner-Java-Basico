/* Escreva uma classe chamada Contador, que tem um atributo est�tico que � incrementado sempre que a classe for instanciada.
Crie m�todos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar essa classe. */

package br.com.aula34.exercicios;

public class Contador {
	
	private static int cont;
	
	/*
	Contador(){
		cont++;
	} */
	
	public static void zerarContador() {
		cont = 0;
	}
	
	public static void incrementarContador() {
		cont ++;
	}
	
	public static int retornarContador() {
		return cont;
	}
}
