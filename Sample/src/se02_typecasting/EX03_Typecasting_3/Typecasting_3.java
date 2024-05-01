package se02_typecasting.EX03_Typecasting_3;

/* 캐스팅의 가능 여부를 확인할 수 있는 instanceof */

class A{}
class B extends A{}

public class Typecasting_3 {
	public static void main(String[] args) {
		//instanceof
		/*
		 * 참조 변수 instanceof 타입
		 * 참조 변수가 해당 타입으로 캐스팅할 수 있을 때 true, 그렇지 않을 때 false를 리턴
		 */
		A aa = new A();	
		A ab = new B();	//ab는 A를 갖고 있는데 B를 캐스팅할 수 있냐?(B는 자식클래스임)
		
		System.out.println(aa instanceof A);//true -> (A) aa 
		System.out.println(ab instanceof A);//true -> (A) ab
		
		System.out.println(aa instanceof B);//false -> (B) aa 가능? ㄴㄴ 불가능
		System.out.println(ab instanceof B);//true -> (B) ab 가능? ㄱㄴ
		
		if(aa instanceof B) {
			B b = (B)aa;
			System.out.println("aa를 B로 캐스팅했습니다.");
		}else {
			System.out.println("aa는 B타입으로 캐스팅이 불가능!!");
		}
		if(ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab를 B로 캐스팅했습니다.");
		}else {
			System.out.println("ab는 B타입으로 캐스팅이 불가능!!");
		}
		if("안녕" instanceof String) System.out.println("\"안녕\"은 String 클래스입니다.");
		
	
	}
}
