package br.com.aula24.classesEAtributos;

public class ClasseTesteLivroLivraria {

	public static void main(String[] args) {

		LivroLivraria livro = new LivroLivraria();

		livro.nome = "O pequeno princ�pe";
		livro.autor = "N�o sei";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;

		System.out.println("Pre�o= " + livro.preco);

	}

}
