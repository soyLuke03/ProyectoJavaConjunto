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
		
		if(pagina.getFechaQueSeCreo().isBefore(webs.get(webs.size()-1).getFechaQueSeCreo())&& webs.get(webs.size()-1).getFechaQueSeCreo()!=null) {
			webs.add(pagina);			
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
		public void eliminarHistorialDeUnDia(List<PaginaWeb> historial, LocalDate dia) {
			historial.remove(dia);
		}
		
	}

