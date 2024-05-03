package exception;

import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			runMethod();			
		} catch(Exception e) {
			
		}
	}

	private static void runMethod() throws IOException {
		throw new IOException("파일 처리 예외상황 발생~!!!");
	}
}
