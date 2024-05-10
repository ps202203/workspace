package sec01_lamdaexpression.EX02_FunctionToLamdaExpression;

interface A{	//입력X, 리턴X
	void method1();
}
interface B{	//입력O, 리턴X
	void method2(int a);
}
interface C{	//입력X, 리턴O
	int method3();
}
interface D{	//입력O, 리턴O
	double method4(int a, double b);
}


public class FunctionToLamdaExpression {
	public static void main(String[] args) {
		//인터페이스 함수 구현 -> 람다식
		//1. 입력X, 리턴X
		//1-1. 익명 이너 클래스 방식
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력x 리턴x 함수");
			}
		};
		
		//1-2. 람다식 표현
		A a2 = () ->System.out.println("입력x 리턴x 함수");
		
		//2. 입력O, 리턴X
		//2-1. 익명 이너 클래스 방식
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력O 리턴x 함수");
			}
		};
		
		//2-2. 람다식 표현
		B b2 = a -> System.out.println("입력O 리턴x 함수");
		
		//3. 입력X, 리턴O
		//3-1. 익명 이너 클래스 방식
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		
		//3-2.람다식 표현
		C c2 = () -> 4;
		
		//4. 입력O, 리턴O
		//4-1. 익명 이너 클래스 방식
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {
				return a+b;
			}
		};
		//4-2. 람다식 표현
		D d2 = (a, b) -> a+b;		
	}
}


























