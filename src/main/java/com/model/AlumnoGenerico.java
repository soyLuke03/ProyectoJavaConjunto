package main.java.com.model;

import java.util.Objects;

public class AlumnoGenerico<T> {
	private T nombre;
	private T dni;
	
	
	//constructor//
	public AlumnoGenerico(T nombre, T dni) {
		super();
		if (nombre != null) {
			this.nombre = nombre;
		}
		else if (nombre == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un nombre v�lido");
		}
		
		
		if (dni != null) {
			this.dni = dni;
		}
		else if (dni == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un DNI v�lido");
		}
	}
//métodos//
	
	
	
	

// getter y setter//
	
	



	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		boolean sonIguales= false;
		Alumno other = (Alumno) obj;
		
		if(obj != null) {
			if (this.dni.equals(other.getDni())&&this.nombre.equals(other.getNombre()))
				sonIguales = true;
			
			}
		return sonIguales;
		
		}

	@Override
	public String toString() {
		return "[Nombre: " + nombre +"] [DNI: " +dni+"]";
	}





	public T getNombre() {
		return nombre;
	}





	public void setNombre(T nombre) {
		this.nombre = nombre;
	}





	public T getDni() {
		return dni;
	}





	public void setDni(T dni) {
		this.dni = dni;
	}
	
	
	}


		
		
		


