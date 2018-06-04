package br.com.aula37e38.herancaESuper;

public class Teste {

	public static void main(String[] args) {

		/* Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		
		professor.setTelefoneCelular("999999999");
		System.out.println(professor.getTelefoneCelular()); */
		
		Pessoa aluno = new Aluno(); //Instancia a classe Aluno do tipo Pessoa, ou seja, tornando visível apenas os atributos da classe Pessoa para o novo Aluno.
		Aluno aluno1 = new Aluno(); //Instancia a classe Aluno do tipo Aluno, ou seja, tornando visível os atributos de ambas as classe, Aluno e Pessoa, caso haja HERANÇA, para o novo Aluno. 

	}

}
