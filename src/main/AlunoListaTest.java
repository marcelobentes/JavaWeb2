package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AlunoListaTest {
	public static void main(String[] args) {
	
	List<AlunoLista> alunos = new ArrayList<AlunoLista>();	
		
	for(int qtd = 1; qtd <= 2; qtd++) {
		
	AlunoLista aluno = new AlunoLista();
	String nome = JOptionPane.showInputDialog("Informe o nome aluno "+qtd+": ");
	String escola = JOptionPane.showInputDialog("Informe a escola: ");
	String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
	String mae = JOptionPane.showInputDialog("Informe o nome da m�e: ");
	String idade = JOptionPane.showInputDialog("Informe a idade: ");
	String dataNascimento = JOptionPane.showInputDialog("Informe data de nascimento: ");
	String matricula = JOptionPane.showInputDialog("Informe a matricula: ");
	String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
	String rg = JOptionPane.showInputDialog("Informe o RG: ");
	String serie = JOptionPane.showInputDialog("Informe a serie: ");
	
	
	
	aluno.setNome(nome);
	aluno.setNomeEscola(escola);
	aluno.setNomeMae(mae);
	aluno.setNomePai(pai);
	aluno.setIdade(Integer.parseInt(idade));
	aluno.setDataNascimento(dataNascimento);
	aluno.setDataMatricula(matricula);
	aluno.setNumeroCpf(cpf);
	aluno.setRg(rg);
	aluno.setSerieMatriculado(serie);
	
	for(int posicao =1; posicao <= 4; posicao ++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+posicao+" ?");
		String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+posicao+" ?");
		
		DisciplinaLista disciplina = new DisciplinaLista();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		
		aluno.getDisciplinas().add(disciplina);
	
	}
	//Removendo disciplina
	int escolha =JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplia ?");
	// 0 = a sim e 1 = a não
	if(escolha == 0) {
		String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina remover ? 1, 2, 3 ou 4 ?");
		aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() -1);
	}
	
	
	alunos.add(aluno);
	
	}
	
	for (AlunoLista alunoLista : alunos) {
		System.out.println(alunoLista);
		System.out.println("Media do Aluno: " + alunoLista.getMedianota());
		System.out.println("Resultado: "+alunoLista.getResultado());
		System.out.println("------------------------------------");
	}
	
	
}
	
	
}	
