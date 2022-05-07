package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarta {
	
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta(4, "Corazones");
		carta2 = new Carta(10, "Treboles");
		carta3 = new Carta(13, "Diamantes");
		carta4 = new Carta(10, "Picas");
		carta5 = new Carta(2, "Diamantes");
	}

	@Test
	void testSonMismoValor() {
		assert(carta2.valor() == carta4.valor());
	}
	
	@Test
	void testSonMismoPalo() {
		assert(carta3.esMismoPalo(carta5));
	}
	
	@Test
	void testEsMayorQueOtra() {
		assert(carta2.esMayor(carta5));
	}
	
	@Test
	void testNoEsMayorQueOtra() {
		assertFalse(carta5.esMayor(carta3));
	}
}
