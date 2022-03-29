package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		//estanciando para ler o arquivo
		FileInputStream entradaArquivo = new FileInputStream(new File("/home/marcelo/DESENVOLVIMENTO/WORKSPACE JAVAWEB/JavaWeb2/src/arquivo/arquivo1.txt"));
	
		@SuppressWarnings("resource")
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");//entrada
		
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();//leitura
			if (linha != null && !linha.isEmpty()) {//excluindo linha em branco
			System.out.println(linha);//imprimindo no console
			}
		
		}
	
	}

}
