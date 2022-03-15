package thread;

import javax.swing.JOptionPane;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 10; i++) {
			//executando a thread com sleep, para dar uma parada na execução
			
			System.out.println("Executando rotina de enviar e-mail");
			
			Thread.sleep(1000);
		}
		
		System.out.println("Finalizado o codigo de teste da Thread");
		
		JOptionPane.showMessageDialog(null, "Sistama continua executando para o usuario.");
	}

}
