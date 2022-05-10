package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPokerStatusJugadas {
	
	PokerStatus verificador;
	Jugada mano1;
	Jugada mano2;

	@BeforeEach
	void setUp() throws Exception {
		verificador = new PokerStatus();
		mano1 = mock(Jugada.class);
		mano2 = mock(Jugada.class);
		
	}

	@Test
	void testPokerVsTrio() {
		/**
		 * Testeo que mano1 tiene poker y mano2 tiene trio. Gana poker.
		 */
		when(mano1.tipoDeJugada()).thenReturn("Poker");
		when(mano2.tipoDeJugada()).thenReturn("Trio");
		assertEquals(mano1, verificador.verificar(mano1, mano2));
	}
	
	@Test
	void testEmpatePoker() {
		/**
		 * Testeo dos manos que tienen poker. Gana mano1 por tener poker de ases.
		 */
		when(mano1.tipoDeJugada()).thenReturn("Poker");
		when(mano2.tipoDeJugada()).thenReturn("Poker");
		when(mano1.valorDeMano()).thenReturn(5);
		when(mano2.valorDeMano()).thenReturn(8);
		assertEquals(mano1, verificador.verificar(mano1, mano2));
	}
	
	

}
