package main.java.com.model.Ejercicio4.main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.com.model.Ejercicio4.model.Historial;
import main.java.com.model.Ejercicio4.model.PaginaWeb;

public class MainApp {

	public static String MENU ="1-Nueva p√°gina consultada: \n"
			+ "2- Consultar historial completo. \n"
			+ "3 - Consultar historial de un d√≠a. \n"
			+ "4 Borrar historial completo. \n"
			+ "5 - Salir";
	
	public static LocalDateTime fecha() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("AÒo");
		int anno = Integer.valueOf(sc1.nextLine());
		System.out.println("Mes");
		int mes = Integer.valueOf(sc1.nextLine());
		System.out.println("Dia");
		int dia = Integer.valueOf(sc1.nextLine());
		System.out.println("Hora");
		int hora = Integer.valueOf(sc1.nextLine());
		System.out.println("Minuto");
		int minuto = Integer.valueOf(sc1.nextLine());
		
		
		return LocalDateTime.of(anno,mes,dia,hora,minuto);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<PaginaWeb> webs = new ArrayList<>();
		Historial historial = new Historial(webs);
		
		int opciones=0;
		
		
		do {
		
		imprimirMenu();
		opciones=Integer.valueOf(sc.nextLine());
		
		if (opciones==1) {
			System.out.println("Introduzca el nombre de la p·gina web visitada: ");
			String respuesta = sc.nextLine();
			System.out.println(" ");
			PaginaWeb pa = new PaginaWeb(respuesta,fecha());
			historial.addWeb(pa);
		}
		
		else if (opciones==2) {
			System.out.println("Consultando historial completo: ");
			
			historial.consultarHistorialCompleto(webs);
		}
		
		else if (opciones==3) {
			System.out.println("Consultando historial completo: ");
			
			for (int i = 0; i<historial.getNumeroPaginas();i++) {
				if (webs.get(i).getFechaQueSeCreo()==fecha()){
					System.out.println(historial.toString());
				}
			}
		}
		
		else if (opciones==4) {
			historial.eliminarHistorialCompleto(webs);
		}
		
		
		
		
		}
		while(opciones!=5);
		
	
			
			
			
			
			
			
			
		

	}
	public static void imprimirMenu() {
		System.out.println(MENU);
	}
}
