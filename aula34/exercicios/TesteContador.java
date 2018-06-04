package br.com.aula34.exercicios;

public class TesteContador {

	public static void main(String[] args) {
		
		System.out.println(Contador.retornarContador());
		Contador.incrementarContador();
		Contador.incrementarContador();
		Contador.incrementarContador();
		System.out.println(Contador.retornarContador());
		Contador.zerarContador();
		System.out.println(Contador.retornarContador());
		
		
		/*Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		System.out.println(Contador.retornarContador()); */
		
		
		
		
		
	}

}
