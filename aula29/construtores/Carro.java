package br.com.aula29.construtores;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		numPassageiros = 4;
	}
	
	Carro(String marca_){
		marca = marca_;
		
	}
}
