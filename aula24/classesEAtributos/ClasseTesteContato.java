package br.com.aula24.classesEAtributos;

public class ClasseTesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.endereco = "Vasco da Gama";
		contato1.email = "@joão";
		
		contato1.telefones = new String[3];
		contato1.telefones[0] = "11111111";
		contato1.telefones[1] = "22222222";
		contato1.telefones[2] = "33333333";
		
		System.out.println(contato1.telefones[0]);
		
		
		
	}

}
