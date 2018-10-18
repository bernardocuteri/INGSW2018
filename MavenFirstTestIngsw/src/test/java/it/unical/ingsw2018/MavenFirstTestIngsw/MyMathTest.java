package it.unical.ingsw2018.MavenFirstTestIngsw;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	private static MyMath math = new MyMath();

	@Before
	public void prepare() {
		System.out.println(math);
		System.out.println("Before");
	}
	
	@Test
	public void simpleFibonacciTest() {
		System.out.println("simpleFibonacciTest");
		assertEquals(5, math.fibonacci(4));
	}
	
	@Test
	public void exitConditionsFibonacciTest() {
		System.out.println("exitConditionsFibonacciTest");
		assertEquals(1, math.fibonacci(0));
		assertEquals(1, math.fibonacci(1));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void illegalArgumentTest() {
		System.out.println("illegalArgumentTest");
		math.fibonacci(-1);
	}
	
	@AfterClass
	public static void cleanup() {
		System.out.println("After class");
	}
	
	@Test
	public void distanceSimpleTest() {
		double dist = math.distance(10, 10, -10, -10);
		assertEquals(Math.sqrt(800), dist, 0.001);
	}
	
	@Test
	public void errorTest() {
		assertEquals(0.1+0.1+0.1, 0.3);
	}
}
