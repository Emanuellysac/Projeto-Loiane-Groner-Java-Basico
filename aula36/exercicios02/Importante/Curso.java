/* Escreva uma classe para representar um Curso, que tem nome e hor�rio. Cada curso tem um Professor, que possui nome, departamento e email.
Cada Curso tamb�m pode ter v�rios alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas.
Escreva um programa teste que crie um Curso com 5 alunos, e que pe�a para o usu�rio entrar com as 4 notas de cada aluno.
Ao final, imprima a m�dia de cada aluno, se o mesmo est� aprovado (media maior ou igual a 7), e qual � a m�dia da turma. */

package br.com.aula36.exercicios02.Importante;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos; // Objeto de outa classe.

	Curso() {

	}

	public Curso(String nomeCurso, String horario, Professor professor, Aluno[] alunos) {
		super();
		this.nome = nomeCurso;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "Nome do Curso = " + nome + "\n";

		if (professor != null) {
			info += professor.obterInfo();
		}

		if (alunos != null) {
			System.out.println("---Alunos---");
			for (Aluno aluno : alunos) {
				if (aluno != null) {
					info += aluno.obterInfo();
					info += "\n";
				}
			}

			info += "\nM�dia da turma = " + obterMediaTurma();
		}

		return info;
	}

	public double obterMediaTurma() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma / alunos.length;
	}
}