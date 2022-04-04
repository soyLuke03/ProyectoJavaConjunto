package main.java.com.model.Ejercicio4.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.java.com.model.Ejercicio4.model.Historial;
import main.java.com.model.Ejercicio4.model.HistorialException;
import main.java.com.model.Ejercicio4.model.PaginaWeb;

class PaginaWebTest {

	@Test
	void testAddPagina() {
		PaginaWeb pagina1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020, 1, 10, 20, 22));
		PaginaWeb pagina2 = new PaginaWeb("www.pccomponentes.es", LocalDateTime.of(2021, 5, 10, 20, 22));
		PaginaWeb pagina3 = new PaginaWeb("www.google.es", LocalDateTime.of(2023, 1, 10, 20, 22));
		
		ArrayList<PaginaWeb> arrayPaginas= new ArrayList<>();
		
		
		Historial historial1 = new Historial(arrayPaginas);
		
		historial1.addWeb(pagina1);
		historial1.addWeb(pagina2);
		historial1.addWeb(pagina3);
		
		
		assertEquals(historial1.getNumeroPaginas(),3);

	}@Test
	void testAddPaginaFechaAnterior() {
		PaginaWeb pagina1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020, 1, 10, 20, 22));
		PaginaWeb pagina2 = new PaginaWeb("www.pccomponentes.es", LocalDateTime.of(2021, 5, 10, 20, 22));
		PaginaWeb pagina3 = new PaginaWeb("www.google.es", LocalDateTime.of(2020, 1, 10, 20, 22));
		
		ArrayList<PaginaWeb> arrayPaginas= new ArrayList<>();
		
		try {
		Historial historial1 = new Historial(arrayPaginas);
		
		historial1.addWeb(pagina1);
		historial1.addWeb(pagina2);
		historial1.addWeb(pagina3);
		
		assertFalse(false);
		
		}catch (HistorialException exception) {
			assertTrue(true);
			
		}

	}


}
