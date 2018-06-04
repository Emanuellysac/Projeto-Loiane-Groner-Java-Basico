/*Escreva uma class para representar um Aluno. Adicione atributos relacionados �s caracteristicas de um Aluno, como nome, matricula,
curso que est� matriculado, nome de 3 disciplinas que est� cursando e as notas dessas 3 disciplinas. Desenvolva um m�todo para verificar
se o aluno est� aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede
as informa��es do aluno ao usu�rio e ao final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou n�o. */

package br.com.aula25a27.exercicios;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notas = new double [3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		
		for (int i=0; i<notas.length; i++) {//linha
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j=0; j<notas[i].length; j++) {//coluna
				System.out.println(notas[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarAprovado(int indice) {//Indice das disciplinas
		
		if (obterMedia (indice) >=7) {
			return true;
			//Tudo o que vem ap�s o retorno n�o � executado.
			}/*else {
			 //return false;
		    }*/
			return false;
		}
	
	double obterMedia (int indice) {
				
		double soma  = 0;
		
		for (int i=0; i<notas[indice].length; i++) {
			soma += notas[indice][i];//[indice] das disciplinas, [i] notas contidas nos indices de cada disciplina
		}
			double media = soma/4;
		
			return media;
	}
}



