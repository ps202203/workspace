package sec01_accessmodifier.EX01_AccessModifierOfMemver.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMemver.pack1.A;

public class C {
	public void print() {
		//객체 생성
		A a = new A();
		
		//멤버 활용
		System.out.print(a.a + " ");
//		System.out.println(a.b + " ");	//다른 패키지 내의 클래스에서는 자식 클래스가 아닐 때는 public 접근 지정자만 사용 가능
//		System.out.println(a.c + " ");
//		System.out.println(a.d + " ");
		System.out.println();
	}
}
