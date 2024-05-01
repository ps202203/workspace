package oop9;

public class ShapeTest {
	public static void main(String[] args) {
//		Circle c = new Circle();	//GC발생
//		c.area();
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}
	private static void printArea(Shape s) {
		s.area();
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이 " + c.r +"인 원의 넓이는 " + c.res +"입니다.");
		}else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("높이가 " + r.h + "고 가로가 " + r.w +"인 사각형의 넓이는 " + r.res + "입니다.");
		}else if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("높이가 " + t.h + "고 밑변이 " + t.w + "인 삼각형의 넓이는 " + t.res + "입니다.");
		}
	}
}