package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constantes.StatusAluno;

public class AlunoListaTestIII {

	public static void main(String[] args) {
		
		List<AlunoLista> alunos = new ArrayList<AlunoLista>();
		/* HashMap é uma lista que dentro dela temos uma chave que identifica um 
		 * sequencia de valoeres também*/
		
		HashMap<String, List<AlunoLista>> maps = new HashMap<String, List<AlunoLista>>();
			
		for(int qtd = 1; qtd <= 5; qtd++) {
			
		AlunoLista aluno = new AlunoLista();
		String nome = JOptionPane.showInputDialog("Informe o nome aluno "+qtd+": ");
		//String escola = JOptionPane.showInputDialog("Informe a escola: ");
		//String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
		//String mae = JOptionPane.showInputDialog("Informe o nome da mï¿½e: ");
		//String idade = JOptionPane.showInputDialog("Informe a idade: ");
		//String dataNascimento = JOptionPane.showInputDialog("Informe data de nascimento: ");
		//String matricula = JOptionPane.showInputDialog("Informe a matricula: ");
		//String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		//String rg = JOptionPane.showInputDialog("Informe o RG: ");
		String serie = JOptionPane.showInputDialog("Informe a serie: ");
		
		
		
		aluno.setNome(nome);
		//aluno.setNomeEscola(escola);
		//aluno.setNomeMae(mae);
		//aluno.setNomePai(pai);
		//aluno.setIdade(Integer.parseInt(idade));
		//aluno.setDataNascimento(dataNascimento);
		//aluno.setDataMatricula(matricula);
		//aluno.setNumeroCpf(cpf);
		//aluno.setRg(rg);
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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<AlunoLista>());//adicionando no mapa uma lista vazia
		maps.put(StatusAluno.REPROVADO, new ArrayList<AlunoLista>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<AlunoLista>());
		
		
		for (AlunoLista aluno : alunos) {
			
			if(aluno.getResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
			}else
				if(aluno.getResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
					
				}else
					maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		
		System.out.println("----------Lista Aprovados------------");
		for (AlunoLista aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}

		System.out.println("----------Lista de Recuperação----------");
		for (AlunoLista aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}
		System.out.println("----------Lista Reprovados-----------");
		for (AlunoLista aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do Aluno = "+aluno.getNome()+" - Resultado = "+aluno.getResultado() +" Com media = "+aluno.getMedianota());
		}
			
		}
		
		
		
	}
		
		

