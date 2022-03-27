package main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ComparandoDatasII {

	public static void main(String[] args) throws ParseException{
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-03-20"), LocalDate.now());
		//ver o temporal de dias, meses e anos etc...
		
		System.out.println("Possui " +dias +" dias entra a faixa da data");

	}

}
