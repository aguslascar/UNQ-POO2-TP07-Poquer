package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {

	Jugada jugada;
	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	Carta c5;
	
	Jugada jugada2;
	PokerStatus verificador;
	@BeforeEach
	void setUp() throws Exception {
		c1 = mock(Carta.class);
		c2 = mock(Carta.class);
		c3 = mock(Carta.class);
		c4 = mock(Carta.class);
		c5 = mock(Carta.class);
		jugada = new Jugada(c1,c2,c3,c4,c5);
	}

	@Test
	void testJugadaPoker() {
		when(c1.valor()).thenReturn(8);
		when(c2.valor()).thenReturn(8);
		when(c3.valor()).thenReturn(8);
		when(c4.valor()).thenReturn(8);
		when(c5.valor()).thenReturn(5);
		assertEquals("Poker", jugada.tipoDeJugada());
	}
	
	@Test
	void testJugadaTrio() {
		when(c1.valor()).thenReturn(8);
		when(c2.valor()).thenReturn(8);
		when(c3.valor()).thenReturn(8);
		when(c4.valor()).thenReturn(5);
		when(c5.valor()).thenReturn(3);
		assertEquals("Trio", jugada.tipoDeJugada());
	}
	
	@Test
	
	void testJugadaColor() {
		when(c1.palo()).thenReturn("Picas");
		when(c2.palo()).thenReturn("Picas");
		when(c3.palo()).thenReturn("Picas");
		when(c4.palo()).thenReturn("Picas");
		when(c5.palo()).thenReturn("Picas");
		assertEquals("Color", jugada.tipoDeJugada());
	}
	
	@Test
	
	void testNoEsNingunaJugada() {
		when(c1.palo()).thenReturn("Picas");
		assertNull(jugada.tipoDeJugada());
	}

}
