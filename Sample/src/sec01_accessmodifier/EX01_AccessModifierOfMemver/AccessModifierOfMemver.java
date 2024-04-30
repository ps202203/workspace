package sec01_accessmodifier.EX01_AccessModifierOfMemver;

import sec01_accessmodifier.EX01_AccessModifierOfMemver.pack1.A;
import sec01_accessmodifier.EX01_AccessModifierOfMemver.pack1.B;
import sec01_accessmodifier.EX01_AccessModifierOfMemver.pack2.C;
import sec01_accessmodifier.EX01_AccessModifierOfMemver.pack2.D;

public class AccessModifierOfMemver {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
