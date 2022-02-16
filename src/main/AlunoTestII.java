package main;

import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoTestII {
	public static void main(String[] args) {
	
	Aluno aluno = new Aluno();
	String nome = JOptionPane.showInputDialog("Informe o nome: ");
	String escola = JOptionPane.showInputDialog("Informe a escola: ");
	String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
	String mae = JOptionPane.showInputDialog("Informe o nome da mãe: ");
	String idade = JOptionPane.showInputDialog("Informe a idade: ");
	String dataNascimento = JOptionPane.showInputDialog("Informe data de nascimento: ");
	String matricula = JOptionPane.showInputDialog("Informe a matricula: ");
	String cpf = JOptionPane.showInputDialog("Informe o CPF: ");
	String rg = JOptionPane.showInputDialog("Informe o RG: ");
	String serie = JOptionPane.showInputDialog("Informe a serie: ");
	String disciplina1 = JOptionPane.showInputDialog("Informe a disciplina1: ");
	String nota1 = JOptionPane.showInputDialog("Informe o nota1: ");
	String disciplina2 = JOptionPane.showInputDialog("Informe a disciplina2: ");
	String nota2 = JOptionPane.showInputDialog("Informe o nota2: ");
	String disciplina3 = JOptionPane.showInputDialog("Informe a disciplina3: ");
	String nota3 = JOptionPane.showInputDialog("Informe o nota3: ");
	String disciplina4 = JOptionPane.showInputDialog("Informe a disciplina4: ");
	String nota4 = JOptionPane.showInputDialog("Informe o nota4: ");
	
	
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
	
	aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
	aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
	aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
	aluno.getDisciplina().setNota4(Double.parseDouble(nota4));
	
	aluno.getDisciplina().setDisciplina1(disciplina1);
	aluno.getDisciplina().setDisciplina2(disciplina2);
	aluno.getDisciplina().setDisciplina3(disciplina3);
	aluno.getDisciplina().setDisciplina4(disciplina4);
	
	System.out.println(aluno);
	System.out.println("Media do Aluno: " + aluno.getMedianota());
	System.out.println("Resultado: "+aluno.getResultado());
}
	
	
}	
