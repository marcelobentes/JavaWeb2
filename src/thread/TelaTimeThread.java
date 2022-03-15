package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes

	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField(); //campo de texto
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread () {
		setTitle("Minha tela de time com Thread");//exibi o titulo
		setSize(new Dimension(240, 240));//tamanho da tela
		setLocationRelativeTo(null);//Centraliza tela no meio
		setResizable(false);// desabilitar para tela não esticar ficar fixa o tamanho.
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints); //adicionando ao painel
		
		gridBagConstraints.gridy ++;
		mostraTempo.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		add (jPanel, BorderLayout.WEST); //adicionando ao derLayout
		
		
		//Sempre será o ultimo comando
		setVisible(true);// exibe uma tela para usuario
	}
	
}
