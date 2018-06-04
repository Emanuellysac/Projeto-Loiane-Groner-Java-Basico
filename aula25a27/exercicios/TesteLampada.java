package br.com.aula25a27.exercicios;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		/*lampada.ligada = true;
		lampada.mostrarEstado();
		
		lampada.ligada = false;
		lampada.mostrarEstado();*/
		
		/*lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();*/
		
		lampada.desligar();
		lampada.mudarEstado();
		
		lampada.ligar();
		lampada.mudarEstado();
		
	}

}
