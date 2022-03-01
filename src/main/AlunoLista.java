package main;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class AlunoLista extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	
	private List<DisciplinaLista> disciplinas = new ArrayList<DisciplinaLista>();
	
	public void setDisciplinas(List<DisciplinaLista> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<DisciplinaLista> getDisciplinas() {
		return disciplinas;
	}
	
	public AlunoLista(String nome, int idade, String dataNascimento, String rg, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
	}

	public AlunoLista() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	
	
	public double getMedianota() {
		double somaNotas = 0.0;
		
		for (DisciplinaLista disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas /disciplinas.size();
	}
	
	
	
	
	public String getResultado() {
		double media = this.getMedianota();
		if (media >= 50.0) {
			if(media >= 70) {
				return StatusAluno.APROVADO;				
			}else {
				return StatusAluno.RECUPERACAO;
			}
				
		}else {
				return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula="
				+ dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado
				+ "]";
	}
	
	

}
