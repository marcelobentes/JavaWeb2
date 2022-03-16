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
	private JButton jButton = new JButton("Start"); //adicionando bot„o
	private JButton jButton2 = new JButton("Stop"); //adicionando bot„o
	
	private Runnable thread1 = new Runnable() {//metodo de thread
		
		@Override
		public void run() {
			while(true) {
				//instanciando para mostrar a data e hora atual
			mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
					.format(Calendar.getInstance().getTime()));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			}
			
		}
	};
	
	private Runnable thread2 = new Runnable() {//metodo da Thread
		
		@Override
		public void run() {
			while(true) {
				//instanciando para mostrar a data e hora atual
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	
	
	public TelaTimeThread () {
		setTitle("Minha tela de time com Thread");//exibi o titulo
		setSize(new Dimension(240, 240));//tamanho da tela
		setLocationRelativeTo(null);//Centraliza tela no meio
		setResizable(false);// desabilitar para tela n√£o esticar ficar fixa o tamanho.
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; /*iniciando o tamanho do grid para 2
		 para ficar o tempo da thread em duas colunas*/
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);/*setando os top, bottom,
		left e right na tela */
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints); //adicionando ao painel
		
		gridBagConstraints.gridy ++;
		mostraTempo.setPreferredSize(new Dimension(200,25));
		mostraTempo.setEditable(false);//desabilitar editar o campo
		jPanel.add(mostraTempo, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		mostraTempo2.setEditable(false);//desabilitar editar o campo
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;//iniciando em 1 para ficar os dois bot„o em uma coluna
		
		jButton.setPreferredSize(new Dimension(92, 25)); //tamanho do bot„o
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {//adionando aÁ„o Start no bot„o
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread (thread1);
				thread2Time = new Thread(thread2);
				thread1Time.start();
				thread2Time.start();
				
				jButton.setEnabled(false);//desabilitando o start
				jButton2.setEnabled(true);//habilitando o stop
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);//habilitando o start
				jButton2.setEnabled(false);//desabilitando o stop
			}
		} );
		
		add (jPanel, BorderLayout.WEST); //adicionando ao derLayout
		
		
		//Sempre ser√° o ultimo comando
		setVisible(true);// exibe uma tela para usuario
	}
	
}
