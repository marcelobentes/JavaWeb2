package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	private static ConcurrentLinkedQueue<FilaThread> pilha_fila = //criando uma pilha concorrente
			new	ConcurrentLinkedQueue<FilaThread>();
	
	public static void add (FilaThread filaThread) {
		pilha_fila.add(filaThread);
	}
	
	@Override
	public void run() {
		
		
		while (true) {
			Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) {//bloquear o acesso a lista por outro processo
			
			while(iteracao.hasNext()) {//enquanto conter dados na lista ele vai processar
				
				FilaThread processar = (FilaThread)iteracao.next();
				
				//Realizado varios processos
				
				System.out.println("#######################");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				
				iteracao.remove(); //removendo item da lista
				
				try {
					Thread.sleep(100);//dar um tempo para limpeza da memoria
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}

		try {
			Thread.sleep(1000);//dar um tempo para limpeza da memoria
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}
	}
		
		
		
	
	
}
