package main.java.com.model.Ejercicio4.test;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import main.java.com.model.Ejercicio4.model.PaginaWeb;

class PaginaWebTest {

	@Test
	void testAddPagina() {
		PaginaWeb pagina1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020, 1, 10, 20, 22));
		PaginaWeb pagina2 = new PaginaWeb("www.pccomponentes.es", LocalDateTime.of(2021, 5, 10, 20, 22));
		PaginaWeb pagina3 = new PaginaWeb("www.google.es", LocalDateTime.of(2020, 1, 10, 20, 22));

	}

}
