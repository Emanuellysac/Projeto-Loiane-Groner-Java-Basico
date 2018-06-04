package br.com.aula34.variaveisEMetodosEstaticos;

public class TesteMinhaCalculadora {

	public static void main(String[] args) {

		/*
		 * 
		 * MinhaCalculadora calc = new MinhaCalculadora();
		 * 
		 * System.out.println(calc.soma(1, 2));
		 * 
		 * System.out.println(calc.soma(1.0, 2.0));
		 * 
		 * System.out.println(calc.soma(1, 2, 3));
		 */

		MinhaCalculadora.operacao = "somar"; //N�o precisa instanciar o objeto quando o m�todo � STATIC.
		
		System.out.println(MinhaCalculadora.soma(1, 2)); //N�o precisa instanciar a classe quando o m�todo � STATIC.
		
		//Para ambos os casos s� precisa inicializar com o nome da classe. logo ser� apresentado os atributos e m�todos STATIC da classe.

	}

}
