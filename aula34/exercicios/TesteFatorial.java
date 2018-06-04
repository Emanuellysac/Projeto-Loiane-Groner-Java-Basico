package br.com.aula34.exercicios;

import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;

		do {

			System.out.println("Entre com um número positivo:");
			num = scan.nextInt();
			
			System.out.println(Fatorial.fatorial(num));

			if (num < 0) {
				System.out.println("Número inválido, entre novamente.");
			}

		} while (num >= 0);
	}
}
