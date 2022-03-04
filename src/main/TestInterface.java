package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticar;
import interfaces.PermitirAcesso;
import java_excecao.ExcecaoProcessarNota;

public class TestInterface {

	/* Usando interfaces melhorando.*/
	@SuppressWarnings({ "null", "resource", "unused" })
	public static void main(String[] args) {
		
		try {
			
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		FuncaoAutenticar funcaoautenticar = new FuncaoAutenticar ();
		
		PermitirAcesso permitiAcesso = new Diretor (login, senha);
		
		try {
			
			File arquivo = new File ("c:\file.txt");
			
			Scanner entrada = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota("Erro a processar arquivo não encontrado.");
		}
		
		if(funcaoautenticar.autenticar(permitiAcesso)) {
			JOptionPane.showInternalMessageDialog(null,"Acesso permitido...");
		}else {
			JOptionPane.showInternalMessageDialog(null,"Acesso Negado...");
		}
		
		
		
			//Tratando Exception
		} catch (Exception e) {
			e.printStackTrace();//Imprimi o erro no console
			JOptionPane.showInternalMessageDialog(null, "Erro de autenticação.");

	}

}
}
