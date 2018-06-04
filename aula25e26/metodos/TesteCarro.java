package br.com.aula25e26.metodos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//Para imprimir métodos sem retorno:
		van.exibirAutonomia();
		
		//Para imprimir métodos com retorno:
		System.out.println("1º A autonomia do carro é: " + van.obterAutonomia1());
		
		//Para imprimir métodos com retorno:
		double autonomia = van.obterAutonomia2();
		System.out.println("2º A autonomia do carro é: " + autonomia);
		
		//Método com parâmetro:
		System.out.println("Qtd de combustível para andar 10Km: " + van.calcularCombustivel(10));
		
	}

}
