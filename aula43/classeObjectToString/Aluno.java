package br.com.aula43.classeObjectToString;

import java.util.Arrays;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super(); 
	}

	public Aluno(String curso, double[] notas) {
		this.curso = curso;
		this.notas = notas;
		
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		
		return s; 
	}

	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo endereço do Aluno...");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
	/*
	public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s += nota + " ";	
		}
		
		return s;
	} */
	
	@Override //Implementado pelo Eclipse;
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override //Implementado pelo Eclipse para comparação entre dois objetos.
	public boolean equals(Object obj) { 
		if (this == obj) //Compara se é a mesma referência;
			return true;
		if (obj == null) //Se p objeto existe;
			return false;
		if (getClass() != obj.getClass()) //Compara o tipo da classe;
			return false;
		Aluno other = (Aluno) obj; //Faz o casting;
		if (curso == null) { //Compara o curso;
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas)) //Compara as notas;
			return false;
		return true;
	}
	
}
