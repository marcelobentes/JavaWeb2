package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date); //data completa
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Dia do mês: "+ date.getDate());
		System.out.println("Dia da semana: "+ (1+date.getDay()));
		System.out.println("Hora do dia: "+ date.getHours());
		System.out.println("Minuto da hora: "+ date.getMinutes());
		System.out.println("Mês do ano: "+date.getMonth());
		
		/*------------------Simple Date Format----------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data atual em formato padrão e String: "+ simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para banco de dados: "+simpleDateFormat.format(date));
		
		
	}

}
