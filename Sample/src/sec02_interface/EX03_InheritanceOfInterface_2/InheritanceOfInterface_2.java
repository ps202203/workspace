package sec02_interface.EX03_InheritanceOfInterface_2;

interface A{
	public abstract void abc();
}
interface B{
	void bcd();	//public abstract  자동 추가
}
class C implements A{
	public void abc() {
		//...
	}
}
//	public -> default 불가능
//class D implements B{
//	(public) void bcd() {}
//}

public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
