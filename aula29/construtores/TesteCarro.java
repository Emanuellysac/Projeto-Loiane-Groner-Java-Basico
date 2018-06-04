package br.com.aula29.construtores;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat");
		System.out.println(van.marca);
		
		Carro van2 = new Carro();
		System.out.println( van2.numPassageiros);
	
	}

}
