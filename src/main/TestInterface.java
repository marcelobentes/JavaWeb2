package main;

import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticar;
import interfaces.PermitirAcesso;

public class TestInterface {

	/* Usando interfaces melhorando.*/
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		FuncaoAutenticar funcaoautenticar = new FuncaoAutenticar ();
		
		PermitirAcesso permitiAcesso = new Diretor (login, senha);
		
		if(funcaoautenticar.autenticar(permitiAcesso)) {
			JOptionPane.showInternalMessageDialog(null,"Acesso permitido...");
		}else {
			JOptionPane.showInternalMessageDialog(null,"Acesso Negado...");
		}
		
		
	

	}

}
