package oop9;

public class Circle extends Shape{
	int r = 10;

	@Override
	void area() {
		res = r*r*3.14;
	}
	
}
