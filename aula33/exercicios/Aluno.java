package br.com.aula33.exercicios;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;

	Aluno() {
		disciplinas = new String[3];
		notas = new double[3][4];

	}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = new String[3];
		this.notas = new double[3][4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);

		for (int i = 0; i < notas.length; i++) {// linha
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {// coluna
				System.out.println(notas[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean verificarAprovado(int indice) {// Indice das disciplinas

		if (obterMedia(indice) >= 7) {
			return true;
			// Tudo o que vem após o retorno não é executado.
		} /*
			 * else { //return false; }
			 */
		return false;
	}

	private double obterMedia(int indice) {

		double soma = 0;

		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];// [indice] das disciplinas, [i] notas contidas nos indices de cada disciplina
		}
		double media = soma / 4;

		return media;
	}

	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.disciplinas[pos]= nomeDisciplina;
	}

	public void setNotaPosIJ(int posI, int posJ, double nota) {
		this.notas[posI][posJ]= nota;
		
	}
	
}
