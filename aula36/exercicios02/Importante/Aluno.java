package br.com.aula36.exercicios02.Importante;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;

	Aluno() {

	}

	public Aluno(String nomeAluno, String matricula, double[] notas) {
		super();
		this.nome = nomeAluno;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNomeAluno() {
		return nome;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nome = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String obterInfo() {

		String info = "Nome Aluno = " + nome + "; ";
		info += "Matrícula = " + matricula + "; ";
		info += "Notas: ";

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		double media = soma / 4;
		info += "\n" + "Média = " + media + " - ";
		if (media >= 7) {
			info += "Aprovado";
		} else {
			info += "Reprovado";
		}

		return info;
	}

	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / 4;

	}

}
