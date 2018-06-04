package br.com.aula42.palavraFinal;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//exemplo 02
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "wwwwwww"; //Quando o atributo possui a palavra final ele não pode ser alterado.
		System.out.println(Constantes.CURSO_COMPLETO);
		Constantes.CURSO_COMPLETO = "wwwwwww"; //Quando não existe a palavra final é possível alterar.
		System.out.println(Constantes.CURSO_COMPLETO);
	}

}
