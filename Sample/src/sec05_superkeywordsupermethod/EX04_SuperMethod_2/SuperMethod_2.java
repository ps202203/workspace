package sec05_superkeywordsupermethod.EX04_SuperMethod_2;

class A{
	A(){
		this(3);
		System.out.println("A 생성자1");
	}
	A(int a){
		System.out.println("A 생성자2");
	}
}
class B extends A{
	B(){
		this(3);
		System.out.println("B 생성자1");
	}
	B(int a){
		//컴파일러가 자동으로 호출 
		//super();
		System.out.println("B 생성자2");
	}
}
public class SuperMethod_2 {
	public static void main(String[] args) {
		// A 객체 생성
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();
		
		//B 객체 생성
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);
	}
}
