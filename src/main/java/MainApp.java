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
		List<Alumno> a2 = new ArrayList<Alumno>();
		
		
//		Equipo madrid = new Equipo("Madrid", null);
		Equipo madrid = new Equipo("Madrid", a1);
		
		madrid.addAlumno("Pepe", "1");
		madrid.addAlumno("Juan", "555");
		madrid.addAlumno("Vicente", "999");
//		madrid.addAlumno(null);
//		madrid.addAlumno(null, "asd2");
//		madrid.addAlumno("joselu", null);
		
			madrid.mostrarListaEquipo(a1);
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		
		System.out.println("");
	}

}
