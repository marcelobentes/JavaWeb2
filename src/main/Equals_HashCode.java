package main;

import model.Aluno;

public class Equals_HashCode {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Marcelo");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Marcelo");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		}else {
			System.out.println("Alunos não são iguais.");
		}
	}

}
