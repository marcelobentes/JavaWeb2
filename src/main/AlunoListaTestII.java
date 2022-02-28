package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import constantes.StatusAluno;

public class AlunoListaTestII {

	public static void main(String[] args) {
		
		List<AlunoLista> alunos = new ArrayList<AlunoLista>();
		List<AlunoLista> alunosAprovados = new ArrayList<AlunoLista>();
		List<AlunoLista> alunosRecuperacao = new ArrayList<AlunoLista>();
		List<AlunoLista> alunosReprovados = new ArrayList<AlunoLista>();
			
		for(int qtd = 1; qtd <= 5; qtd++) {
			
		AlunoLista aluno = new AlunoLista();
		String nome = JOptionPane.showInputDialog("Informe o nome aluno "+qtd+": ");
		String escola = JOptionPane.showInputDialog("Informe a escola: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da mï¿½e: ");
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
		// 0 = a sim e 1 = a nÃ£o
		if(escolha == 0) {
			String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina remover ? 1, 2, 3 ou 4 ?");
			aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() -1);
		}
		
		
		alunos.add(aluno);
		
		}
		
		for (AlunoLista aluno : alunos) {
			
			if(aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
				
			}else
				if(aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
					
				}else
					alunosReprovados.add(aluno);
				
			}
		
		System.out.println("----------Lista Aprovados------------");
		for (AlunoLista aluno : alunosAprovados) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}

		System.out.println("----------Lista de Recuperação----------");
		for (AlunoLista aluno : alunosRecuperacao) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}
		System.out.println("----------Lista Reprovados-----------");
		for (AlunoLista aluno : alunosReprovados) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}
			
		}
		
		
		
	}
		
		

