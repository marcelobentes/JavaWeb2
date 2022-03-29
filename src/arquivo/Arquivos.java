package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Marcelo");
		pessoa1.setEmail("marcelo@.br");
		pessoa1.setIdade(25);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Mabel");
		pessoa2.setEmail("marbel@.br");
		pessoa2.setIdade(8);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Samuel");
		pessoa3.setEmail("samuel@.br");
		pessoa3.setIdade(6);
		
		File arquivo1 = new File("/home/marcelo/DESENVOLVIMENTO/WORKSPACE JAVAWEB/JavaWeb2/src/arquivo/arquivo1.txt");
		
		if (!arquivo1.exists()) {
			
			arquivo1.createNewFile();
		}
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo1);//criando o objeto para escrever
		
		for (Pessoa p : pessoas) {
			
			escreverNoArquivo.write(p.getNome() +";"+ p.getEmail() +";"+p.getIdade()+ "\n");
		}
		
				
		escreverNoArquivo.flush();//persisti alteração
		escreverNoArquivo.close();//fechar o arquivo
	}

}
