package sec02_interface.EX04_CreateObjectOfInterface_1;

interface A{
	int a = 3;
	void abc();
}
class B implements A{
	public void abc() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		//객체 생성
		A b1 = new B();
		A b2 = new B();
		
		//메서드 호출
		b1.abc();
		b2.abc();
		
		/////////////////////////////////////////////////
		//CreateObjectOfInterface_2
		////////////////////////////////////////////////
		
		//객체 생성
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		//메서드 호출
		a1.abc();
		a2.abc();
	}
}
