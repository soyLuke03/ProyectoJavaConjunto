package test.java.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;
/**
 * Test de Alumno y Equipo, nos servirán para saber si nuestro codigo
 * funciona correctamente.
 * @author vicen
 *
 */
class EquipoTest {
	
	@Test
	void testEquipoVacioAlPrincipio() {
		Equipo equipoA = new Equipo();
		
		assertEquals(equipoA.getAlumnoColeccion().size(), 0);
	}

	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo();
		equipoA.addAlumno("Sevillano", "56565689M");
		
		assertEquals(equipoA.getAlumnoColeccion().size(), 1);
		
	}

	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		Equipo equipoA = new Equipo();
		Alumno alumno = new Alumno("Sevillano", "56565689M");
		equipoA.addAlumno(alumno);
		
		assertEquals(equipoA.getAlumnoColeccion().size(), 1);
	}

	
}
