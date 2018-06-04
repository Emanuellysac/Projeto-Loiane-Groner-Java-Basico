package br.com.aula41.classeAbstrata;

public abstract class Pessoa { //Essa classe (Abstract) não pode ser instanciada, ou seja, não se pode gerar objeto para ela.
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	public Pessoa() {
		super();	
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() { //Uma classe Abstrata pode ter métodos abstratos e não abstratos.
		return this.endereco;
	}
	
	public abstract void imprimirEtiquetaEndereco(); //Um método abstract pode, somente, ser declarado em ma classe abstract.
													 //Métodos abstract possuem apenas assinatura, ou seja, não possuem comportamento.
	
	public final void verificarEndereco() { //Um método Final não pode ser sobrescrito, ou seja, as classes filhas (subclasses), obrigatoriamente, não hedarão ele.
		
	}
	
}
