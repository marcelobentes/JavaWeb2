package main;

import javax.swing.JOptionPane;

import interfaces.PermitirAcesso;

public class TestInterface {

	/* Usando interfaces melhorando.*/
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		PermitirAcesso diretor = new Diretor ();
		
		if(diretor.autenticar(login, senha)) {
			JOptionPane.showInternalMessageDialog(null,"Acesso permitido...");
		}else {
			JOptionPane.showInternalMessageDialog(null,"Acesso Negado...");
		}
		
		
	

	}

}
