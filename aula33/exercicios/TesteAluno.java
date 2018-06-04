package br.com.aula33.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.setNome(scan.next());
		System.out.println("Entre com o nome do curso: ");
		aluno.setCurso(scan.next());
		System.out.println("Entre com a matricula: ");
		aluno.setMatricula(scan.next());

		// aluno.disciplinas = new String[3];
		// aluno.notas = new double [3][4];
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina: " + (i + 1));
			aluno.setNomeDisciplinaPos(i, scan.next());
		}

		for (int i = 0; i < aluno.getNotas().length; i++) {// linha
			System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {// coluna
				System.out.println("Entre com a nota " + (j + 1));
				aluno.setNotaPosIJ(i, j, scan.nextDouble());
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {// (i) refere-se ao indice da disciplina
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi reprovado");

			}
		}
	}
}
