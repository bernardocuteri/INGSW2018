package it.unical.ingsw.intermediate_test_a.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.ingsw.intermediate_test_a.model.Tris;

public class TrisBasicTest {
	
	private static Tris tris;
	
	@BeforeClass
	public static void init() {
		tris = new Tris();
	}
	
	@Before 
	public void reset() {
		tris.reset();
	}
	
	@Test
	public void winnerX() {
		tris.play(0, 0);
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 0);
		tris.play(2, 2);
		
		assertEquals(Tris.X, tris.getWinner());
		
	}
	
	@Test
	public void winnerO() {
		tris.play(1, 0);
		tris.play(0, 0);
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 0);
		tris.play(2, 2);
		assertEquals(Tris.O, tris.getWinner());
		
	}
	
	@Test
	public void pareggio() {
		tris.play(0, 0);
		tris.play(0, 1);
		tris.play(0, 2);
		tris.play(1, 0);
		tris.play(1, 1);
		tris.play(2, 0);
		tris.play(1, 2);
		tris.play(2, 2);
		tris.play(2, 1);
		assertEquals(Tris.PAREGGIO, tris.getWinner());
	}
	
	@Test
	public void falseAfterThreeMoves() {
		tris.play(0, 0);
		tris.play(1, 2);
		assertEquals(false, tris.play(2, 2));
		
	}

}
