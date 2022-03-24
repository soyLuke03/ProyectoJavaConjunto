package main.java.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



public class Equipo {
	
	private String nombreEquipo;
	private Collection<Alumno> alumnoColeccion= new ArrayList<>();
	
	
	//Constructor//
	
	
	public Equipo(String nombreEquipo, Collection<Alumno> alumnoColeccion) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.alumnoColeccion = alumnoColeccion;
	}
	/**
	 * Añadir alumno por parametros de objetos.
	 * @param alumno
	 */
	public void addAlumno(Alumno alumno) {		
		
		if (alumnoColeccion.contains(alumno)) {
			 //exception//
		}
		else {
			alumnoColeccion.add(alumno);
		}
	}
	/**
	 * Añadir alumno por parametro de builder
	 * @param nombre
	 * @param dni
	 */
	public void addAlumno(String nombre, String dni) {
		Alumno alumno= new Alumno(nombre, dni);
		if (alumnoColeccion.contains(alumno)) {
			 //exception//
		}
		else {
			alumnoColeccion.add(alumno);
		}
	}
	/*Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el
	alumno no existe en el equipo debe saltar una excepción.*/
	
	public void deleteAlumno(Alumno alumno) {
		if (!alumnoColeccion.contains(alumno)) {
			//exceptions
		}else {
			alumnoColeccion.remove(alumno);
		}
	}
	// getter y setter//
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Collection<Alumno> getAlumnoColeccion() {
		return alumnoColeccion;
	}

	public void setAlumnoColeccion(Collection<Alumno> alumnoColeccion) {
		this.alumnoColeccion = alumnoColeccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alumnoColeccion, nombreEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= false;
		Equipo other = (Equipo) obj;
		
		if(obj != null) {
			if (this.nombreEquipo.equalsIgnoreCase(other.getNombreEquipo()))
				sonIguales = true;
			
			}
		return sonIguales;
		
		}

	@Override
	public String toString() {
		return  nombreEquipo;
	}
	
	
	
	
	
}
