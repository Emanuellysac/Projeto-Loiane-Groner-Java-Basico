package br.com.aula42.palavraFinal;

public class Aluno {
	
	private String curso;
	private String[] notas;
	
	public Aluno() {
		super(); 
	}

	public Aluno(String curso, String[] notas) {
		this.curso = curso;
		this.notas = notas;
		
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
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
	
}
