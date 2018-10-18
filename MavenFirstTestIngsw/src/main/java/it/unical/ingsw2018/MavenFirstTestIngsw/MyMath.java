package it.unical.ingsw2018.MavenFirstTestIngsw;

public class MyMath {
	
	/**
	 * Computes the fibonacci value at position index
	 * @param index position in the fibanacci sequence
	 * @return the fibonacci value at the specified index
	 */
	public int fibonacci(int index) {
		if(index < 0) {
			throw new IllegalArgumentException("Invalid fibonacci index "+index);
		}
		
		if (index == 1 || index == 0) {
			return 1;
		}
		
		int previous = 1;
		int previousPrevious = 1;
		int current = 0;
		for(int i = 2;i<=index;i++) {
			current = previous+previousPrevious;
			previousPrevious = previous;
			previous = current;
		}
		return current;
	}
	
	
	double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}

}
