package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;
import main.java.com.model.EquipoGenerica;

public class MainApp {
	public static final String SEPARADOR ="#################################################################";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		probarSinGenereicos();
	System.out.println(SEPARADOR);
		probarConGenereicos();
	}

	private static void probarConGenereicos() {
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		ArrayList<Integer> a9 = new ArrayList<Integer>();
		
		
		EquipoGenerica<Integer> barcelona= new EquipoGenerica<>(2, a5);
		EquipoGenerica<Integer> madrid= new EquipoGenerica<>(5, a9);
		madrid.addAlumno(123);
		madrid.addAlumno(128);
		madrid.addAlumno(127);
		
		
		
		barcelona.addAlumno(123);
		barcelona.addAlumno(128);
		barcelona.addAlumno(129);
		
		//barcelona.deleteAlumno(128);
		System.out.println(barcelona.unionEquipos(madrid));
		System.out.println(barcelona.interseccionDeEquipos(madrid));
		System.out.println("h");
	}

	private static void probarSinGenereicos() {
		try {
			
		Collection<Alumno> a1 = new ArrayList<Alumno>();
		ArrayList<Alumno> a2 = new ArrayList<Alumno>();
		
		

		Equipo atmadrid = new Equipo("Madrid", a1);

		
		Equipo atleti = new Equipo("Atleti", a1);

		Equipo madrid = new Equipo("Madrid", a2);
		
		atleti.addAlumno("Joze", "12343");
		atleti.addAlumno("Juan", "519");
		atleti.addAlumno("Vicente", "999");
		
		
		madrid.addAlumno("Pepe", "1");
		madrid.addAlumno("rodolfo", "555");
		madrid.addAlumno("Vicente", "999");
		atmadrid.addAlumno("Pepe", "1");
		atmadrid.addAlumno("rodolfo", "555");
		atmadrid.addAlumno("joselu", "585");
		
	
	
	//************************************************//
	
	
	
	
			
			
			madrid.mostrarListaEquipo(a1);
			System.out.println(madrid.interseccionDeEquipos(atmadrid));
			
			madrid.imprimirListaEquipo(a2);
			
			
			System.out.println(atleti.unionEquipos(madrid));
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
