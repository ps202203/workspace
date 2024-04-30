package oop5;

public class Point2D {
	int x;
	int y;
	
	public Point2D() {
		/*
		 * x = 10; y = 20;
		 */
		this(10, 20); //생성자에서 또 다른 생성자를 호출할 때는 먼저 호출
		System.out.println("Point2D() Constructor 수행");
	}
	
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) Constructor 수행");
	}


	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}