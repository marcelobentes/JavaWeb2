package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/* Implementando processo de fila e pilha com thread*/


public class TelaTimeThread2 extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes

	private JLabel nome = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField(); //campo de texto
	
	private JLabel email = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	private JButton jButton = new JButton("Gerar lote"); //adicionando bot�o
	private JButton jButton2 = new JButton("Stop"); //adicionando bot�o
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	
	
	
	public TelaTimeThread2 () {
		setTitle("Minha tela de time com Thread");//exibi o titulo
		setSize(new Dimension(240, 240));//tamanho da tela
		setLocationRelativeTo(null);//Centraliza tela no meio
		setResizable(false);// desabilitar para tela não esticar ficar fixa o tamanho.
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; /*iniciando o tamanho do grid para 2
		 para ficar o tempo da thread em duas colunas*/
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);/*setando os top, bottom,
		left e right na tela */
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		nome.setPreferredSize(new Dimension(200, 25));
		jPanel.add(nome, gridBagConstraints); //adicionando ao painel
		
		gridBagConstraints.gridy ++;
		mostraTempo.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		email.setPreferredSize(new Dimension(200,25));
		jPanel.add(email, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;//iniciando em 1 para ficar os dois bot�o em uma coluna
		
		jButton.setPreferredSize(new Dimension(92, 25)); //tamanho do bot�o
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {//adionando acao Start no botao
			
			@Override
			public void actionPerformed(ActionEvent e) {//execulta o clique do botao
				FilaThread filaThread = new FilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText());
				
				fila.add(filaThread);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				
			}
		} );
		
		
		fila.start();
		add (jPanel, BorderLayout.WEST); //adicionando ao derLayout
		
		
		//Sempre será o ultimo comando
		setVisible(true);// exibe uma tela para usuario
	}
	
}
