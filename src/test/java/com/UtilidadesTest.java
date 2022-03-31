package test.java.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.java.utils.Utilidades;

class UtilidadesTest {

	@Test
	void testInvierteImpar() {
		Integer[] listaEnteros = new Integer[3];
		listaEnteros[0]=1;
		listaEnteros[1]=3;
		listaEnteros[2]=5;
		
		Integer[] invertida = Utilidades.reverseArray(listaEnteros);
		
		assertEquals(invertida[0], 5);
		assertEquals(invertida[1], 3);
		assertEquals(invertida[2], 1);

	}



@Test
void testInviertePar() {
	Integer[] listaEnteros = new Integer[4];
	listaEnteros[0]=1;
	listaEnteros[1]=3;
	listaEnteros[2]=5;
	listaEnteros[3]=10;
	
	Integer[] invertida = Utilidades.reverseArray(listaEnteros);
	
	assertEquals(invertida[0], 10);
	assertEquals(invertida[1], 5);
	assertEquals(invertida[2], 3);
	assertEquals(invertida[3], 1);
	

}

@Test
void testInvierteListVacia() {
	Integer[] listaEnteros = new Integer[0];

	
	Integer[] invertida = Utilidades.reverseArray(listaEnteros);
	
	assert(invertida.length==0);
	

}
@Test
void testInvierteListNula() {
	Integer[] listaEnteros = null;

	
	Integer[] invertida = Utilidades.reverseArray(listaEnteros);
	
	assertEquals(invertida, null);
	

}

@Test
void testCadenaNoVacia() {
	String[] saludo = "Hola que tal".split(" ");

	Utilidades.reverseArray(saludo);

	assertEquals(saludo[0], "Hola");
	assertEquals(saludo[1], "que");
	assertEquals(saludo[2], "tal");
	

}
}

