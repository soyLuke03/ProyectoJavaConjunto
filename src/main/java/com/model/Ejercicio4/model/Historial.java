package main.java.com.model.Ejercicio4.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historial {

	List<PaginaWeb> webs = new ArrayList<>();
	private Integer contador=0;
	
	public Historial(List<PaginaWeb> listawebs) {
		listawebs=this.webs;
	}
	

		public void addWeb( String nombre, LocalDateTime horaVisita) {
			boolean esPrimera =true;
			
		PaginaWeb pagina = new PaginaWeb(nombre, horaVisita);
		if(esPrimera) {
			webs.add(pagina);
			esPrimera=false;
			this.contador++;
		}
			
				
				
			}
		
	}

