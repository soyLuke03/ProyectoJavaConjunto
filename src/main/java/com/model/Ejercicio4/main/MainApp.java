package main.java.com.model.Ejercicio4.main;

import java.util.Scanner;

public class MainApp {

	public static String MENU ="1-Nueva página consultada: \n"
			+ "2- Consultar historial completo. \n"
			+ "3 - Consultar historial de un día. \n"
			+ "4 Borrar historial completo. \n"
			+ "5 - Salir";
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opciones=0;
		
		
		do {
		
		imprimirMenu();
		opciones=Integer.valueOf(sc.nextLine());
		
		
		
		
		
		}
		while(opciones!=5);
		
	
			
			
			
			
			
			
			
		

	}
	public static void imprimirMenu() {
		System.out.println(MENU);
	}
}
