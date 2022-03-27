package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataApiJava {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now(); //usando o java.time
		System.out.println("Data atual: "+dataAtual);
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: "+horaAtual);
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atual: "+dataAtualHoraAtual);
		System.out.println("Data e hora atual formatada: "
		
				+dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

	}

}
