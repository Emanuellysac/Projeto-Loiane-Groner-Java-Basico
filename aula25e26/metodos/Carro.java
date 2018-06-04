package br.com.aula25e26.metodos;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//M�todo sem retorno
	void exibirAutonomia(){
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km"); 	
	}
	
	//M�todo com retorno
	double obterAutonomia1(){
		double autonomia = capCombustivel * consumoCombustivel;
		return autonomia;	
	}
	
	//M�todo com retorno
		double obterAutonomia2(){
			return capCombustivel * consumoCombustivel; 	
		}

	//M�todo com par�metro
	double calcularCombustivel(double Km){
		double qtdCombustivel = Km/consumoCombustivel;
		return qtdCombustivel;
	}
		
}
