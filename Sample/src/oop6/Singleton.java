package oop6;

public class Singleton {
	private static Singleton singleton = null;	// 나 자신을 참조할 수 있는 변수
	private Singleton() {
	}
	
	//변수를 return해주는 getter
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
