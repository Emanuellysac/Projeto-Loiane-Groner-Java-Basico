package br.com.aula24.classesEAtributos;

import java.text.DateFormat;
import java.util.Date;

public class ClasseTesteLivroDeBiblioteca {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "O pequeno princípe";
		livro.autor = "Não sei";
		livro.anoLancamento = 2015;
		
		
		livro.emprestado = true;
		livro.dataEntrega = new Date(); //Informa a data atual.
		livro.emprestadoA = "Emanuelly";

		System.out.println(livro.dataEntrega);	

	}

}
