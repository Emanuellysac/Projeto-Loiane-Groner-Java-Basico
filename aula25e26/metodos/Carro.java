package br.com.aula25e26.metodos;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//Método sem retorno
	void exibirAutonomia(){
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km"); 	
	}
	
	//Método com retorno
	double obterAutonomia1(){
		double autonomia = capCombustivel * consumoCombustivel;
		return autonomia;	
	}
	
	//Método com retorno
		double obterAutonomia2(){
			return capCombustivel * consumoCombustivel; 	
		}

	//Método com parâmetro
	double calcularCombustivel(double Km){
		double qtdCombustivel = Km/consumoCombustivel;
		return qtdCombustivel;
	}
		
}
