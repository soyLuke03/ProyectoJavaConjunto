package main.java.com.model.Ejercicio4.model;

import java.time.LocalDateTime;

public class PaginaWeb implements Comparable<PaginaWeb> {

	
	private String url;
	private LocalDateTime fechaVisita;
	
	
	public  PaginaWeb(String url, LocalDateTime horaVisita) {
		url= this.url;
		horaVisita= this.fechaVisita;
		
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public LocalDateTime getFechaQueSeCreo() {
		return fechaVisita;
	}


	public void setFechaQueSeCreo(LocalDateTime fechaQueSeCreo) {
		this.fechaVisita = fechaQueSeCreo;
	}


	@Override
	public int compareTo(PaginaWeb web) {
		
		int resultado= 0;
		if (web!= null && this.fechaVisita!=null) {
			if(this.fechaVisita.isBefore(web.getFechaQueSeCreo())) {
				resultado= 1;
			}else if (this.fechaVisita.isAfter(web.getFechaQueSeCreo())) {
				resultado=-1;
			}
		}
		return resultado;
	}
	
}
