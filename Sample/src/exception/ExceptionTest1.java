package exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());	//new NullPointerException();
			System.out.println("try 종료. 예외 발생하지 않았음.");
		} catch(NullPointerException | ArithmeticException e) {
			System.out.println("NullPointerException 처리...");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {	//예외가 발생했든, 발생하지 않았든 수행 ex.resource 정리작업.
			//예외 발생 여부에 상관없이 무조건 실행
			System.out.println("finally블럭");
		}
		
		System.out.println("종료");
	}
}
