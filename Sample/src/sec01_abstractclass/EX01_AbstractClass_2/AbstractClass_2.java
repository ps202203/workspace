package sec01_abstractclass.EX01_AbstractClass_2;

abstract class A{
	abstract void abc();
}
class B extends A{
	void abc() {
		System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		//객체 생성
		A b1 = new B();
		A b2 = new B();
		
		//메서드 호출
		b1.abc();
		b2.abc();
		
		//객체 생성
		A a1 = new A() {
				void abc() {
					System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
				}
		};
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		//메서드 호출
		a1.abc();
		a2.abc();
		
	}
}
