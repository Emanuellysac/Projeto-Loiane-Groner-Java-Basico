package br.com.aula30this;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public Carro() {}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		System.out.println("Construtor com 2 parâmetros");
	}

	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km"); 	
	}
	
	double obterAutonomia1(){
		
		System.out.println("Método obterAutonomia foi chamado. ");
		
		return this.capCombustivel * this.consumoCombustivel;
		
	}

	double calcularCombustivel(double Km){
		
		double qtdCombustivel = Km/this.consumoCombustivel;
		
		return qtdCombustivel;
	}	
}
