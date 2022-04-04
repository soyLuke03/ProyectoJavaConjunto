package main.java.com.model.Ejercicio4.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	
	private Integer numeroPaginas;
	List<PaginaWeb> webs = new ArrayList<>();

	
	public Historial(List<PaginaWeb> listawebs) {
		this.webs=listawebs;
	}
	
	
	public void annadirWebsSinComparar(PaginaWeb pagina) {
		webs.add(pagina);
	}
	/**
	 * Método para añadir una web al historial, esta se añadirá si la fecha es superior a la ultima web añadida.
	 * @param nombre
	 * @param horaVisita
	 */
		public void addWeb( PaginaWeb pagina) {

		if(webs.isEmpty())	{
			webs.add(pagina);
		}else if(webs.get(webs.size()-1).getFechaQueSeCreo()!=null && pagina.getFechaQueSeCreo().isAfter(webs.get(webs.size()-1).getFechaQueSeCreo())) {
			webs.add(pagina);			
		}else {
			throw new HistorialException("Se ha producido una excepcion inesperada");
		}				
				
			}

		/**
		 * Método para consultar el historial completo, nos devolverá el historial completo.
		 * @param historial
		 * @return 
		 * @throws Exception
		 */
		public ArrayList<PaginaWeb> consultarHistorialCompleto(ArrayList<PaginaWeb> historial) throws Exception {
	        if (historial != null) {
	           return historial;
	        }else {
	            throw new HistorialException("Se ha producido una excepcion inesperada");
	        }
	    }
		 
		/**
		 * Método para eliminar el historial completo, utilizamos la funcion clear para limpiarlo completamente.
		 * @param historial
		 */
		public void eliminarHistorialCompleto(List<PaginaWeb> historial) {
			historial.clear();
		}
		
		
		/**
		 * Método para eliminar el historial de un día.
		 * @param historial
		 * @param dia
		 */
		public void eliminarHistorialDeUnDia(List<PaginaWeb> historial, LocalDateTime dia) {
			List<PaginaWeb> historialAeliminar = new ArrayList<>();
			
			for (int i = 0; i<historial.size();i++) {
				if (historial.get(i).getFechaQueSeCreo() == dia) {
					historialAeliminar.add(historial.get(i));
				}
			}
			
			historial.removeAll(historialAeliminar);
			
		}

		public Integer getNumeroPaginas() {
			return webs.size();
		}

		public void setNumeroPaginas(Integer numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}


		@Override
		public String toString() {
			return "Historial [numeroPaginas=" + numeroPaginas + ", webs=" + webs + "]";
		}
		
	}

