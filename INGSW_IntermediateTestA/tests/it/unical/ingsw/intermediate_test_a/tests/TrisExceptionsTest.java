package it.unical.ingsw.intermediate_test_a.tests;

import org.junit.Test;

import it.unical.ingsw.intermediate_test_a.model.InvalidPlayException;
import it.unical.ingsw.intermediate_test_a.model.Tris;

public class TrisExceptionsTest {

	@Test(expected=InvalidPlayException.class)
	public void moveAfterFinish() {
		Tris tris = new Tris();
		tris.play(0, 0);
		tris.play(0, 1);
		tris.play(1, 1);
		tris.play(2, 0);
		tris.play(2, 2);
		tris.play(2, 1);
		
	}
	
	@Test(expected=InvalidPlayException.class)
	public void moveSameCell() {
		Tris tris = new Tris();
		tris.play(0, 0);
		tris.play(0, 0);
		
	}
}
