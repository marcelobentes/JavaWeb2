package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataApiJava {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now(); //usando o java.time
		LocalDate dataAntiga = LocalDate.of(2022, 1, 1);
		System.out.println("Data atual: "+dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: "+horaAtual);
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual: "+dataAtualHoraAtual);
		System.out.println("Data e hora atual formatada: "
		
				+dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

		System.out.println("Dia da semana: "+dataAtual.getDayOfWeek());
		System.out.println("Dia do mês: "+dataAtual.getDayOfMonth());
		System.out.println("Dia do ano: "+dataAtual.getDayOfYear());
		
		Period periodo = Period.between(dataAntiga, dataAtual); //Contando periodo de dias
		System.out.println("Dias contados: "+ periodo.getDays());
		
		System.out.println("Mês Contados: "+periodo.getMonths());
		
		
	}

}
