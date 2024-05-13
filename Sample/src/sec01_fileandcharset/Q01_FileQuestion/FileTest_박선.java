package sec01_fileandcharset.Q01_FileQuestion;

import java.io.File;

public class FileTest_박선 {
	public static void main(String[] args) {
		// C:/dev/file_test/ 디렉토리 생성
		File tempDir = new File("C:/dev/file_test/");
		if(!tempDir.exists())
			tempDir.mkdir();
	
		// C:/dev/file_test/ 디렉토리에 파일 생성 후
		String[] fnames = {"0510.txt", "0511.txt", "0512.txt", "0513.txt"};
		for(String fname: fnames) {
			File file = new File(tempDir, fname);
			file.mkdir();
		}
		
		/*	print할 때 파일이름을 변경
		 * int index = fname.lastIndexOf(".");
		 * System.out.println(fname.getName().substring(0,index);
		 */
		
		// C:/dev/file_test/ 파일들을 읽어와서 확장자를 제거하는 형태로 파일의 이름을 변경	
		File[] filenames = tempDir.listFiles();
		for(File fname: filenames) {
			int index = fname.getName().lastIndexOf(".");
			fname.renameTo(new File(tempDir, fname.getName().substring(0, index)));
		}
		
		// 파일 이름 출력
		for(File fname: tempDir.listFiles()) {
			System.out.println(fname.getName());
		}
	}
}
