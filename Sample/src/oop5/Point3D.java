package oop5;

public class Point3D extends Point2D {
	int z;

	
	//JVM에서 자동적으로 만들어준
	//public Point3d(){}
	
	//default constructor를 만들기 위해서 2D에 있는 default constructor를 호출합니다.
	
	@Override
	public String toString() {
//		return super.toString(); -> 2D의 toString을 실행할 예정
		return super.toString()+ ", Point3D = [z=" + z +"]";
		
	}
	public Point3D() {
		this(10000, 20000, 30000);
		System.out.println("Point3D() Constructor 수행");
	}


	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x,y,z) Constructor 수행");
	}
	
	
	
	
}
