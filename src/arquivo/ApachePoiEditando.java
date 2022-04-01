
package arquivo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePoiEditando {

	public static void main(String[] args) throws IOException {
	
		File file = new File ("D:\\DESENVOLVIMENTO\\WORKSPACE\\JavaWeb-FullStack\\src\\arquivo\\arquivo_excel.xsl");
		
		FileInputStream entrada = new FileInputStream (file);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(entrada);//preparando a entrada do arquivo
		
		HSSFSheet planilha = hssfworkbook.getSheetAt(0);//pegando a planilha
		
		Iterator <Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {//enquato tiver linha
			Row linha = linhaIterator.next();//Dados da pessoa da linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells();//quantidade de linha

			Cell cell = linha.createCell(numeroCelulas);//criar nova celula na linha
			cell.setCellValue("5.486,25");
						
		}
		
		entrada.close();
		
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha Atualizada");
		
		
	}

}