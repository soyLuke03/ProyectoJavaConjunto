package main.java.com.model;

import java.util.Objects;
import java.util.Scanner;



public class Alumno {

	private String nombre;
	private String dni;
	
	
	//constructor//
	public Alumno(String nombre, String dni) {
		super();
		if (nombre != null) {
			this.nombre = nombre;
		}
		else if (nombre == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un nombre válido");
		}
		
		
		if (dni != null) {
			this.dni = dni;
		}
		else if (dni == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un DNI válido");
		}
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
		return "[Nombre: " + nombre +"] [DNI: " +dni+"]";
	}
	
	
	}


		
		
		
