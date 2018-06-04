package br.com.aula36.exercicios01.Importante;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome da agenda:");
		String nome = scan.nextLine();

		// Criação do objeto agenda com parametro de entrada.
		Agenda agenda = new Agenda(nome);
		// Agenda agenda = new Agenda();
		// agenda.setNomeAgenda(nome);

		// Criação do Array Contato[].
		Contato[] contatos = new Contato[3];

		// Laço para criação do objeto Contato e inserção de valores nele.
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i + 1));

			Contato c = new Contato(); // Criação do objeto Contato.

			System.out.println("Entre com o nome: ");
			nome = scan.nextLine();
			c.setNomeContato(nome);

			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);

			System.out.println("Entre com o email: ");
			String email = scan.nextLine();
			c.setEmail(email);

			// Adicionar cada objeto criado no Array.
			contatos[i] = c;
		}

		// Inserir/vincular o Array contatos na agenda.
		agenda.setContatos(contatos);
		
		//Chamada do método
		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
	}
}
