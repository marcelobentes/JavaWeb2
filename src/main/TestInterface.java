package main;

import javax.swing.JOptionPane;

import classesAuxiliares.FuncaoAutenticar;
import interfaces.PermitirAcesso;

public class TestInterface {

	/* Usando interfaces melhorando.*/
	public static void main(String[] args) {
		
		try {
			
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		FuncaoAutenticar funcaoautenticar = null;
		
		PermitirAcesso permitiAcesso = new Diretor (login, senha);
		
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
