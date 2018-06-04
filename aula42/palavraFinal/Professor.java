package br.com.aula42.palavraFinal;

public class Professor {
	
	private Double salario;
	private String nomeCurso;
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public final String obterEtiquetaEndereco() {
		
		String s = "Endereço do Professor: ";
		
		return s;
		
	}
	
	public final void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo endereço do Professor...");
		System.out.println(this.obterEtiquetaEndereco());
		
	} 

}
