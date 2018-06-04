package br.com.aula36.exercicios02.Importante;

public class Professor {

	private String nome;
	private String departamento;
	private String email;

	Professor() {

	}

	public Professor(String nomeProfessor, String departamento, String email) {
		super();
		this.nome = nomeProfessor;
		this.departamento = departamento;
		this.email = email;
	}

	public String getNomeProfessor() {
		return nome;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nome = nomeProfessor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String obterInfo() {
		return "Professor = " + nome + "; " + "\n";
	}

}
