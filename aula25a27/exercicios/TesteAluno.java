package br.com.aula25a27.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno: ");
		aluno.nome = scan.next();
		System.out.println("Entre com o nome do curso: ");
		aluno.curso = scan.next();
		System.out.println("Entre com a matricula: ");
		aluno.matricula = scan.next();

		// aluno.disciplinas = new String[3];
		// aluno.notas = new double [3][4];
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Entre com nome da disciplina: " + (i + 1));
			aluno.disciplinas[i] = scan.next();
		}

		for (int i = 0; i < aluno.notas.length; i++) {// linha
			System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notas[i].length; j++) {// coluna
				System.out.println("Entre com a nota " + (j + 1));
				aluno.notas[i][j] = scan.nextDouble();
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {// (i) refere-se ao indice da disciplina
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi reprovado");

			}
		}
	}
}
