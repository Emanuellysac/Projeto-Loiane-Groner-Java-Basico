/* Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato possui nome, telefone e email.
A agenda também possui um nome. Crie um programa teste que peça para o usuário entrar com o nome da Agenda e em seguida 3 contatos.
Crie métodos que retornem uma String com a informação de cada contato e também de todos os contatos da agenda. */

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
				info += c.obterInfo() + "\n"; //O método obterInfo() da classe Agenda quando chamado também irá chamar o método c.obterInfo() da classe Contato fazendo o output de todas as informações. 
				
			}
		}
		
		return info;
	}
}
