package sec01_accessmodifier.EX01_AccessModifierOfMemver.pack1;

public class B {
	public void print() {
		//객체 생성
		A a = new A();	//다른 클래스의 인스턴스 멤버를 사용하기 위해 객체 생성
		
		//멤버 활용
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");	// 클래스 A같은 패키지
//		System.out.print(a.d + " ");	//private 접근 지정자로 지정된 필드는 접근 불가능
		System.out.println();
	}
}
