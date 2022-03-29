package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoII {

	public static void main(String[] args) throws FileNotFoundException {
		//estanciando para ler o arquivo
		
				FileInputStream entradaArquivo = new FileInputStream(new File("/home/marcelo/DESENVOLVIMENTO/WORKSPACE JAVAWEB/JavaWeb2/src/arquivo/arquivo1.txt"));
			
				@SuppressWarnings("resource")
				Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");//entrada
				
				List<Pessoa> pessoas = new ArrayList<Pessoa>();
				
				while (lerArquivo.hasNext()) {
					
					String linha = lerArquivo.nextLine();//leitura
					if (linha != null && !linha.isEmpty()) {//excluindo linha em branco
					
						String [] dados = linha.split("\\;");
						
						Pessoa pessoa = new Pessoa ();
						pessoa.setNome(dados[0]);
						pessoa.setEmail(dados[1]);
						pessoa.setIdade(Integer.parseInt(dados[2]));
						
						pessoas.add(pessoa);
												
				}
			
					
			}
				
				for (Pessoa pessoa : pessoas) {
					
					
					System.out.println(pessoa);//imprimindo no console
				}
			}


	}



