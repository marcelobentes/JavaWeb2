package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("28/03/2022");
		Date dataAualHoje = simpleDateFormat.parse("24/03/2022");
		Calendar calendar = Calendar.getInstance();
		
		
		if (dataVencimentoBoleto.after(dataAualHoje)) {//data maior que data 2
			System.out.println("Boleto em dia.");
		}else
			System.out.println("Boleto Vencido !!!");
		System.out.println("======================Usando Calendar=======================");
		
		calendar.setTime(simpleDateFormat.parse("25/03/2022"));//definido a data com simplesFormat
		calendar.add(Calendar.DAY_OF_MONTH, 40);// de hoje mais 40 dias
		
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format
				(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mês: " +new SimpleDateFormat("dd/MM;yyyy").format
				(calendar.getTime()));
	}

}
