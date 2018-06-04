//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.

package br.com.aula25a27.exercicios;

public class Lampada {
		
		public String modelo;
		public String tensao;
		public int potencia;
		public String cor;
		public String tipoLuz;
		public int garantiaMeses;
		public String[]tipos;
		public boolean tipoAbajur;
		
		boolean ligada;
		
		void ligar(){
			ligada = true;
		}
		
		void desligar(){
			ligada = false;
		}
		
		void mostrarEstado() {
			if (ligada == true) {
				System.out.println("A lâmpada está ligada.");
			}else {
				System.out.println("A lâmpada está desligada.");
			}
		}
		
		void mudarEstado(){
			if(ligada){
				desligar();
					System.out.println("Desligada.");
			}else {
				ligar();
					System.out.println("Ligada.");
			}
		}
			
}
