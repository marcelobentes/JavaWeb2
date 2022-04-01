package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File ("/home/marcelo/DESENVOLVIMENTO/WORKSPACE JAVAWEB/JavaWeb2/src/arquivo/arquivo_excel.xls");
	
		
		if(!file.exists() ) {
			file.createNewFile();
		}
		

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
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		@SuppressWarnings("resource")
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();//vai seu usadoa para escrever na planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha Pessoas");//criar a planilha
		
		int numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++);//criando a linha na planilha
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);//Celula 1
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);//Celula 2
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);//celula 3
			celIdade.setCellValue(p.getIdade());
			
			
		}//Termino de montar a planilha
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);//escreve planilha em arquivo
		
		saida.flush();
		saida.close();
		
		System.out.println("Planilha criada.");
	
	}

}
