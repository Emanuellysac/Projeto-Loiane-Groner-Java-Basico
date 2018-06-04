package br.com.aula43.classeObjectToString;

import java.util.Iterator;

public class Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("SI");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		/* for (double nota : notas) {
		   		System.out.println(nota); } */
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("SI");
		double[] notas2 = {9,9,8,7};
		aluno.setNotas(notas2);
		
		
	System.out.println(aluno.toString());
	System.out.println(aluno.equals(aluno2));
			
	} 
}


