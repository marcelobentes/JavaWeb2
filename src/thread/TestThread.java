package thread;

import javax.swing.JOptionPane;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		
		//Criando uma thread em backlog
		new Thread() {
			public void run() { //executa o codigo da rotina
				
				for (int i = 0; i < 10; i++) {
					//executando a thread com sleep, para dar uma parada na execução
					
					System.out.println("Executando rotina de enviar e-mail");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			};
			
		}.start(); //liga a thread que fica processando paralelamente por trás
		
		
		//Divisão das Thread
		
		new Thread() {
			public void run() { //executa o codigo da rotina
				
				for (int i = 0; i < 10; i++) {
					//executando a thread com sleep, para dar uma parada na execução
					
					System.out.println("Executando rotina de enviar nota fiscal");
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			};
			
		}.start(); //liga a thread que fica processando paralelamente por trás
		
		
		
		JOptionPane.showMessageDialog(null, "Sistama continua executando para o usuario.");
	
		System.out.println("Finalizado o codigo de teste da Thread");
	}

}
