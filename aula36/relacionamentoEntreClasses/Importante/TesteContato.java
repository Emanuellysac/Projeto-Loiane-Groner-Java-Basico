package br.com.aula36.relacionamentoEntreClasses.Importante;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Manu");

		// (Relacionamento tem um endereco)
		// ******************************************************************************//
		// Criar objeto endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua do Sol");
		end.setNumero("86");
		end.setComplemento("-");
		end.setCidade("Recife");
		end.setEstado("PE");
		end.setCep("52081-170");

		contato.setEndereco(end); // Adicionado o objeto endereco no contato.

		// (Relacionamento tem mais de um telefone)
		// ****************************************************************************//
		// Criar objetos telefones
		Telefone telefone1 = new Telefone();
		telefone1.setDdd("81");
		telefone1.setNumero("999999999");
		telefone1.setTipo("celular");

		Telefone telefone2 = new Telefone();
		telefone2.setDdd("81");
		telefone2.setNumero("8888-8888");
		telefone2.setTipo("Residencial");

		Telefone[] telefones = new Telefone[2]; // Instanciar o Array do contato.
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		contato.setTelefones(telefones); // Adicionado o Array telefones no contato.

		// (Imprimir na tela - Nome)
		// *********************************************************************************//
		System.out.println(contato.getNome());

		// (Imprimir na tela - Endereco)
		// ********************************************************************************//
		/* System.out.println(contato.getEndereco().getCidade());
		   � preciso 1� chamar o objeto endereco (getEndereco()) para depois chamar os atributos que h� dentro dele. */
		
		/* Para tornar o c�digo mais seguro, deve-se fazer a verifica��o se o objeto contato e endere�o foram instanciados atrav�s de um IF. 
		   Caso n�o haja essa verifica��o, n�o havendo a inst�ncia do contato e do endere�o, ocasionar� um erro de "java.lang.NullPointerException".  */

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		// (Imprimir na tela - Telefones)
		// ********************************************************************************//
		/* Para tornar o c�digo mais seguro, deve-se fazer a verifica��o se o objeto contato e telefones foram instanciados atrav�s de um IF.
		   Caso n�o haja essa verifica��o, n�o havendo a inst�ncia do contato e dos telefones, ocasionar� um erro de "java.lang.NullPointerException".  */

		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}
