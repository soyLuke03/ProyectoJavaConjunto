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
		
		
<<<<<<< HEAD
		Equipo atmadrid = new Equipo("Madrid", a1);
=======
		
		Equipo atleti = new Equipo("Atleti", a1);
>>>>>>> 901b7bc78f8f1f2c67d8d388a84ca5c5c494a8f1
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
		
			//madrid.mostrarListaEquipo(a1);
			System.out.println(madrid.interseccionDeEquipos(atmadrid));
			
			//madrid.imprimirListaEquipo(a2);
			
			
			System.out.println(atleti.unionEquipos(madrid));
			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		System.out.println("");
	}

}
