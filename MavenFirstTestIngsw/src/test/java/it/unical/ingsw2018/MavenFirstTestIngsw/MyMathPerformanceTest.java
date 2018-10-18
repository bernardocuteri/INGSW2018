package it.unical.ingsw2018.MavenFirstTestIngsw;

import org.junit.Test;

public class MyMathPerformanceTest {

	private MyMath math = new MyMath();
	
	@Test(timeout = 10000)
	public void performanceTest1() {
		System.out.println(math.fibonacci(30));
	}
}
