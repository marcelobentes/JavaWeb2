package main;

import interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	
	
	/*Métode de interface */
	public boolean autenticar (String login, String senha) {
		
		return login.equals("admin") && senha.equals("admin");
	}

	
}
