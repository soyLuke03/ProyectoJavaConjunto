package test.java.com;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.model.Alumno;
import main.java.com.model.Equipo;
import main.java.com.model.EquipoException;
/**
 * Test de Alumno y Equipo, nos servir�n para saber si nuestro codigo
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
	
	@Test
	 void TestUnionEquiposVacios() throws EquipoException  {
		
		Equipo e1 =new Equipo();
		Equipo e2 =new Equipo();
		
		try {
			assertTrue(e1.unionEquipos(e2).size()==0);
			
		}catch (EquipoException exception) {
			assert(false);
		}
			
		}
	
	@Test
	void testUnionEquiposVacios() {
		Alumno alumno1= new Alumno("Luque", "154552566x");
		Alumno alumno2= new Alumno("Vicente", "154588566x");
		Alumno alumno3= new Alumno("Juan", "154557766x");
		
		
		Equipo equipo1 = new Equipo();
		equipo1.addAlumno(alumno1);
		equipo1.addAlumno(alumno2);
		
		Equipo equipo2 = new Equipo();
		equipo2.addAlumno(alumno2);
		equipo2.addAlumno(alumno3);
		try {
			assertTrue(equipo1.unionEquipos(equipo2).size()==3);
			
			
		}catch (EquipoException exception) {
			assert(false);
		}
		
		
		
	}
	@Test
	void testInterseccion() {
		Alumno alumno1= new Alumno("Luque", "15");
		Alumno alumno2= new Alumno("Vicente", "154588566x");
		Alumno alumno3= new Alumno("Luque", "15");
		Alumno alumno4= new Alumno("antonio", "15");
		
		
		Equipo equipo1 = new Equipo();
		equipo1.addAlumno(alumno1);
		equipo1.addAlumno(alumno4);
		
		Equipo equipo2 = new Equipo();
		equipo2.addAlumno(alumno2);
		equipo2.addAlumno(alumno3);
		try {
			assertTrue(equipo1.interseccionDeEquipos(equipo2).size()==1);
			
			
		}catch (EquipoException exception) {
			assert(false);
		}
		
		
		
	}
}
