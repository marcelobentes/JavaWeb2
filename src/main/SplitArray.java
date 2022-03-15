package main;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		//convertendo um texto Split em array
		
		String texto = " Marcelo, Curso Java, 70, 86, 75";
		String [] valoresArray = texto.split(",");
		
		System.out.println("=====Conversão de texto para Split======");
		System.out.println("Nome: "+ valoresArray[0]);
		System.out.println("Curso: "+ valoresArray[1]);
		System.out.println("Nota 1: "+ valoresArray[2]);
		System.out.println("Nota 2: "+ valoresArray[3]);
		System.out.println("Nota 3: "+ valoresArray[4]);

		
		//Convertendo array em um lista
		
		List<String> list = Arrays.asList(valoresArray);
		System.out.println("======Converção para Lista======");
		for (String valorstring : list) {
			
			System.out.println(valorstring);
		}
		
		//Convertendo lista para Array
		
		String [] conversaoArray = list.toArray(new String [5]);
		System.out.println("======Converção para Array======");
		
		for (int i = 0; i < conversaoArray.length; i++) {
			
			System.out.println(conversaoArray[i]);
			
		}
	}

}
