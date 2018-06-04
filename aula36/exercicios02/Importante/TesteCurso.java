package br.com.aula36.exercicios02.Importante;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Curso//
		System.out.println("Entre com o nome do curso: ");
		String nome = scan.nextLine();

		System.out.println("Entre com o horário do curso: ");
		String horario = scan.nextLine();

		// Professor//
		System.out.println("Entre com o nome do professor: ");
		String nomeProf = scan.nextLine();

		System.out.println("Entre com o email do professor: ");
		String emailProf = scan.nextLine();

		System.out.println("Entre com o departamento do professor: ");
		String depProf = scan.nextLine();

		Curso curso = new Curso(); // 1-Criação do objeto Curso;
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor(); // 2-Criação do objeto Professor;
		professor.setNomeProfessor(nomeProf);
		professor.setEmail(emailProf);
		professor.setDepartamento(depProf);

		// Curso tem um professor//
		curso.setProfessor(professor); // 3-Vincular o Curso ao Professor;

		System.out.println("---Alunos---");

		// Alunos//

		Aluno[] alunos = new Aluno[5]; // 4-Criação do Array para guardar os 5 alunos instanciados;

		for (int i = 0; i < 5; i++) {// 5-Para cada "for" será gerado um objeto Aluno com as informações de nome,
										// matricula e notas;

			scan.nextLine();

			System.out.println("Informe o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();

			System.out.println("Informe a matrícula:");
			String matAluno = scan.nextLine();

			double[] notas = new double[4]; // 6-Criação do Array para guardar as notas do aluno;

			for (int j = 0; j < 4; j++) {// 7-Para cada "for" será guardado uma nota no indice do Array notas;
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();// 8-Criação do objeto Aluno que será inserido em cada índice do Array "alunos";
			aluno.setNomeAluno(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno; // 9-Inserir cada aluno criado em cada índice do Array "alunos";

		}

		// Curso tem mais de um Aluno//
		curso.setAlunos(alunos);// 10-Vincular o Array "alunos" ao Curso;

		System.out.println(curso.obterInfo());

	}
}
