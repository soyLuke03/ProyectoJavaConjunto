package main.java.com.model.Ejercicio4.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {

	List<PaginaWeb> webs = new ArrayList<>();

	
	public Historial(List<PaginaWeb> listawebs) {
		listawebs=this.webs;
	}
	

		public void addWeb( String nombre, LocalDateTime horaVisita) {

			PaginaWeb pagina = new PaginaWeb(nombre, horaVisita);
		
		if(webs.get(webs.size()-1).getFechaQueSeCreo()!=null && pagina.getFechaQueSeCreo().isBefore(webs.get(webs.size()-1).getFechaQueSeCreo())) {
			webs.add(pagina);			
		}else {
			throw new HistorialExceptions("Se ha producido unaexcepcion inesperada");
		}
		
		

			
				
				
			}

		
		
		 
		/**
		 * 
		 * @param historial
		 */
		public void eliminarHistorialCompleto(List<PaginaWeb> historial) {
			historial.clear();
		}
		
		
		/**
		 * 
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
		
	}

