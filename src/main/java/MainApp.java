package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Collection<Alumno> a1 = new ArrayList<Alumno>();
		ArrayList<Alumno> a2 = new ArrayList<Alumno>();
		
		
		
		Equipo atleti = new Equipo("Atleti", a1);
		Equipo madrid = new Equipo("Madrid", a2);
		
		atleti.addAlumno("Joze", "12343");
		atleti.addAlumno("Juan", "519");
		atleti.addAlumno("Vicente", "999");
		
		
		madrid.addAlumno("Pepe", "1");
		madrid.addAlumno("Juan", "555");
		madrid.addAlumno("Vicente", "999");
//		madrid.addAlumno(null);
//		madrid.addAlumno(null, "asd2");
//		madrid.addAlumno("joselu", null);
		
			madrid.mostrarListaEquipo(a1);
			
			madrid.imprimirListaEquipo(a2);
			
			
			System.out.println(atleti.unionEquipos(madrid));
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		System.out.println("");
	}

}
