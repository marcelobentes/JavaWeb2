package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		File arquivo1 = new File("/home/marcelo/DESENVOLVIMENTO/WORKSPACE JAVAWEB/JavaWeb2/src/arquivo/arquivo1.txt");
		
		if (!arquivo1.exists()) {
			
			arquivo1.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo1);//criando o objeto para escrever
		
		escreverNoArquivo.write("Meu primeiro texto.");//escrevendo no arquivo
		escreverNoArquivo.write("\nMeu segundo texto.");//escrevendo no arquivo
		escreverNoArquivo.flush();//persisti alteração
		escreverNoArquivo.close();//fechar o arquivo
	}

}
