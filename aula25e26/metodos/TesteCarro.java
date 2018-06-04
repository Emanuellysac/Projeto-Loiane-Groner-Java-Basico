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
		
		//Para imprimir m�todos sem retorno:
		van.exibirAutonomia();
		
		//Para imprimir m�todos com retorno:
		System.out.println("1� A autonomia do carro �: " + van.obterAutonomia1());
		
		//Para imprimir m�todos com retorno:
		double autonomia = van.obterAutonomia2();
		System.out.println("2� A autonomia do carro �: " + autonomia);
		
		//M�todo com par�metro:
		System.out.println("Qtd de combust�vel para andar 10Km: " + van.calcularCombustivel(10));
		
	}

}
