package arrayvetor;

import main.AlunoLista;


public class ArrayVetor {

	public static void main(String[] args) {
		
		Double [] notasMatematica = {8.8,7.9, 5.6, 4.3};//adicionando valor ao vetor
		Double [] notasPortugues = {5.5, 9.0, 7.2, 8.2};
		
		//Criação o aluno
		
		AlunoLista aluno = new AlunoLista ();
		aluno.setNome("Marcelão");
		aluno.setNomeEscola("Davar");
		
		//Criação Disciplina1
		
		DisciplinaLista disciplina = new DisciplinaLista();
		disciplina.setDisciplina("Matematica");
		disciplina.setNota(notasMatematica);
		disciplina.setNota(notasMatematica);
		
		//adicionar a lista disciplina
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina);
		
		//Criação Disciplina2
		
		DisciplinaLista disciplina2 = new DisciplinaLista();
		disciplina2.setDisciplina("Português");
		disciplina2.setNota(notasPortugues);
		
		//adicionando a lista disciplina2
		aluno.getDisciplinas().add(disciplina2);
		
		//----------------------------------------------------
		
		//criando array aluno
		
		AlunoLista [] arrayAlunos = new AlunoLista [1];
		
		arrayAlunos [0]= aluno;
		
		for( int i; i < arrayAlunos.length; i++) {
			System.out.println("Node do aluno: "+arrayAlunos[i].getNome());
			
			for (DisciplinaLista disc : arrayAlunos[i].getDisciplinas()) {
				
				System.out.println("Nome da disciplina: " + arrayAlunos[i].getDisciplinas());
			}
			
			
			}
	
		
	}
	
	
}
