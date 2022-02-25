package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AlunoListaTest {
	public static void main(String[] args) {
	
	List<AlunoLista> alunos = new ArrayList<AlunoLista>();	
		
	for(int qtd = 1; qtd <= 1; qtd++) {
		
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
	
	for(int posicao =1; posicao <= 1; posicao ++) {
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
	//pesquisando lista pelo index
	for (int pos =0; pos < alunos.size(); pos ++) {
		
		AlunoLista aluno = alunos.get(pos);
		
		//substituindo um aluno encontrado na lista
		if (aluno.getNome().equalsIgnoreCase("Marcelo")) {
			AlunoLista subtituirAluno = new AlunoLista ();
			subtituirAluno.setNome("Aluno trocado.");
			
			DisciplinaLista disciplina = new DisciplinaLista ();
			
			disciplina.setDisciplina("Fisica");
			disciplina.setNota(80.0);
			
			//adicionando a disciplina na lista.
			subtituirAluno.getDisciplinas().add(disciplina);
			
			alunos.set(pos, subtituirAluno);
			aluno = alunos.get(pos);
		}
				
				
		System.out.println("Aluno: "+aluno.getNome());
		System.out.println("Media do Aluno: " + aluno.getMedianota());
		System.out.println("Resultado: "+aluno.getResultado());
		System.out.println("------------------------------------");
		
		for (int posd =0; posd < aluno.getDisciplinas().size(); posd ++) {
			DisciplinaLista discipl = aluno.getDisciplinas().get(posd);
			System.out.println("Materia = "+discipl.getDisciplina()+" Nota = "+discipl.getNota());
		}
	}
	
	
}
	
	
}	
