package test.java.com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import test.java.utils.Capicua;

class CapicuaTest {

	@Test
	void testEsCapicuaInteger() {
		assertTrue(Capicua.esCapicua(11));
		assertFalse(Capicua.esCapicua(25));
	}

	@Test
	void testEsCapicuaDouble() {
		assertTrue(Capicua.esCapicua(11.11));
		assertFalse(Capicua.esCapicua(25.89));
	}
	@Test
	void testEsCapicuaString() {
		assertTrue(Capicua.esCapicua("11"));
		assertFalse(Capicua.esCapicua("52"));
	}
}
