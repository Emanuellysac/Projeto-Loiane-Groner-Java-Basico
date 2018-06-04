package br.com.aula41.classeAbstrata;

public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa(); //Classes do tipo Abstract não podem gerar objeto.
		//pessoa.setEndereco("Rua 1, num 1");
		
		Pessoa aluno = new Aluno();
		aluno.setEndereco("Rua 2, num 2");
		aluno.imprimirEtiquetaEndereco();
		
		Pessoa professor = new Professor();
		professor.setEndereco("Rua 3, num 3");
		professor.imprimirEtiquetaEndereco();
		
	}

}
