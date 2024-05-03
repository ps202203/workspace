package execption;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try(NeMam nm = new NeMam()){
			System.out.println("try 블럭입니다");
		} catch(Exception e) {
			System.out.println("catch 블럭입니다");
		}
		System.out.println("종료합니다.");
	}
}
