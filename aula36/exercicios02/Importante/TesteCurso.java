package br.com.aula36.exercicios02.Importante;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Curso//
		System.out.println("Entre com o nome do curso: ");
		String nome = scan.nextLine();

		System.out.println("Entre com o hor�rio do curso: ");
		String horario = scan.nextLine();

		// Professor//
		System.out.println("Entre com o nome do professor: ");
		String nomeProf = scan.nextLine();

		System.out.println("Entre com o email do professor: ");
		String emailProf = scan.nextLine();

		System.out.println("Entre com o departamento do professor: ");
		String depProf = scan.nextLine();

		Curso curso = new Curso(); // 1-Cria��o do objeto Curso;
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor(); // 2-Cria��o do objeto Professor;
		professor.setNomeProfessor(nomeProf);
		professor.setEmail(emailProf);
		professor.setDepartamento(depProf);

		// Curso tem um professor//
		curso.setProfessor(professor); // 3-Vincular o Curso ao Professor;

		System.out.println("---Alunos---");

		// Alunos//

		Aluno[] alunos = new Aluno[5]; // 4-Cria��o do Array para guardar os 5 alunos instanciados;

		for (int i = 0; i < 5; i++) {// 5-Para cada "for" ser� gerado um objeto Aluno com as informa��es de nome,
										// matricula e notas;

			scan.nextLine();

			System.out.println("Informe o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();

			System.out.println("Informe a matr�cula:");
			String matAluno = scan.nextLine();

			double[] notas = new double[4]; // 6-Cria��o do Array para guardar as notas do aluno;

			for (int j = 0; j < 4; j++) {// 7-Para cada "for" ser� guardado uma nota no indice do Array notas;
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();// 8-Cria��o do objeto Aluno que ser� inserido em cada �ndice do Array "alunos";
			aluno.setNomeAluno(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno; // 9-Inserir cada aluno criado em cada �ndice do Array "alunos";

		}

		// Curso tem mais de um Aluno//
		curso.setAlunos(alunos);// 10-Vincular o Array "alunos" ao Curso;

		System.out.println(curso.obterInfo());

	}
}
