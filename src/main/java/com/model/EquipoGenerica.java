package main.java.com.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class EquipoGenerica<T> {
	
	private T nombreEquipo;
	private Collection<T> alumnoColeccion= new ArrayList<>();
	
	
	//Constructor//
	
		/**
		 * Este <b>BUILDER</b> genera un equipo con todos los datos.
		 * Si un dato no aparace, lanza una excepci�n.
		 * @param nombreEquipo
		 * @param alumnoColeccion
		 */
		public EquipoGenerica(T nombreEquipo, Collection<T> alumnoColeccion) {
			
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
	
		public EquipoGenerica() {
			
		}
		
		/**
		 * Añadir alumno por parametros de objetos.
		 * @param alumno
		 */
		public void addAlumno(T alumno) {		
			
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
		public void addAlumno(T nombre, T dni) {
			T alumno= (T) new AlumnoGenerico<T>(nombre, dni);
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
		
		public void deleteAlumno(T alumno) {
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
		   public void perteneceEquipo(T alumno) throws Exception {
		        Alumno resultado=null;
		        if(alumno != null) {
		            if(alumnoColeccion.contains(alumno)) {
		                resultado= (Alumno) alumno;
		            }
		        }
		        throw new EquipoException("Se ha producido una Excepcion inesperada, el campo Alumno no puede estar a null");
		    }
		
		   public void mostrarListaEquipo(Collection<T> alumno) throws Exception {
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
		
		    public void imprimirListaEquipo(ArrayList<T> alumno) {
		    	for (int i=0; i<alumno.size();i++) {
		    		System.out.println(((AlumnoGenerico<T>) alumno.get(i)).getNombre()+" " + ((AlumnoGenerico<T>) alumno.get(i)).getDni());
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
	    
	    
	    public Set<T> unionEquipos(EquipoGenerica otroEquipo) throws EquipoException {
	    	EquipoGenerica<T> nuevo = new EquipoGenerica<>();
	    	
	    	if (otroEquipo!=null) {
	    	
	    	Set<T> nuevoEquipo= new HashSet<>();
	    	
	    	
	    	nuevoEquipo.addAll(alumnoColeccion);
	    	nuevoEquipo.addAll(otroEquipo.getAlumnoColeccion());
	    	
	    	nuevo.setAlumnoColeccion(nuevoEquipo);
	    	
	    	return nuevoEquipo;
	    	}else {
	    		throw new EquipoException("Error se ha producido una excepcion inesperada");
	    	}
	    }
	    
	    /**
	     * Método interseccion de equipos, compara las listas de los dos equipos
	     * y devuelve solamente una nueva coleccion con los elementos repetidos en las dos listas.
	     * @param otroEquipo
	     * @return
	     */
	   
	    public Collection<T> interseccionDeEquipos(EquipoGenerica<T> otroEquipo) {
	    	EquipoGenerica<T> nuevoEquipo= new EquipoGenerica("LuqueTeam", new ArrayList<>());

	    	List<T> alumnos = (List<T>) this.alumnoColeccion;
	    	
	    	
	    	
	    	if(otroEquipo!= null) {
	    		List<T> interSet = new ArrayList<>();
	    		
	    		for (int i=0; i<this.alumnoColeccion.size(); i++) {
	    			if(otroEquipo.getAlumnoColeccion().contains(alumnos.get(i))) {
	    				interSet.add(alumnos.get(i));
	    				
	    				
	    				
	    				
	    			}nuevoEquipo.setAlumnoColeccion(interSet);
	    			
	    			

	    			
	    		}
	    	}else {
	    		throw new EquipoException("Se ha producido una excepcion");
	    	}
	    	return nuevoEquipo.getAlumnoColeccion();
	    }
	
	
	


public T getNombreEquipo() {
	return nombreEquipo;
}

public void setNombreEquipo(T nombreEquipo) {
	this.nombreEquipo = nombreEquipo;
}

public Collection<T> getAlumnoColeccion() {
	return alumnoColeccion;
}

public void setAlumnoColeccion(Collection<T> alumnoColeccion) {
	this.alumnoColeccion = alumnoColeccion;
}

@Override
public int hashCode() {
	return Objects.hash(alumnoColeccion, nombreEquipo);
}

@Override
public boolean equals(Object obj) {
	boolean sonIguales= false;
	EquipoGenerica<T> other = (EquipoGenerica<T>) obj;
	
	if(obj != null) {
		if (this.nombreEquipo.equals(other.getNombreEquipo()))
			sonIguales = true;
		
		}
	return sonIguales;
	
	}

@Override
public String toString() {
	return (String) (nombreEquipo= nombreEquipo);
}





}