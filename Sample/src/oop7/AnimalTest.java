package oop7;

public class AnimalTest {
	public static void main(String[] args) {
		
//		  Animal a1 = new Animal(); System.out.println(a1);
//		  
//		  if(a1 instanceof Bird) { System.out.println("다운 캐스팅 됩니다"); }else {
//		  System.out.println("다운 캐스팅 되지 않아요"); } // Bird b1 = (Bird)a1;
		 
		
//		
//		  Bird b1 = new Bird(); System.out.println(b1);
//		  
//		  Animal a2 = b1; //업캐스팅 System.out.println(a2);
//		  
//		  Bird b2 = (Bird)a2; if(b2 instanceof Bird) { System.out.println(b2); } if(b2
//		  instanceof Condor) { Condor c1 = (Condor)b2; }else {
//		  System.out.println("Bird인스턴스는 Condor로 다운캐스팅 불가합니다."); }
		 
		
		Duck d1 = new Duck();
		Bird b3 = d1;
		System.out.println(b3);
		
//		if(b3 instanceof Condor) {
//			Condor c2 = (Condor)b3;
//			System.out.println(c2);
//		}else {
//			System.out.println("Duck타입의 인스턴스는 Condor로 다운캐스팅 불가");
	}	
}
