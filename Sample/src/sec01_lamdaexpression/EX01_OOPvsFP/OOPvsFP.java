package sec01_lamdaexpression.EX01_OOPvsFP;

interface A{
	void abc();
}
interface A1{
	void abc(String a);
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {
		//1. 객체 지향 프로그래밍 문법 1
		A a1 = new B();
		a1.abc(); 	//메서드 내용
		
		//2. 객체 지향 프로그래밍 문법 2(익명 이너 클래스 사용)
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc(); //메서드 내용
		
		//3. 함수형 프로그래밍 문법(람다식)
		A a3 = () ->System.out.println("메서드 내용 3");
		a3.abc();
		
		A1 a4 = (a)	-> System.out.println(a + "님 안녕하세요~");
		a4.abc("홍제기");
	}
}