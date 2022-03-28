package main.java.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



public class Equipo {
	
	private String nombreEquipo;
	private Collection<Alumno> alumnoColeccion= new ArrayList<>();
	
	
	//Constructor//
	
	/**
	 * Este <b>BUILDER</b> genera un equipo con todos los datos.
	 * Si un dato no aparace, lanza una excepci�n.
	 * @param nombreEquipo
	 * @param alumnoColeccion
	 */
	public Equipo(String nombreEquipo, Collection<Alumno> alumnoColeccion) {
		super();
		if (nombreEquipo != null) {
			this.nombreEquipo = nombreEquipo;
		}
		else if (nombreEquipo == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un nombre de equipo v�lido");
		}
		
		if (alumnoColeccion != null) {
			this.alumnoColeccion = alumnoColeccion;
		}
		else if (alumnoColeccion == null) {
			throw new EquipoException("[ERROR]Por favor, introduce un grupo de alumnos v�lido");
		}
	}
	
	public Equipo() {
		
	}
	
	/**
	 * Añadir alumno por parametros de objetos.
	 * @param alumno
	 */
	public void addAlumno(Alumno alumno) {		
		
		if (alumno != null) {
			if (alumnoColeccion.contains(alumno)) {
				 //exception//
			}
			else {
				alumnoColeccion.add(alumno);
			}
		}
		else {
			throw new EquipoException("[ERROR]Por favor, introduce un grupo de alumnos v�lido");
		}
	}
	
	/**
	 * Añadir alumno por parametro de builder
	 * @param nombre
	 * @param dni
	 */
	public void addAlumno(String nombre, String dni) {
		Alumno alumno= new Alumno(nombre, dni);
		if (this.alumnoColeccion != null) {
			if (alumnoColeccion.contains(alumno)) {
				 throw new EquipoException("[ERROR] Imposible a�adir al alumno");
			}
			else {
				alumnoColeccion.add(alumno);
			}
		}
		else {
			 throw new EquipoException("[ERROR] Imposible a�adir al alumno");
		}
	}
	/**
	 * Borrar un alumno <b>EXISTENTE</b> del equipo.
	 * @param alumno
	 */
	
	public void deleteAlumno(Alumno alumno) {
		if (!alumnoColeccion.contains(alumno)) {
			throw new EquipoException("[ERROR] No se puede borrar el alumno.");
		}else {
			alumnoColeccion.remove(alumno);
		}
	}
	
	/**
	 * Metodo para buscar un alumno en un equipo.
	 * @param alumno
	 * @throws Exception
	 * Devuelve null si existe pero no esta en el equipo.
	 */
	   public void perteneceEquipo(Alumno alumno) throws Exception {
	        Alumno resultado=null;
	        if(alumno != null) {
	            if(alumnoColeccion.contains(alumno)) {
	                resultado= alumno;
	            }
	        }
	        throw new EquipoException("Se ha producido una Excepcion inesperada, el campo Alumno no puede estar a null");
	    }
	   
	   
	    public void mostrarListaEquipo(Collection<Alumno> alumno) throws Exception {
	        if (alumno != null) {
	            alumno.forEach(System.out::println);
	        }else {
	            throw new EquipoException("Se ha producido una excepci�n inesperada");
	        }
	    }
	    
	    /**
	     * M�todo para imprimir un ArrayList 
	     * usando un bucle for
	     *
	     * @return
	     */
	
	    public void imprimirListaEquipo(ArrayList<Alumno> alumno) {
	    	for (int i=0; i<alumno.size();i++) {
	    		System.out.println(alumno.get(i).getNombre());
	    		System.out.println(alumno.get(i).getDni());
	    	}
	    }
	    
	   /* Uni�n de equipos. El m�todo lo llamar� un equipo y se le pasar� por par�metro
	    el otro equipo con el que se quiere unir. Devuelve un equipo formado por los
	    alumnos de ambos equipos*/
	    /**
	     * Método para unir dos equipos, se crea un equipo diferente, una 
	     * nueva collecion y se añaden los elementos de las dos listas,
	     * al ser una collections Hashset no nos ingresa los repetidos.
	     * posteriormente se añade al equipo nuevo, la coleccion.
	     * @param otroEquipo
	     * @return
	     * @throws Exception
	     */
	    
	    
	    public Equipo unionEquipos(Equipo otroEquipo) throws EquipoException {
	    	Equipo nuevo = new Equipo();
	    	
	    	if (otroEquipo!=null) {
	    	
	    	Set<Alumno> nuevoEquipo= new HashSet<>(nuevo.alumnoColeccion);
	    	
	    	
	    	nuevoEquipo.addAll(alumnoColeccion);
	    	nuevoEquipo.addAll(otroEquipo.alumnoColeccion);
	    	
	    	nuevo.setAlumnoColeccion(nuevoEquipo);
	    	
	    	}else {
	    		throw new EquipoException("Error se ha producido una excepcion inesperada");
	    	}
	    	    	
	    	return nuevo;
	    }
	   
	    public Equipo interseccionDeEquipos(Equipo otroEquipo) {
	    	Equipo nuevoEquipo= new Equipo();
	    	
	    	if(otroEquipo!= null) {
	    		Set<Alumno> nuevaLista = new HashSet<>();
	    		
	    		for (int i=0; i<this.alumnoColeccion.size(); i++) {
	    			
	    		}
	    	}
	    	
	    	return nuevoEquipo;
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
