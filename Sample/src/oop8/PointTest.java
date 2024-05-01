package oop8;

public class PointTest {
	public static void main(String[] args) {
		Point2D up = new Point3D();	//sub type instance를 super type에서 참조하는 거
		up.x = 100;
		up.y = 200;
		// up.z = 300;

		//원래 sub type의 instance를 원래 그 type으로 어찌고저찌고
		Point3D dn = (Point3D) up;
		dn.x = 1000;
		dn.y = 2000;
		dn.z = 3000;
	}
}
