package br.com.aula44.interfaces;

public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom();//Um método abstrato pode, somente, ser definido dentro de uma classe abstrata.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
