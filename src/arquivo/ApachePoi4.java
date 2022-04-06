package arquivo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi4 {

	public static void main(String[] args) throws IOException {
		
		//Lendo um arquivo xls
		FileInputStream entrada = new FileInputStream("D:\\DESENVOLVIMENTO\\WORKSPACE\\JavaWeb2\\src\\arquivo\\arquivo_excel.xls");
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);//prepara o arquivo do excel para leitura
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);//pega a primeira planilha
		
		Iterator<Row> linhaIterator = planilha.iterator();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (linhaIterator.hasNext()) {//enquanto estiver linha no excel
			Row linha = linhaIterator.next();
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) {
				
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
					
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
					
				}
				
				
			}//fim das celulas da linha
			
			pessoas.add(pessoa);
			
			
		}
		
		entrada.close();//termina de ler o arquivo
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	
	
	}

}