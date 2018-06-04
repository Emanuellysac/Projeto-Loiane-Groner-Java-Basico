package br.com.aula24.classesEAtributos;

public class ClasseTesteContaCorrente {

	public static void main(String[] args) {
	
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Sado da conta " + conta.numero + " = " + conta.saldo);
		
	}

}
