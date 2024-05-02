package sec02_abstractmodifier.EX01_AbstractModifier_1;

class Animal{
	void cry() {}
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}


public class AbstractModifier_1 {
	public static void main(String[] args) {
		//객체 생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//메서드 호출
		animal1.cry();	//야옹
		animal2.cry();	//멍멍		
	}
}
