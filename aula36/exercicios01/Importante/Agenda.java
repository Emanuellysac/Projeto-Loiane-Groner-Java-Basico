/* Escreva uma classe Agenda, que cont�m v�rios contatos do tipo Contato. Cada contato possui nome, telefone e email.
A agenda tamb�m possui um nome. Crie um programa teste que pe�a para o usu�rio entrar com o nome da Agenda e em seguida 3 contatos.
Crie m�todos que retornem uma String com a informa��o de cada contato e tamb�m de todos os contatos da agenda. */

package br.com.aula36.exercicios01.Importante;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public Agenda() {
		
	}
	
	public Agenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = "Nome = " + nomeAgenda + "\n";
		
		if(contatos != null) {
			for (Contato c : contatos) { //Classe + objeto da classe Contato + Array contatos - Interando todos os contatos dessa classe.
				info += c.obterInfo() + "\n"; //O m�todo obterInfo() da classe Agenda quando chamado tamb�m ir� chamar o m�todo c.obterInfo() da classe Contato fazendo o output de todas as informa��es. 
				
			}
		}
		
		return info;
	}
}
