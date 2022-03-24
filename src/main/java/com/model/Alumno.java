package main.java.com.model;

import java.util.Objects;
import java.util.Scanner;



public class Alumno {

	private String nombre;
	private String dni;
	
	
	//constructor//
	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
//metodos//
	
	
	
	

// getter y setter//
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= false;
		Alumno other = (Alumno) obj;
		
		if(obj != null) {
			if (this.dni.equalsIgnoreCase(other.getDni()))
				sonIguales = true;
			
			}
		return sonIguales;
		
		}

	@Override
	public String toString() {
		return nombre + " " +dni;
	}
	
	
	}


		
		
		
