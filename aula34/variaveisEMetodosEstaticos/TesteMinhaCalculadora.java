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

		MinhaCalculadora.operacao = "somar"; //Não precisa instanciar o objeto quando o método é STATIC.
		
		System.out.println(MinhaCalculadora.soma(1, 2)); //Não precisa instanciar a classe quando o método é STATIC.
		
		//Para ambos os casos só precisa inicializar com o nome da classe. logo será apresentado os atributos e métodos STATIC da classe.

	}

}
