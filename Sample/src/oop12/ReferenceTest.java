package oop12;

class RefMe extends Object{
	public RefMe() {
		System.out.println("태어남~");
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("낮의 빛이 밤의 어둠의 깊이를 알게 뭐냐~");
	}
}

public class ReferenceTest extends Object{
	public static void main(String[] args) {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		System.gc();
		r2 = null;
		System.gc();	//thread를 통한
		System.out.println("종료");
		
	}
}
